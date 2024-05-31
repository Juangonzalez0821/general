/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import conexion.Conexion;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;


public class Login {
    
    String usuario;
    String contraseña;
    boolean ingresa;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public boolean Ingresar() {
        Conexion conecta = new Conexion();
        Connection conexion = conecta.conectar();
        CallableStatement cs = null;
    
        try {
            // Llama al procedimiento almacenado sp_login y pasa los parámetros de usuario y contraseña
            cs = conexion.prepareCall("{CALL sp_login(?, ?, ?)}");
            cs.setString(1, usuario);
            cs.setString(2, contraseña);
            cs.registerOutParameter(3, java.sql.Types.BOOLEAN); // Registro del parámetro de salida
    
            // Ejecuta el procedimiento almacenado
            cs.execute();
    
            // Obtiene el valor de retorno del procedimiento almacenado
            ingresa = cs.getBoolean(3);
        } catch (SQLException ex) {
            // Manejo de excepciones
            ex.printStackTrace();
        } finally {
            // Cierra el CallableStatement y la conexión
            if (cs != null) {
                try {
                    cs.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            // Cierra la conexión
            conecta.close();
        }
    
        return ingresa;
    }
    
    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
