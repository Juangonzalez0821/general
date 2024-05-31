package logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import conexion.Conexion;

public class TarjetaRecargar {

    private String idTarjeta;
    private String valorARecargar;

    public String getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(String idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getValorARecargar() {
        return valorARecargar;
    }

    public void setValorARecargar(String valorARecargar) {
        this.valorARecargar = valorARecargar;
    }

    public void recargar() {
        try (Connection conexion = new Conexion().conectar()) {
            int estado = consultaEstado(conexion);
            double valorActual = Double.parseDouble(consultarSaldo(conexion));
            double valorRecarga = Double.parseDouble(valorARecargar);

            String query;
            if (estado == 1 && valorActual > 0) {
                query = "UPDATE tarjeta SET pasajes_prestados = 0, saldoTarjeta = saldoTarjeta + ? WHERE IdTarjeta = ?";
            } else {
                query = "UPDATE tarjeta SET saldoTarjeta = saldoTarjeta + ? WHERE IdTarjeta = ?";
            }

            try (PreparedStatement pstmt = conexion.prepareStatement(query)) {
                pstmt.setDouble(1, valorRecarga);
                pstmt.setString(2, idTarjeta);
                pstmt.executeUpdate();
            }
        } catch (SQLException e) {
            // Manejar excepciones de SQL de manera adecuada
            e.printStackTrace();
        }
    }

    private int consultaEstado(Connection conexion) throws SQLException {
        String query = "SELECT PersonalizadaTarjeta FROM tarjeta WHERE IdTarjeta = ?";
        try (PreparedStatement statement = conexion.prepareStatement(query)) {
            statement.setString(1, idTarjeta);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getInt("PersonalizadaTarjeta");
                }
            }
        }
        return 0; // Devolver un valor predeterminado si no se encuentra ninguna información
    }

    private String consultarSaldo(Connection conexion) throws SQLException {
        String query = "SELECT saldoTarjeta FROM tarjeta WHERE IdTarjeta = ?";
        try (PreparedStatement statement = conexion.prepareStatement(query)) {
            statement.setString(1, idTarjeta);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getString("saldoTarjeta");
                }
            }
        }
        return "0"; // Devolver un valor predeterminado si no se encuentra ninguna información
    }
}
