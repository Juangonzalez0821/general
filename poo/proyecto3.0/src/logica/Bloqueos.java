package logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import conexion.Conexion;

public class Bloqueos {

    private int estado;

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(String idTarjeta) {
        this.idTarjeta = idTarjeta;
    }
    private String idTarjeta = "1010000175076619";

    public int consultaEstado() {
        Conexion conecta = new Conexion();
        Connection conexion = conecta.conectar();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            // Prepare the SQL query
            String query = "SELECT BloqueoTarjeta FROM tarjeta WHERE IdTarjeta = ?";
            statement = conexion.prepareStatement(query);
            statement.setString(1, idTarjeta);

            // Execute the query
            resultSet = statement.executeQuery();

            // Retrieve the result
            if (resultSet.next()) {
                estado = resultSet.getInt("BloqueoTarjeta");
            }
        } catch (SQLException e) {
            // Handle any SQL errors
            e.printStackTrace();
        } finally {
            // Close resources in finally block to ensure they're always closed
            try {
                if (resultSet != null)
                    resultSet.close();
                if (statement != null)
                    statement.close();
                conecta.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return estado;
    }

    public void bloquear() {
        int estado = consultaEstado();

        if (estado == 1) {
            // Show a message if the card is already blocked
            JOptionPane.showMessageDialog(null, "La tarjeta ya está bloqueada.");
        } else {
            Conexion conecta = new Conexion();
            Connection conexion = conecta.conectar();
            PreparedStatement statement = null;

            try {
                // Prepare the SQL update statement
                String query = "UPDATE tarjeta SET BloqueoTarjeta = 1 WHERE IdTarjeta = ?";
                statement = conexion.prepareStatement(query);
                statement.setString(1, idTarjeta);

                // Execute the update
                int rowsUpdated = statement.executeUpdate();

                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(null, "Tarjeta bloqueada correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo bloquear la tarjeta.");
                }
            } catch (SQLException e) {
                e.printStackTrace(); // Handle SQL exceptions
            } finally {
                // Close resources in finally block
                try {
                    if (statement != null)
                        statement.close();
                    conecta.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void desbloquear() {
        int estado = consultaEstado();

        if (estado == 0) {
            // Show a message if the card is already blocked
            JOptionPane.showMessageDialog(null, "La tarjeta ya está desbloqueada.");
        } else {
            Conexion conecta = new Conexion();
            Connection conexion = conecta.conectar();
            PreparedStatement statement = null;

            try {
                // Prepare the SQL update statement
                String query = "UPDATE tarjeta SET BloqueoTarjeta = 0 WHERE IdTarjeta = ?";
                statement = conexion.prepareStatement(query);
                statement.setString(1, idTarjeta);

                // Execute the update
                int rowsUpdated = statement.executeUpdate();

                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(null, "Tarjeta desbloqueada correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo bloquear la tarjeta.");
                }
            } catch (SQLException e) {
                e.printStackTrace(); // Handle SQL exceptions
            } finally {
                // Close resources in finally block
                try {
                    if (statement != null)
                        statement.close();
                    conecta.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
 