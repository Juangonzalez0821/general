package logica;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.swing.JOptionPane;

public class TarjetaPersonalizar {

    private String nombrePropietario;
    private int identificacionPropietario;
    private String telefonoDeContacto;
    private Date fechaDeNacimiento;
    private String sexo;
    private String numeroTarjeta;

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setIdentificacionPropietario(int identificacionPropietario) {
        this.identificacionPropietario = identificacionPropietario;
    }

    public int getIdentificacionPropietario() {
        return identificacionPropietario;
    }

    public void setTelefonoDeContacto(String telefonoDeContacto) {
        this.telefonoDeContacto = telefonoDeContacto;
    }

    public String getTelefonoDeContacto() {
        return telefonoDeContacto;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void personalizarTarjeta() {
        Conexion conecta = new Conexion();
        Connection conexion = conecta.conectar();

        if (conexion != null) {
            try {
                // Consulta SQL para verificar si la tarjeta está bloqueada
                String sqlBloqueo = "SELECT BloqueoTarjeta, PersonalizadaTarjeta FROM tarjeta WHERE IdTarjeta = ?";
                PreparedStatement bloqueoStatement = conexion.prepareStatement(sqlBloqueo);
                bloqueoStatement.setString(1, numeroTarjeta);
                ResultSet rsBloqueo = bloqueoStatement.executeQuery();

                if (rsBloqueo.next()) {
                    int bloqueada = rsBloqueo.getInt("BloqueoTarjeta");
                    int personalizada = rsBloqueo.getInt("PersonalizadaTarjeta");

                    if (bloqueada == 1) {
                        JOptionPane.showMessageDialog(null, "La tarjeta está bloqueada.");
                        return; // Terminar la ejecución si la tarjeta está bloqueada
                    } else if (personalizada == 1) {
                        JOptionPane.showMessageDialog(null, "La tarjeta ya está personalizada.");
                        return; // Terminar la ejecución si la tarjeta ya está personalizada
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró la tarjeta especificada.");
                    return; // Terminar la ejecución si no se encontró la tarjeta
                }

                // El resto del código para la personalización de la tarjeta
                LocalDate fechaActual = LocalDate.now();
                LocalDate fechaNacimientoLocalDate = fechaDeNacimiento.toLocalDate();
                int edadCliente = fechaNacimientoLocalDate.until(fechaActual).getYears();

                String sql = "INSERT INTO cliente (CedulaCliente, NombreCliente, TelefonoCliente, FechaNacimientoCliente, EdadCliente, Sexo) VALUES (?, ?, ?, ?, ?, ?)";
                String sql1 = "UPDATE tarjeta SET PersonalizadaTarjeta = '1', ClienteId = ? WHERE IdTarjeta = ?";

                PreparedStatement statement = conexion.prepareStatement(sql);
                statement.setInt(1, identificacionPropietario);
                statement.setString(2, nombrePropietario);
                statement.setString(3, telefonoDeContacto);
                statement.setDate(4, fechaDeNacimiento);
                statement.setInt(5, edadCliente);
                statement.setString(6, sexo);

                statement.executeUpdate();
                System.out.println("Se ha insertado un nuevo cliente en la tabla cliente.");

                statement = conexion.prepareStatement(sql1);
                statement.setInt(1, identificacionPropietario);
                statement.setString(2, numeroTarjeta);

                statement.executeUpdate();
                System.out.println("Se ha actualizado la tarjeta en la tabla tarjeta.");
                JOptionPane.showMessageDialog(null, "Personalización exitosa");
            } catch (SQLException e) {
                e.printStackTrace(); // Manejar la excepción en caso de error
            } finally {
                conecta.close(); // Cerrar la conexión y liberar recursos
            }
        } else {
            System.out.println("Error al conectar a la base de datos.");
        }
    }

    public void setFechaDeNacimiento(java.util.Date fechaNacimiento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
    }
}
