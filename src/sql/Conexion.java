/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author Frognas
 */
public class Conexion {

    private final String DRIVER = "org.postgresql.Driver";
    private final String URL = "jdbc:postgresql://localhost:5432/ExamenFinal"; //Cambien lo ultimo por el nombre de su base
    private final String USERNAME = "postgres";
    private final String PASSWORD = "ronald18"; //Pongan aqui la contra.
    
    private Connection connection;
    
    public Conexion() {
        connection = null;
        try{
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        }catch(Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");

    }
    public Connection getConnection(){
        return connection;
    }
    
}
