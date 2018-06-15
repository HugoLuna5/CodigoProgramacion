/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.programacion.conexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Properties;

/**
 *
 * @author HugoLuna
 */
public class DB {

    //codigoProgramacion
    public static Connection codigoPro = null;
    public static String Url = "jdbc:mysql://localhost:3306/codigoProgramacion";

    

    public static Connection getConection() {

        try {
            // create a mysql database connection
            Class.forName("com.mysql.jdbc.Driver");
            codigoPro = (Connection) DriverManager.getConnection(Url, "root", "");
            System.out.println("Conexion exitosa");

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return codigoPro;
    }

}
