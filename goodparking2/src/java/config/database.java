/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author usuario
 */
public class database {
    private String USERNAME = "root";
    private String PASSWORD = "Cri123456789";
    private String HOST = "localhost";
    private String PORT = "3306";
    private String DATABASE = "goodparking";
    private String CLASSNAME = "com.mysql.cj.jdbc.Driver";
    private String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private Connection con;
    
    public database() {
        try {
            Class.forName(CLASSNAME);
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (Exception e) {
            System.err.println("ERROR: "+ e);
        } 
    }    
    public Connection getConexion(){
        return con;
    }
    
}
