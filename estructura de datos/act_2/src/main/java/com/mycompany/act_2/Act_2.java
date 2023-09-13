/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.act_2;

import java.util.Scanner;

/**
 *
 * @author Gonzalez
 */
public class Act_2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Declarar las variables
        String[] titulos = new String[5];
        int[] paginas = new int[5];
        double[] precios = new double[5];
        // Leer los datos de los libros
        for (int i = 0; i < titulos.length; i++) {

            System.out.print("Ingrese el título del libro " + (i + 1) + ": ");
            titulos[i] = entrada.nextLine();
            System.out.print("Ingrese el número de páginas del libro " + (i + 1) + ": ");
            paginas[i] = entrada.nextInt();
            System.out.print("Ingrese el precio del libro " + (i + 1) + ": ");
            precios[i] = entrada.nextDouble();
            entrada.nextLine();
        }
        // Buscar el libro con el mayor número de páginas
        int indiceLibroMayorPaginas = 0;
        for (int i = 1; i < paginas.length; i++) {
            if (paginas[i] > paginas[indiceLibroMayorPaginas]) {
                indiceLibroMayorPaginas = i;
            }
        }
        // Buscar el libro más económico
        int indiceLibroMasEconomico = 0;
        for (int i = 1; i < precios.length; i++) {
            if (precios[i] < precios[indiceLibroMasEconomico]) {
                indiceLibroMasEconomico = i;
            }
        }
        // Imprimir los resultados
        System.out.println("El libro con el mayor número de páginas es: " + titulos[indiceLibroMayorPaginas]);
        System.out.println("El precio del libro con el mayor número de páginas es: " + precios[indiceLibroMayorPaginas]);
        System.out.println("El libro más económico es: " + titulos[indiceLibroMasEconomico]);
        System.out.println("El número de páginas del libro más económico es: " + paginas[indiceLibroMasEconomico]);;
    }
}
