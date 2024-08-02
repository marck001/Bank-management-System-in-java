/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.sql.*;

/**
 *
 * @author Marck
 */
public class Conexion {
    
    public static Connection realizarConexion() throws ClassNotFoundException, SQLException {
        String url, user, password;
        Class.forName("com.mysql.cj.jdbc.Driver");
        url = "jdbc:mysql://localhost:3306/eurekabank";
        user = "root";
        password = "";
        return DriverManager.getConnection(url, user, password); 
        
    }
}
//kbro
//holaaa xdddd
