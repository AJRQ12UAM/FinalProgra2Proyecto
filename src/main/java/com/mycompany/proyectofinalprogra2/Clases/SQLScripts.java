package com.mycompany.proyectofinalprogra2.Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLScripts {

    public static Connection getConexion() {
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlserver://LaCompu\\SQLEXPRESS:1433;database=CRUDAutomoviles;" + "encrypt=true;trustServerCertificate=true", "alejandro", "123456");
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}

