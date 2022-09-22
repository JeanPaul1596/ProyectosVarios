package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CitasRepositorio {
  public int obtenerIdCita(){
      int IdCita=1;
      try{
          String consulta="SELECT IDCITA FROM CITAS ORDER BY IDCITA DESC FETCH FIRST ROW ONLY";
          PreparedStatement sentencia= Conexion.getConexion().prepareStatement(consulta);
          ResultSet rs = sentencia.executeQuery();
          while(rs.next() != false){
              IdCita = rs.getInt("idcita");
              IdCita += 1;
          }
      }
      catch(Exception e){
          System.out.println(e.getMessage());
      }
      return IdCita;
  }  
  
  //Crear una cita en base de datos "CREATE"
  /*public Boolean crearCitas(Citas citas){
      try{
          String consulta="INSERT INTO CITAS(IDCITAS,NOMBRECOMPLETO,CEDULA,EMAIL,TELEFONO,NOMBREMASCOTA,FECHANACI,SEXO,TIPOMASCOTA,RAZA,FECHA,HORA,DESCRIPCION)"
                  + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
          PreparedStatement sentencia= Conexion.getConexion().prepareStatement(consulta);
          sentencia.setInt(1, obtenerIdCita());
          sentencia.setString(2, citas.getNombreCompleto());
          sentencia.setString(3, citas.getCedula());
          sentencia.setString(4, citas.getEmail());
          sentencia.setInt(5, citas.getTelefono());
          sentencia.setString(6, citas.getNombreMascota());
          sentencia.setString(7, citas.getFechaNaci());
          sentencia.setString(8, citas.getSexo());
          sentencia.setString(9, citas.getTipoMascota());
          sentencia.setString(10, citas.getRaza());
          sentencia.setString(11, citas.getFecha());
          sentencia.setString(12, citas.getHora());
          sentencia.setString(13, citas.getDescripcion());
          sentencia.executeUpdate();
          
      }
      catch(SQLException e){
          System.out.println(e.getMessage());
          return false;
      }
      return true;
  }
  
//Leer todas las citas "READ"
    public List<Citas> leerCitas(){
        List<Citas> listaCitas = new ArrayList<>();
        try{
            String consulta = "SELECT IDCITA, NOMBRECOMPLETO, CEDULA, EMAIL, TELEFONO, NOMBREMASCOTA, FECHANACI, SEXO, TIPOMASCOTA, RAZA, FECHA, HORA, DESCRIPCION"
                    + " FROM CITAS";
            PreparedStatement sentencia = Conexion.getConexion().prepareStatement(consulta);
            ResultSet rs = sentencia.executeQuery();
            while(rs.next()){
                Citas citasNodo = new Citas();
                citasNodo.setIdCitas(rs.getInt("IDCITA"));
                citasNodo.setNombreCompleto(rs.getString("NOMBRECOMPLETO"));
                citasNodo.setCedula(rs.getString("CEDULA"));
                citasNodo.setEmail(rs.getString("EMAIL"));
                citasNodo.setTelefono(rs.getInt("TELEFONO"));
                citasNodo.setNombreMascota(rs.getString("NOMBREMASCOTA"));
                citasNodo.setFechaNaci(rs.getString("FECHANACI"));
                citasNodo.setSexo(rs.getString("SEXO"));
                citasNodo.setTipoMascota(rs.getString("TIPOMASCOTA"));
                citasNodo.setRaza(rs.getString("RAZA"));
                citasNodo.setFecha(rs.getString("FECHA"));
                citasNodo.setHora(rs.getString("HORA"));
                citasNodo.setDescripcion(rs.getString("DESCRIPCION"));
                listaCitas.add(citasNodo);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return listaCitas;
    }
//Este método sirve para actualizar los valores de una cita en base de datos "UPDATE"
    public Boolean actualizarCita(Citas citas){
        try{
            String consulta = "UPDATE CITAS SET NOMBRECOMPLETO = ?, CEDULA = ?, EMAIL = ?, TELEFONO = ?, NOMBREMASCOTA = ?, FECHANACI = ?, "
                    + " SEXO = ?, TIPOMASCOTA = ?, RAZA = ?, FECHA = ?, HORA = ?, DESCRIPCION = ? WHERE IDCITA = ?";
            PreparedStatement sentencia = Conexion.getConexion().prepareStatement(consulta);
            sentencia.setString(1, citas.getNombreCompleto());
            sentencia.setString(2, citas.getCedula());
            sentencia.setString(3, citas.getEmail());
            sentencia.setInt(4, citas.getTelefono());
            sentencia.setString(5, citas.getNombreMascota());
            sentencia.setString(6, citas.getFechaNaci());
            sentencia.setString(7, citas.getSexo());
            sentencia.setString(8, citas.getTipoMascota());
            sentencia.setString(9, citas.getRaza());
            sentencia.setString(10, citas.getFecha());
            sentencia.setString(11, citas.getHora());
            sentencia.setString(12, citas.getDescripcion());
            sentencia.executeUpdate();           
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
   //Este método nos permite eliminar una cita en base de datos "DELETE"
    public Boolean eliminarCita(Citas citas){
        try{
            String consulta = "DELETE FROM CITAS WHERE IDCITA = ?";
            PreparedStatement sentencia = Conexion.getConexion().prepareStatement(consulta);
            sentencia.setInt(1, citas.getIdCitas());           
            sentencia.executeUpdate();           
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }*/
 

}
