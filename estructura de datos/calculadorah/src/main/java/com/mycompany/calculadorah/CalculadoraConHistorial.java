/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadorah;

/**
 *
 * @author Gonzalez
 */
import java.io.*;
import java.util.Scanner;

public class CalculadoraConHistorial {
    public static void main(String[] args) {
        try {
            File archivoHistorial = new File("historial.txt");
            if (!archivoHistorial.exists()) {
                archivoHistorial.createNewFile();
            }

            Scanner scanner = new Scanner(System.in);
            FileWriter writer = new FileWriter(archivoHistorial, true);

            while (true) {
                System.out.println("Calculadora en Java");
                System.out.print("Ingresa una operación (+, -, *, /) o 'q' para salir: ");
                String entrada = scanner.nextLine();

                if (entrada.equalsIgnoreCase("q")) {
                    break;
                }

                if (entrada.matches("[-+*/]")) {
                    System.out.print("Ingresa el primer número: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Ingresa el segundo número: ");
                    double num2 = scanner.nextDouble();
                    double resultado = 0.0;

                    switch (entrada) {
                        case "+":
                            resultado = num1 + num2;
                            break;
                        case "-":
                            resultado = num1 - num2;
                            break;
                        case "*":
                            resultado = num1 * num2;
                            break;
                        case "/":
                            if (num2 != 0) {
                                resultado = num1 / num2;
                            } else {
                                System.out.println("No se puede dividir por cero.");
                                continue;
                            }
                            break;
                        default:
                            System.out.println("Operación no válida.");
                            continue;
                    }

                    writer.write(num1 + " " + entrada + " " + num2 + " = " + resultado + "\n");
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Operación no válida.");
                }

                writer.flush();
                scanner.nextLine(); // Limpiar el buffer del teclado
            }

            writer.close();
            scanner.close();

            System.out.println("Historial de cálculos:");
            BufferedReader reader = new BufferedReader(new FileReader(archivoHistorial));
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

