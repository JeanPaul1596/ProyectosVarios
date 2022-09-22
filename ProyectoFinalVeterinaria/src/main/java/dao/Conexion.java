package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
   private static Conexion conexion; 
   private static final String BASEDEDATOSURL="jdbc:derby://localhost:1527/Veterinaria/user=Veterinaria;password=Pethouse";
   private static Connection connectionBD=null;
   
   private Conexion() throws Exception{
       try{
           Class.forName("org.apache.derby.jdbc.ClientDriver").getDeclaredConstructor().newInstance();
           connectionBD=DriverManager.getConnection(BASEDEDATOSURL);
       }
       catch(Exception e){
           throw e;
       }
   }
   public static synchronized Connection getConexion(){
       try{
           if(connectionBD==null)
               conexion=new Conexion();
       }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
       return connectionBD;
   }
}
