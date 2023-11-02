/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.io.*;
import java.util.Arrays;
/**
 *
 * @author Gonzalez
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] edades = {25, 30, 35, 40, 45};

        guardarEdadesEnArchivo("edades.txt", edades);
        int[] edadesLeidas = cargarEdadesDesdeArchivo("edades.txt");

        if (edadesLeidas != null) {
            System.out.println("Edades almacenadas en el archivo: " + Arrays.toString(edadesLeidas));
        } else {
            System.out.println("No se pudieron cargar las edades desde el archivo.");
        }
    }
    public static void guardarEdadesEnArchivo(String nombreArchivo, int[] edades) {
        try {
            FileWriter writer = new FileWriter(nombreArchivo);
            for (int edad : edades) {
                writer.write(Integer.toString(edad) + "\n");
            }
            writer.close();
            System.out.println("Edades guardadas en el archivo " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static int[] cargarEdadesDesdeArchivo(String nombreArchivo) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            int[] edades = new int[5]; // Asumiendo que hay 5 edades en el archivo

            int i = 0;
            while ((linea = reader.readLine()) != null) {
                edades[i] = Integer.parseInt(linea);
                i++;
            }

            reader.close();
            return edades;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
