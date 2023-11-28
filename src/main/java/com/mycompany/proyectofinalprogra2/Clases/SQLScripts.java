package com.mycompany.proyectofinalprogra2.Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLScripts {

    public static Connection getConexion() {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:sqlserver://LaCompu\\SQLEXPRESS:1433;database=CRUDAutomoviles;"
                            + "encrypt=true;trustServerCertificate=true", "alejandro", "123456");
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public static void performInsert(String productID, String productName, double productPrice,
            String productType, String productCategory, String productTrade,
            int productQtyInventory, int productQtySale, int productOnCar, String productTax) {
        try (
                // Obtiene la conexión a la base de datos
                Connection connection = getConexion();
                // Crea una declaración para ejecutar la consulta
                Statement statement = connection.createStatement()) {

            // Construye la consulta SQL
            String sql = "INSERT INTO Progra2ProyectoFinal.dbo.Products ([productID],[productName],[productPrice],[productType],[productCategory],[productTrade],[productQtyInventory],[productQtySale],[productOnCar],[productTax]) VALUES ('" + productID + "','" + productName + "'," + productPrice + ",'" + productType + "','" + productCategory + "','" + productTrade + "',"+ productQtyInventory + "," + productQtySale + "," + productOnCar + ",'" + productTax + "')";

            // Imprime la sentencia SQL antes de ejecutarla
            System.out.println("SQL a ejecutar: " + sql);

            // Ejecuta la sentencia
            int rowsAffected = statement.executeUpdate(sql);

            // Verifica si se insertaron filas correctamente
            if (rowsAffected > 0) {
                System.out.println("Se insertó correctamente.");
            } else {
                System.out.println("No se pudo insertar el registro.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
