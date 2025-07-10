package basededatos;
import java.sql.Connection; //
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Usuario;

public class UsuarioDAO {
    
    // Método que busca un usuario en la base de datos usando DNI y PIN
    public Usuario buscarUsuario(String dni, String pin) {
        Usuario usuario = null;

        try {
            Connection conn = Conexion.getConexion();

            String sql = "SELECT * FROM Usuarios WHERE dni = ? AND pin = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, dni);
            stmt.setString(2, pin);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("idUsuario");
                String nombre = rs.getString("nombre");
                double saldo = rs.getDouble("saldo");

                // Creamos un objeto Usuario con los datos encontrados
                usuario = new Usuario(id, nombre, dni, pin, saldo);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Error al buscar usuario: " + e.getMessage());
        }

        return usuario;
    }
}
