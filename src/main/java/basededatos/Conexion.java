package basededatos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
     // Variable que guarda la conexión
    private static Connection conexion;

    // Este método se usará para conectarse a la base de datos
    public static Connection getConexion() {
        try {
            // Datos de la conexión
            String url = "jdbc:sqlserver://localhost:1433;databaseName=CajeroSimulador";
            String usuario = "sa"; // Cambiar si tu usuario es otro
            String contraseña = "tu_contraseña_aquí"; // Cambiar por tu contraseña

            // Se conecta
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return conexion;
    }
}
