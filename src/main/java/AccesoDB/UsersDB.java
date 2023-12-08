package AccesoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersDB {

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

    public static void insertUser(String userID, String userName, String userLastName, String userEmail,
            String userType, String userAddress, String userTelephone, String userPassword, String alreadyLogged) {
        try ( Connection connection = getConexion();  PreparedStatement preparedStatement = connection.prepareStatement(
                "INSERT INTO Progra2ProyectoFinal.dbo.Users "
                + "(userID, userName, userLastName, userEmail, userType, userAddress, userTelephone, userPassword, alreadyLogged) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)")) {

            // Set parameters in the prepared statement
            preparedStatement.setString(1, userID);
            preparedStatement.setString(2, userName);
            preparedStatement.setString(3, userLastName);
            preparedStatement.setString(4, userEmail);
            preparedStatement.setString(5, userType);
            preparedStatement.setString(6, userAddress);
            preparedStatement.setString(7, userTelephone);
            preparedStatement.setString(8, userPassword);
            preparedStatement.setString(9, alreadyLogged);

            // Execute the insert
            int rowsAffected = preparedStatement.executeUpdate();

            // Check if rows were inserted successfully
            if (rowsAffected > 0) {
                System.out.println("Se insertó correctamente el usuario con ID " + userID);

                // Si se crea correctamente, crea el carrito vacío, mismo cartID que el userID (simplificará cosas)
                Cart.insertCart(userID, userID);

            } else {
                System.out.println("No se pudo insertar el usuario con ID " + userID);
            }

        } catch (SQLException e) {
            System.out.println("Error al insertar el usuario: " + e.getMessage());
        }
    }

    public static boolean validarCredenciales(String nombreUsuario, String contrasena) {
        String jdbcUrl = "jdbc:sqlserver://LaCompu\\SQLEXPRESS:1433;database=Progra2ProyectoFinal;"
                + "encrypt=true;trustServerCertificate=true";
        String usuarioBD = "progra2";
        String contrasenaBD = "123456";

        try ( Connection conexion = DriverManager.getConnection(jdbcUrl, usuarioBD, contrasenaBD)) {
            String consulta = "SELECT userID FROM Users WHERE userName = ? AND userPassword = ?";
            try ( PreparedStatement statement = conexion.prepareStatement(consulta)) {
                statement.setString(1, nombreUsuario);
                statement.setString(2, contrasena);

                try ( ResultSet resultSet = statement.executeQuery()) {
                   return resultSet.next();
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al validar las credenciales: " + e.getMessage());
            return false;
        }
    }
    
    public static String getUserType(String userID) {
        String userType = null;
        try (Connection connection = getConexion();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT userType FROM Progra2ProyectoFinal.dbo.Users WHERE userID = ?")) {

            preparedStatement.setString(1, userID);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    userType = resultSet.getString("userType");
                }
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener el userType: " + e.getMessage());
        }

        return userType;
    }
}
