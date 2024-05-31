package logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import conexion.Conexion;

public class NuevaTarjeta {
    public long VenderTarjeta() {
        Conexion conecta = new Conexion();
        Connection conexion = conecta.conectar(); // Obtener la conexión

        long idRegistro = -1; // Inicializamos el ID con un valor por defecto

        if (conexion != null) { // Verificar que la conexión se haya establecido correctamente
            String sql = "INSERT INTO tarjeta (PersonalizadaTarjeta, ClienteId, fecha_ultimo_uso, pasajes_prestados) VALUES (?, NULL, ?, 0)";

            try (PreparedStatement pstmt = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                pstmt.setString(1, "0"); // Valor para PersonalizadaTarjeta
                pstmt.setString(2, java.time.LocalDate.now().toString()); // Valor para fecha_ultimo_uso

                int filasAfectadas = pstmt.executeUpdate();
                System.out.println("Filas afectadas: " + filasAfectadas);

                // Obtener el ID generado por la base de datos
                if (filasAfectadas > 0) {
                    try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                        if (generatedKeys.next()) {
                            idRegistro = generatedKeys.getLong(1);
                        }
                    } catch (SQLException e) {
                        System.out.println("Error al obtener el ID generado: " + e.getMessage());
                    }
                }

                JOptionPane.showMessageDialog(null, "Se creó el registro con ID: " + idRegistro);
            } catch (SQLException e) {
                System.out.println("Error al ejecutar la sentencia SQL: " + e.getMessage());
                JOptionPane.showMessageDialog(null, "No se creó el registro");
            } finally {
                conecta.close(); // Desconectar la conexión después de ejecutar la sentencia
            }
        } else {
            System.out.println("Error: No se pudo conectar a la base de datos.");
        }

        return idRegistro;
    }
}
