package AccesoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Cart {

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

    public static void insertCart(String cartID, String userID) {
        try ( Connection connection = getConexion();  PreparedStatement preparedStatement = connection.prepareStatement(
                "INSERT INTO Progra2ProyectoFinal.dbo.Carts "
                + "(cartID, userID) "
                + "VALUES (?, ?)")) {

            // Set parameters in the prepared statement
            preparedStatement.setString(1, cartID);
            preparedStatement.setString(2, userID);


            // Execute the insert
            int rowsAffected = preparedStatement.executeUpdate();

            // Check if rows were inserted successfully
            if (rowsAffected > 0) {
                System.out.println("Se insertó correctamente el elemento en el carrito con ID " + cartID);
            } else {
                System.out.println("No se pudo insertar el elemento en el carrito con ID " + cartID);
            }

        } catch (SQLException e) {
            System.out.println("Error al insertar en el carrito: " + e.getMessage());
        }
    }

    //Este jala la informacion que luego hay que presentar al usuario, segun lo que hay en el carrito
    public static void queryCartDetails(String cartID, String productID, String userID) {
        try ( Connection connection = getConexion();  PreparedStatement preparedStatement = connection.prepareStatement(
                "SELECT A.cartID, A.productID, A.userID, B.productName, A.productCartQty, B.productPrice, A.productCartQty * B.productPrice as TotalPrice "
                + "FROM Progra2ProyectoFinal.dbo.Carts AS A "
                + "INNER JOIN Progra2ProyectoFinal.dbo.Products AS B ON A.productID = B.productID "
                + "WHERE A.cartID = ? AND A.productID = ? AND A.userID = ?")) {

            // Set parameters in the prepared statement
            preparedStatement.setString(1, cartID);
            preparedStatement.setString(2, productID);
            preparedStatement.setString(3, userID);

            // Execute the query
            try ( ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    System.out.println("CartID: " + resultSet.getString("cartID"));
                    System.out.println("ProductID: " + resultSet.getString("productID"));
                    System.out.println("UserID: " + resultSet.getString("userID"));
                    System.out.println("ProductName: " + resultSet.getString("productName"));
                    System.out.println("ProductCartQty: " + resultSet.getInt("productCartQty"));
                    System.out.println("ProductPrice: " + resultSet.getDouble("productPrice"));
                    System.out.println("TotalPrice: " + resultSet.getDouble("TotalPrice"));
                    System.out.println("--------------------");
                }
            }

        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }
    }

}
