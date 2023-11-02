/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajomom3;

import java.util.Scanner;

/**
 *
 * @author Gonzalez
 */
public class Trabajomom3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner teclado = new Scanner(System.in);
        //Cedula Nombre Edad estado civil ciudad
        System.out.println("ingrese la cantidad de personas");
        int n = teclado.nextInt();
        int [] Cedula =  new int [n];
        String [] Nombre = new String [n];
        int [] Edad =  new int [n];
        String [] Ecivil = new String [n];
        String [] Ciudad = new String [n];
        for (int i = 0; i < n; i++) {
            System.out.println("presona: " + (i+1));
            Cedula [i]=escribire("ingrese la cedula: ", teclado);
            Nombre [i]=escribirl("ingrese el nombre", teclado);
            Edad [i]=escribire("ingrese la edad: ", teclado);
            Ecivil [i]=escribirl("ingrese el estado civil", teclado);
            Nombre [i]=escribirl("ingrese la cuidad", teclado);
        }

    }

    public static int escribire(String mensaje, Scanner teclado){
        System.out.println(mensaje);
        return teclado.nextInt();
    }
    public static String escribirl (String mensaje, Scanner teclado){
        System.out.println(mensaje);
        return teclado.next();
    }
    
    public static int busquedalineal (int arr[])
    
}
