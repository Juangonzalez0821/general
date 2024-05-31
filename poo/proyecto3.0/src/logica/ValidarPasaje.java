package logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexion.Conexion;

public class ValidarPasaje {

    private String idTarjeta;
    private String saldo;

    public String getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(String idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String consultarSaldo() {
        Conexion conecta = new Conexion();
        Connection conexion = conecta.conectar();

        try {
            // Crear la consulta SQL con un PreparedStatement para evitar la inyección SQL
            String consulta = "SELECT SaldoTarjeta FROM tarjeta WHERE idtarjeta = ?";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, idTarjeta);

            // Ejecutar la consulta y obtener el resultado
            ResultSet resultado = statement.executeQuery();

            // Si hay resultados, asignar el saldo
            if (resultado.next()) {
                saldo = resultado.getString("SaldoTarjeta");
            }

            // Cerrar recursos
            resultado.close();
            statement.close();
            conecta.close();
        } catch (SQLException e) {
            // Manejar errores de SQL
            e.printStackTrace();
        }

        return saldo; // Devolver el saldo obtenido
    }
}
