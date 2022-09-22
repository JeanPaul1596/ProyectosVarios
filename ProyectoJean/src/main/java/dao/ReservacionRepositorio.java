/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeanp
 */

//CREAR CRUD
public class ReservacionRepositorio {
   public int obtenerIdPersona(){
        int idPersona = 1;
        try{
            String consulta = "SELECT IDPERSONA FROM DATOSRESERVACION ORDER BY IDPERSONA DESC FETCH FIRST ROW ONLY";
            PreparedStatement sentencia = Conexion.getConexion().prepareStatement(consulta);
            ResultSet rs = sentencia.executeQuery();
            while(rs.next() != false){
                idPersona = rs.getInt("idpersona");
                idPersona += 1;
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return idPersona;
    }
    
    //CREATE
    public Boolean crearPersona(DatosReservacion datosreservacion){
        try{
            String consulta = "INSERT INTO DATOSRESERVACION (IDPERSONA, NOMBRE, APELLIDO1, APELLIDO2, IDENTIFICACION, NACIONALIDAD, NUMERODEPERSONAS, DIAS)"
                    + " VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement sentencia = Conexion.getConexion().prepareStatement(consulta);
            sentencia.setInt(1, obtenerIdPersona());
            sentencia.setString(2, datosreservacion.getNombre());
            sentencia.setString(3, datosreservacion.getApellido1());
            sentencia.setString(4, datosreservacion.getApellido2());
            sentencia.setString(5, datosreservacion.getIdentificacion());
            sentencia.setString(6, datosreservacion.getNacionalidad());
            sentencia.setString(7, datosreservacion.getNumerodepersonas());
            sentencia.setString(8, datosreservacion.getDias());            
            sentencia.executeUpdate();
            
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    
    //READ
    public DatosReservacion leerPersona(String identificacion){
        DatosReservacion datosreservacion = null;
        try{
            String consulta = "SELECT IDPERSONA, NOMBRE, APELLIDO1, APELLIDO2, IDENTIFICACION, NACIONALIDAD, NUMERODEPERSONAS, DIAS"
                    + " FROM DATOSRESERVACION WHERE IDENTIFICACION = ?";
            PreparedStatement sentencia = Conexion.getConexion().prepareStatement(consulta);
            sentencia.setString(1, identificacion);
            ResultSet rs = sentencia.executeQuery();
            while(rs.next()){
                datosreservacion = new DatosReservacion();
                datosreservacion.setIdPersona(rs.getInt("IDPERSONA"));
                datosreservacion.setNombre(rs.getString("NOMBRE"));
                datosreservacion.setApellido1(rs.getString("APELLIDO1"));
                datosreservacion.setApellido2(rs.getString("APELLIDO2"));
                datosreservacion.setIdentificacion(rs.getString("IDENTIFICACION"));
                datosreservacion.setNacionalidad(rs.getString("NACIONALIDAD"));
                datosreservacion.setNumerodepersonas(rs.getString("NUMERODEPERSONAS"));
                datosreservacion.setDias(rs.getString("DIAS"));
                
                 
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());            
        }
        return datosreservacion;
    }
    
    //READ
    public List<DatosReservacion> leerPersonas(){
        List<DatosReservacion> listaPersonas = new ArrayList<>();
        try{
            String consulta = "SELECT IDPERSONA, NOMBRE, APELLIDO1, APELLIDO2, IDENTIFICACION, NACIONALIDAD, NUMERODEPERSONAS, DIAS FROM DATOSRESERVACION";
            PreparedStatement sentencia = Conexion.getConexion().prepareStatement(consulta);
            ResultSet rs = sentencia.executeQuery();
            while(rs.next()){
                DatosReservacion datosreservacion = new DatosReservacion();
                datosreservacion.setIdPersona(rs.getInt("IDPERSONA"));
                datosreservacion.setNombre(rs.getString("NOMBRE"));
                datosreservacion.setApellido1(rs.getString("APELLIDO1"));
                datosreservacion.setApellido2(rs.getString("APELLIDO2"));
                datosreservacion.setIdentificacion(rs.getString("IDENTIFICACION"));
                datosreservacion.setNacionalidad(rs.getString("NACIONALIDAD"));
                datosreservacion.setNumerodepersonas(rs.getString("NUMERODEPERSONAS"));
                datosreservacion.setDias(rs.getString("DIAS"));
                listaPersonas.add(datosreservacion);
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());            
        }
        return listaPersonas;
    }
    
    //UPDATE
    public Boolean actualizarPersona(DatosReservacion datosreservacion){
        try{
            String consulta = "UPDATE DATOSRESERVACION SET NOMBRE = ?, APELLIDO1 = ?, APELLIDO2 = ?, IDENTIFICACION = ?, NACIONALIDAD = ?, NUMERODEPERSONAS = ?, DIAS = ?"
                + " WHERE IDPERSONA = ?";
            PreparedStatement sentencia = Conexion.getConexion().prepareStatement(consulta);
            sentencia.setString(1, datosreservacion.getNombre());
            sentencia.setString(2, datosreservacion.getApellido1());
            sentencia.setString(3, datosreservacion.getApellido2());
            sentencia.setString(4, datosreservacion.getIdentificacion());
            sentencia.setString(5, datosreservacion.getNacionalidad());
            sentencia.setString(6, datosreservacion.getNumerodepersonas());
            sentencia.setString(7, datosreservacion.getDias());
            sentencia.setInt(8, datosreservacion.getIdPersona());
            sentencia.executeUpdate();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    
    //DELETE
    public Boolean eliminarPersona(DatosReservacion datosreservacion){
        try{
            String consulta = "DELETE FROM DATOSRESERVACION WHERE IDPERSONA = ?";
            PreparedStatement sentencia = Conexion.getConexion().prepareStatement(consulta);
            sentencia.setInt(1, datosreservacion.getIdPersona());
            sentencia.executeUpdate();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
}