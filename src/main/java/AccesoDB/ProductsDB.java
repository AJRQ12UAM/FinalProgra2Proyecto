package AccesoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductsDB {

    private static final String URL = "jdbc:sqlserver://LaCompu\\SQLEXPRESS:1433;database=Progra2ProyectoFinal;"
            + "encrypt=true;trustServerCertificate=true";
    private static final String USER = "progra2";
    private static final String PASSWORD = "123456";

    public static Connection getConexion() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException ex) {
            System.out.println("Error al establecer la conexión: " + ex.getMessage());
            return null;
        }
    }

    public static void performInsert(String productID, String productName, double productPrice,
            String productType, String productCategory, String productTrade,
            int productQtyInventory, int productQtySale, int productOnCar, String productTax) {
        try ( Connection connection = getConexion();  Statement statement = connection.createStatement()) {

            // Construye la consulta SQL de inserción
            String insertSql = "INSERT INTO Progra2ProyectoFinal.dbo.Products "
                    + "([productID],[productName],[productPrice],[productType],[productCategory],"
                    + "[productTrade],[productQtyInventory],[productQtySale],[productOnCar],[productTax]) "
                    + "VALUES ('" + productID + "','" + productName + "'," + productPrice + ",'"
                    + productType + "','" + productCategory + "','" + productTrade + "',"
                    + productQtyInventory + "," + productQtySale + "," + productOnCar + ",'" + productTax + "')";

            // Imprime la sentencia SQL de inserción antes de ejecutarla
            System.out.println("SQL a ejecutar (Inserción): " + insertSql);

            // Ejecuta la sentencia de inserción
            int rowsAffected = statement.executeUpdate(insertSql);

            // Verifica si se insertaron filas correctamente
            if (rowsAffected > 0) {
                System.out.println("Se insertó correctamente.");
            } else {
                System.out.println("No se pudo insertar el registro.");
            }

            // Llama al método para obtener y mostrar los valores actuales
            printCurrentValues();

            // Llama al método para obtener y mostrar la información de un producto específico
            printProductInfo(productID);

        } catch (SQLException e) {
            System.out.println("Error al realizar la inserción: " + e.getMessage());
        }
    }

    public static void printCurrentValues() {
        try ( Connection connection = getConexion();  Statement statement = connection.createStatement()) {

            // Realiza la consulta para obtener los valores actuales
            String selectSql = "SELECT * FROM Progra2ProyectoFinal.dbo.Products";
            ResultSet resultSet = statement.executeQuery(selectSql);

            // Imprime los valores actuales
            System.out.println("Valores actuales de la tabla Products:");
            while (resultSet.next()) {
                System.out.println("productID: " + resultSet.getString("productID")
                        + ", productName: " + resultSet.getString("productName")
                        + ", productPrice: " + resultSet.getDouble("productPrice")
                        + ", productType: " + resultSet.getString("productType")
                        + ", productCategory: " + resultSet.getString("productCategory")
                        + ", productTrade: " + resultSet.getString("productTrade")
                        + ", productQtyInventory: " + resultSet.getInt("productQtyInventory")
                        + ", productQtySale: " + resultSet.getInt("productQtySale")
                        + ", productOnCar: " + resultSet.getInt("productOnCar")
                        + ", productTax: " + resultSet.getString("productTax"));
            }

        } catch (SQLException e) {
            System.out.println("Error al imprimir los valores actuales: " + e.getMessage());
        }
    }

    public static void printProductInfo(String productID) {
        try {
            // Declare and initialize the Connection variable
            try ( Connection connection = getConexion();  PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM Progra2ProyectoFinal.dbo.Products WHERE productID = ?")) {

                // Establece el parámetro en la sentencia preparada
                preparedStatement.setString(1, productID);

                // Ejecuta la consulta
                ResultSet resultSet = preparedStatement.executeQuery();

                // Imprime la información del producto específico
                System.out.println("\nInformación del producto con ID " + productID + ":");
                while (resultSet.next()) {
                    System.out.println("productID: " + resultSet.getString("productID")
                            + ", productName: " + resultSet.getString("productName")
                            + ", productPrice: " + resultSet.getDouble("productPrice")
                            + ", productType: " + resultSet.getString("productType")
                            + ", productCategory: " + resultSet.getString("productCategory")
                            + ", productTrade: " + resultSet.getString("productTrade")
                            + ", productQtyInventory: " + resultSet.getInt("productQtyInventory")
                            + ", productQtySale: " + resultSet.getInt("productQtySale")
                            + ", productOnCar: " + resultSet.getInt("productOnCar")
                            + ", productTax: " + resultSet.getString("productTax"));
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al imprimir la información del producto: " + e.getMessage());
        }
    }

    public static void reduceProductQtyInventoryAndIncreaseQtySale(String productID, int qtyToSale) {
        try ( Connection connection = getConexion();  PreparedStatement preparedStatement = connection.prepareStatement(
                "UPDATE Progra2ProyectoFinal.dbo.Products SET productQtyInventory = productQtyInventory - ?, productQtySale = productQtySale + ? WHERE productID = ?")) {

            // Set parameters in the prepared statement
            preparedStatement.setInt(1, qtyToSale);
            preparedStatement.setInt(2, qtyToSale);
            preparedStatement.setString(3, productID);

            // Execute the update
            int rowsAffected = preparedStatement.executeUpdate();

            // Check if rows were updated successfully
            if (rowsAffected > 0) {
                System.out.println("Se redujo correctamente la cantidad en inventario y se incrementó la cantidad de venta para el producto con ID " + productID);
            } else {
                System.out.println("No se pudo realizar la operación para el producto con ID " + productID);
            }

            // Call the method to print current values
            printCurrentValues();

        } catch (SQLException e) {
            System.out.println("Error al realizar la operación: " + e.getMessage());
        }
    }

    public static void updateProductField(String productID, String fieldName, String newValue) {
        try ( Connection connection = getConexion();  PreparedStatement preparedStatement = connection.prepareStatement(
                "UPDATE Progra2ProyectoFinal.dbo.Products SET [" + fieldName + "] = ? WHERE productID = ?")) {

            // Set parameters in the prepared statement
            preparedStatement.setString(1, newValue);
            preparedStatement.setString(2, productID);

            // Execute the update
            int rowsAffected = preparedStatement.executeUpdate();

            // Check if rows were updated successfully
            if (rowsAffected > 0) {
                System.out.println("Se actualizó correctamente el campo " + fieldName
                        + " para el producto con ID " + productID);
            } else {
                System.out.println("No se pudo actualizar el campo " + fieldName
                        + " para el producto con ID " + productID);
            }

            // Call the method to print current values
            printCurrentValues();

        } catch (SQLException e) {
            System.out.println("Error al actualizar el campo " + fieldName
                    + " para el producto con ID " + productID + ": " + e.getMessage());
        }
    }

    public static void deleteProduct(String productID) {
        try ( Connection connection = getConexion();  PreparedStatement preparedStatement = connection.prepareStatement(
                "DELETE FROM Progra2ProyectoFinal.dbo.Products WHERE productID = ? AND productOnCar <> 0")) {

            // Set parameters in the prepared statement
            preparedStatement.setString(1, productID);

            // Execute the delete
            int rowsAffected = preparedStatement.executeUpdate();

            // Check if rows were deleted successfully
            if (rowsAffected > 0) {
                System.out.println("Se eliminó correctamente el producto con ID " + productID);
            } else {
                System.out.println("No se pudo eliminar el producto con ID " + productID + " o no cumple con los criterios");
            }

        } catch (SQLException e) {
            System.out.println("Error al eliminar el producto: " + e.getMessage());
        }
    }
}
