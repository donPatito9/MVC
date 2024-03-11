/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.conexion;

import java.sql.*;
/**
 *
 * @author Robinson
 */
//La clase Conexion.java será quien se comunique con la base de datos
public class Conexion {
    static String bd = "EvaDos";
    static String login = "root";
    static String password = "";
    static String url = "jdbc:mysql://localhost:3306/"+bd;
    Connection conn = null;
    
    public Conexion() {
    try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       conn = DriverManager.getConnection(url, login, password);
       
       if(conn != null){
          System.out.println("Coneccion a base de datos" + bd + "Ok");
       }
    }catch(SQLException e) {
          System.out.println(e);
    }catch(ClassNotFoundException e){
          System.out.println(e);
    }catch(Exception e){
          System.out.println(e);
        }
    }
    public Connection getConnection(){
      return conn;
    }
    public void desconectar(){
      conn = null;
    }
}
