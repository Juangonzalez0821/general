package logica;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DescontarPasaje {

    String IdTarjeta ;
    int PersonalizadaTarjeta;
    int clienteId;
    int pasajes_prestados;
    double saldoTarjeta;
    int BloqueoTarjeta;

    public String getIdTarjeta() {
        return IdTarjeta;
    }

    public void setIdTarjeta(String IdTarjeta) {
        this.IdTarjeta = IdTarjeta;
    }

    public double getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(double valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    String CedulaCliente;
    int EdadCliente;
    String Sexo;
    int respuesta;
    double valorPasaje ;

    public int validarPasaje() {
        Conexion conecta = new Conexion();
        Connection conexion = conecta.conectar();

        // Define variables
        clienteId = 0; // Suponiendo que ClienteId es un entero
        int z = 10;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            // Preparar la sentencia SQL
            String query = "SELECT PersonalizadaTarjeta FROM tarjeta WHERE IdTarjeta = ?";
            statement = conexion.prepareStatement(query);

            // Establecer parámetro
            statement.setString(1, IdTarjeta);

            // Ejecutar la consulta
            resultSet = statement.executeQuery();

            // Procesar los resultados
            if (resultSet.next()) {
                PersonalizadaTarjeta = resultSet.getInt("PersonalizadaTarjeta");
                // Convertir el entero a String
                z = PersonalizadaTarjeta;

            } else {
                // No se encontraron registros para el ID de tarjeta dado
                z = 20;
            }

        } catch (SQLException e) {
            // Manejar cualquier error de SQL
            e.printStackTrace();

        } finally {
            // Cerrar recursos en un bloque finally
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }

        if (z == 0) {
            Conexion conectaConsulta = new Conexion();
            Connection conexionConsulta = conectaConsulta.conectar();
            PreparedStatement statementConsulta = null;
            ResultSet resultSetConsulta = null;

            try {
                // Preparar la sentencia SQL
                String queryConsulta = "SELECT IdTarjeta, PersonalizadaTarjeta, ClienteId, pasajes_prestados, saldoTarjeta, BloqueoTarjeta FROM Tarjeta WHERE IdTarjeta = ?";
                statementConsulta = conexionConsulta.prepareStatement(queryConsulta);

                // Establecer parámetro
                statementConsulta.setString(1, IdTarjeta);

                // Ejecutar la consulta
                resultSetConsulta = statementConsulta.executeQuery();

                // Procesar los resultados
                if (resultSetConsulta.next()) {
                    clienteId = resultSetConsulta.getInt("ClienteId");
                    pasajes_prestados = resultSetConsulta.getInt("pasajes_prestados");
                    saldoTarjeta = resultSetConsulta.getDouble("saldoTarjeta");
                    BloqueoTarjeta = resultSetConsulta.getInt("BloqueoTarjeta");
                    // Ahora tienes los datos de la tarjeta para usarlos como desees
                } else {
                    // No se encontraron registros para el ID de tarjeta dado
                    // Puedes manejar esta situación según tus necesidades
                }

            } catch (SQLException e) {
                // Manejar cualquier error de SQL
                e.printStackTrace();
            } finally {
                // Cerrar recursos en un bloque finally
                try {
                    if (resultSetConsulta != null) {
                        resultSetConsulta.close();
                    }
                    if (statementConsulta != null) {
                        statementConsulta.close();
                    }
                    if (conexionConsulta != null) {
                        conexionConsulta.close();
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }

            if (BloqueoTarjeta == 1) {
                respuesta = 1;// tarejetabloqueada
                System.out.println(z + IdTarjeta + BloqueoTarjeta + "normal");
                JOptionPane.showMessageDialog(null, "esta tarjeta esta bloqueada");
            } else {
                if (saldoTarjeta >= valorPasaje) {
                    saldoTarjeta = saldoTarjeta - valorPasaje;
                    String updateQuery = "UPDATE tarjeta SET saldoTarjeta = ? WHERE IdTarjeta = ?";
                    PreparedStatement updateStatement = null;

                    conectaConsulta = null; // Declarar la variable fuera del bloque try-catch-finally

                    try {
                        conectaConsulta = new Conexion();
                        conexionConsulta = conectaConsulta.conectar();
                        updateStatement = conexionConsulta.prepareStatement(updateQuery);
                        updateStatement.setDouble(1, saldoTarjeta); // Establecer el nuevo saldo
                        updateStatement.setString(2, IdTarjeta); // Establecer el IdTarjeta
                        updateStatement.executeUpdate(); // Ejecutar la actualización
                        JOptionPane.showMessageDialog(null, "Puede ingresar pasaje descontado");
                    } catch (SQLException e) {
                        // Manejar cualquier error de SQL
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error al actualizar el saldo en la base de datos");
                    } finally {
                        // Cerrar el PreparedStatement
                        if (updateStatement != null) {
                            try {
                                updateStatement.close();
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    respuesta = 2;// tarejeta normal, se descuenta pasaje

                } else {
                    JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
                    respuesta = 3;// tarjeta normal, saldo insuficiente
                }

            }

        } else if (z == 1) {
            Conexion conectaConsulta = new Conexion();
            Connection conexionConsulta = conectaConsulta.conectar();
            PreparedStatement statementConsulta = null;
            ResultSet resultSetConsulta = null;

            try {
                // Preparar la sentencia SQL
                String queryConsulta = "SELECT Tarjeta.IdTarjeta, " +
                        "Tarjeta.PersonalizadaTarjeta, " +
                        "Tarjeta.ClienteId, " +
                        "Tarjeta.pasajes_prestados, " +
                        "Tarjeta.saldoTarjeta, " +
                        "Tarjeta.BloqueoTarjeta, " +
                        "Cliente.CedulaCliente, " +
                        "Cliente.EdadCliente, " +
                        "Cliente.Sexo " +
                        "FROM Tarjeta " +
                        "INNER JOIN Cliente ON Tarjeta.ClienteId = Cliente.CedulaCliente " +
                        "WHERE Tarjeta.IdTarjeta = ?";
                statementConsulta = conexionConsulta.prepareStatement(queryConsulta);

                // Establecer parámetro
                statementConsulta.setString(1, IdTarjeta); // Aquí deberías usar la variable IdTarjeta

                // Ejecutar la consulta
                resultSetConsulta = statementConsulta.executeQuery();

                // Procesar los resultados
                if (resultSetConsulta.next()) {
                    IdTarjeta = resultSetConsulta.getString("IdTarjeta");
                    PersonalizadaTarjeta = resultSetConsulta.getInt("PersonalizadaTarjeta");
                    clienteId = resultSetConsulta.getInt("ClienteId");
                    pasajes_prestados = resultSetConsulta.getInt("pasajes_prestados");
                    saldoTarjeta = resultSetConsulta.getDouble("saldoTarjeta");
                    BloqueoTarjeta = resultSetConsulta.getInt("BloqueoTarjeta");
                    CedulaCliente = resultSetConsulta.getString("CedulaCliente");
                    EdadCliente = resultSetConsulta.getInt("EdadCliente");
                    Sexo = resultSetConsulta.getString("Sexo");
                    // Ahora tienes los datos de la tarjeta y del cliente asociado
                } else {
                    // No se encontraron registros para el ID de tarjeta dado
                    // Puedes manejar esta situación según tus necesidades
                }

            } catch (SQLException e) {
                // Manejar cualquier error de SQL
                e.printStackTrace();
            } finally {
                // Cerrar recursos en un bloque finally
                try {
                    if (resultSetConsulta != null) {
                        resultSetConsulta.close();
                    }
                    if (statementConsulta != null) {
                        statementConsulta.close();
                    }
                    if (conexionConsulta != null) {
                        conexionConsulta.close();
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (BloqueoTarjeta == 1) {
                respuesta = 1;// tarejetabloqueada
                JOptionPane.showMessageDialog(null, "esta tarjeta esta bloqueada");
            } else if ((EdadCliente >= 57 && Sexo.equals("Femenino"))
                    || (EdadCliente >= 62 && Sexo.equals("Masculino"))) {
                double descuento = valorPasaje / 100 * 20;
                valorPasaje -= descuento;

                if (saldoTarjeta >= valorPasaje) {
                    saldoTarjeta = saldoTarjeta - valorPasaje;
                    String updateQuery = "UPDATE tarjeta SET saldoTarjeta = ? WHERE IdTarjeta = ?";
                    PreparedStatement updateStatement = null;

                    conectaConsulta = null; // Declarar la variable fuera del bloque try-catch-finally

                    try {
                        conectaConsulta = new Conexion();
                        conexionConsulta = conectaConsulta.conectar();
                        updateStatement = conexionConsulta.prepareStatement(updateQuery);
                        updateStatement.setDouble(1, saldoTarjeta); // Establecer el nuevo saldo
                        updateStatement.setString(2, IdTarjeta); // Establecer el IdTarjeta
                        updateStatement.executeUpdate(); // Ejecutar la actualización
                        JOptionPane.showMessageDialog(null, "Puede ingresar pasaje descontado, con descuento");
                    } catch (SQLException e) {
                        // Manejar cualquier error de SQL
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error al actualizar el saldo en la base de datos");
                    } finally {
                        // Cerrar el PreparedStatement
                        if (updateStatement != null) {
                            try {
                                updateStatement.close();
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    respuesta = 4;// tarjeta personalizada, con descuento, puede ingresar

                } else {
                    if (pasajes_prestados < 2) {
                        saldoTarjeta = saldoTarjeta - valorPasaje;
                        pasajes_prestados = pasajes_prestados + 1;
                        String updateQuery = "UPDATE `tarjeta` SET `pasajes_prestados` = ?, `saldoTarjeta` = ? WHERE `tarjeta`.`IdTarjeta` = ?";
                        PreparedStatement updateStatement = null;

                        conectaConsulta = null; // Declarar la variable fuera del bloque try-catch-finally
                        conexionConsulta = null;

                        try {
                            conectaConsulta = new Conexion();
                            conexionConsulta = conectaConsulta.conectar();
                            updateStatement = conexionConsulta.prepareStatement(updateQuery);
                            updateStatement.setInt(1, pasajes_prestados);
                            updateStatement.setDouble(2, saldoTarjeta); // Establecer el nuevo saldo
                            updateStatement.setString(3, IdTarjeta); // Establecer el IdTarjeta
                            updateStatement.executeUpdate(); // Ejecutar la actualización
                            JOptionPane.showMessageDialog(null, "Puede ingresar pasaje prestado, con descuento");

                        } catch (SQLException e) {
                            // Manejar cualquier error de SQL
                            e.printStackTrace();
                            JOptionPane.showMessageDialog(null, "Error al actualizar el saldo en la base de datos");
                        } finally {
                            // Cerrar el PreparedStatement
                            if (updateStatement != null) {
                                try {
                                    updateStatement.close();
                                } catch (SQLException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                        respuesta = 5; // tarjeta personalizada, con descuento, puede ingresar pasaje prestado
                    } else {
                        JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
                        respuesta = 6;// tarjeta personalizada, con descuento, no puede ingresar
                    }

                }
            } else {
                if (saldoTarjeta >= valorPasaje) {

                    saldoTarjeta = saldoTarjeta - valorPasaje;
                    String updateQuery = "UPDATE tarjeta SET saldoTarjeta = ? WHERE IdTarjeta = ?";
                    PreparedStatement updateStatement = null;

                    conectaConsulta = null; // Declarar la variable fuera del bloque try-catch-finally

                    try {
                        conectaConsulta = new Conexion();
                        conexionConsulta = conectaConsulta.conectar();
                        updateStatement = conexionConsulta.prepareStatement(updateQuery);
                        updateStatement.setDouble(1, saldoTarjeta); // Establecer el nuevo saldo
                        updateStatement.setString(2, IdTarjeta); // Establecer el IdTarjeta
                        updateStatement.executeUpdate(); // Ejecutar la actualización
                        JOptionPane.showMessageDialog(null, "Puede ingresar pasaje descontado");
                    } catch (SQLException e) {
                        // Manejar cualquier error de SQL
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error al actualizar el saldo en la base de datos");
                    } finally {
                        // Cerrar el PreparedStatement
                        if (updateStatement != null) {
                            try {
                                updateStatement.close();
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    respuesta = 7;// puede ingresar, no tiene descuento, no presta pasaje

                } else {
                    if (pasajes_prestados < 2) {
                        saldoTarjeta = saldoTarjeta - valorPasaje;
                        pasajes_prestados = pasajes_prestados + 1;
                        String updateQuery = "UPDATE `tarjeta` SET `pasajes_prestados` = ?, `saldoTarjeta` = ? WHERE `tarjeta`.`IdTarjeta` = ?";
                        PreparedStatement updateStatement = null;

                        conectaConsulta = null; // Declarar la variable fuera del bloque try-catch-finally
                        conexionConsulta = null;

                        try {
                            conectaConsulta = new Conexion();
                            conexionConsulta = conectaConsulta.conectar();
                            updateStatement = conexionConsulta.prepareStatement(updateQuery);
                            updateStatement.setInt(1, pasajes_prestados);
                            updateStatement.setDouble(2, saldoTarjeta); // Establecer el nuevo saldo
                            updateStatement.setString(3, IdTarjeta); // Establecer el IdTarjeta
                            updateStatement.executeUpdate(); // Ejecutar la actualización
                            JOptionPane.showMessageDialog(null, "Puede ingresar pasaje prestado");

                        } catch (SQLException e) {
                            // Manejar cualquier error de SQL
                            e.printStackTrace();
                            JOptionPane.showMessageDialog(null, "Error al actualizar el saldo en la base de datos");
                        } finally {
                            // Cerrar el PreparedStatement
                            if (updateStatement != null) {
                                try {
                                    updateStatement.close();
                                } catch (SQLException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                        respuesta = 8;// pasaje prestado, puede ingresar, no tiene descuento
                    } else {
                        JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
                        respuesta = 9;//saldo incuficiente
                    }
                }
            }

        }

        return respuesta;
    }

}
