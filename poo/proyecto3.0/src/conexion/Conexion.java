package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    String bd = "proyecto";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String password = "";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection cx;

    public Conexion() {
        
    }

    public Connection conectar(){
        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(url+bd, user, password);
            System.out.println("Se Conecto Correctamente");

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("No se conecto a: "+bd);
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cx;
    }

    public void close() {
        if (cx != null) {
            try {
                cx.close();
                System.out.println("Se cerro la conexion de manera exitosa");
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}
