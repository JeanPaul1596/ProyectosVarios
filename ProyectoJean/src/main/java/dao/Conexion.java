/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author jeanp
 */


public class Conexion {
    private static Conexion conexion;
    private static final String BASEDEDATOSURL = "jdbc:derby://localhost:1527/Proyecto;user=administrador;password=administrador";
    private static Connection connectionBD = null;
    
    private Conexion() throws Exception{
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver").getDeclaredConstructor().newInstance();
            connectionBD = DriverManager.getConnection(BASEDEDATOSURL);
        }
        catch(Exception e){
            throw e;
        }
    }
    
    public static synchronized Connection getConexion(){
        try
        {
            if(connectionBD == null)
                conexion = new Conexion();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return connectionBD;
    }
    
}
