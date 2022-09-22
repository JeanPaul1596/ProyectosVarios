/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioWeb;

import dao.DatosReservacion;
import dao.ReservacionRepositorio;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonReader;
import javax.json.JsonWriter;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author jeanp
 */
@Path("datosreservacion")
@RequestScoped
public class DatosreservacionResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of DatosreservacionResource
     */
    public DatosreservacionResource() {
    }

   @GET
    @Path("/datosreservacions")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPersonas(){
        try{
            ReservacionRepositorio reservacionrepositorio = new ReservacionRepositorio();
            List<DatosReservacion> listaPersonas = reservacionrepositorio.leerPersonas();
            JsonArrayBuilder arregloDatosReservacion = Json.createArrayBuilder();
            for(DatosReservacion datosreservacion : listaPersonas){
                JsonObjectBuilder jsonObjectBuilder = Json.createObjectBuilder();
                JsonObject jsonObject = jsonObjectBuilder
                        .add("nombre", datosreservacion.getNombre())
                        .add("apellido1", datosreservacion.getApellido1())
                        .add("apellido2", datosreservacion.getApellido2())
                        .add("nacionalidad", datosreservacion.getNacionalidad())
                        .add("numerodepersonas", datosreservacion.getNumerodepersonas())
                        .add("dias", datosreservacion.getDias())
                        .build();
                arregloDatosReservacion.add(jsonObject);
            }
            JsonObjectBuilder jsonObjectBuilder2 = Json.createObjectBuilder();
            JsonObject jsonFinal = jsonObjectBuilder2.add("datosreservacions", arregloDatosReservacion).build();
            StringWriter jsonString = new StringWriter();
            JsonWriter jsonWriter = Json.createWriter(jsonString);
            jsonWriter.writeObject(jsonFinal);
            return Response.ok(jsonString.toString()).build();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            String resultado = "{ \"error\": \"Ocurrió un error \"" + e.getMessage();
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(resultado).build();
        }
    }
    
    @POST
    @Path("/agregarDatosReservacion")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response ingresarPersona(String content){
        try{
            JsonObject jsonObject;
            JsonReader jsonReader = Json.createReader(new StringReader(content));
            
            jsonObject = jsonReader.readObject();
            
            DatosReservacion datosreservacion = new DatosReservacion();
            ReservacionRepositorio personaRepositorio = new ReservacionRepositorio();
            datosreservacion.setNombre(jsonObject.getString("nombre"));
            datosreservacion.setApellido1(jsonObject.getString("apellido1"));
            datosreservacion.setApellido2(jsonObject.getString("apellido2"));
            datosreservacion.setIdentificacion(jsonObject.getString("identificacion"));
            datosreservacion.setNacionalidad(jsonObject.getString("nacionalidad"));
            datosreservacion.setNumerodepersonas(jsonObject.getString("numerodepersonas"));
            datosreservacion.setDias(jsonObject.getString("dias"));
            
            personaRepositorio.crearPersona(datosreservacion);
            return Response.ok("{ \"operacionExitosa\": 1").build();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            String resultado = "{ \"error\": \"Ocurrió un error \"" + e.getMessage();
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(resultado).build();
        }
    }
}