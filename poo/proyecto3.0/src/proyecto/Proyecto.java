package proyecto;

import javax.swing.JFrame;


import vista.LoginIterface;

public class Proyecto {

    public static void main(String[] args) {


        

        // Crear un nuevo JFrame
        JFrame frame = new JFrame("Login");

        // Crear una instancia de LoginIterface
        LoginIterface loginInterface = new LoginIterface();

        // Agregar LoginIterface al JFrame
        frame.getContentPane().add(loginInterface);

        // Configurar el JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack(); // Ajustar el tamaño del JFrame automáticamente
        frame.setLocationRelativeTo(null); // Centrar el JFrame en la pantalla
        frame.setVisible(true); // Hacer visible el JFrame

    }
}

// principal ventanaPrincipal = new principal();
// ventanaPrincipal.setVisible(true);