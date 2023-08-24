package com.mycompany.act_1;

import java.util.Scanner;

public class calculadora {

    public static void main(String[] args){
        double r;
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("calculadora simple");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("Seleccione una opcion: ");
            
            int opc = teclado.nextInt();

            System.out.println("escriba el numero 1 ");
                    int n1 = teclado.nextInt();
                    System.out.println("escriba el numero 2 ");
                    int n2 = teclado.nextInt();

            switch (opc){
                case 1:
                    r= n1 + n2 ;
                    System.out.println("el resultado de la suma de los dos numeros es: " + r);
                case 2:
                    r= n1 - n2 ;
                    System.out.println("el resultado de la resta de los dos numeros es: " + r);
                case 3:
                    r= n1 * n2 ;
                    System.out.println("el resultado de la Multiplicacion de los dos numeros es: " + r);
                case 4:
                    r= n1 / n2 ;
                    System.out.println("el resultado de la Division de los dos numeros es: " + r);
                default:
                    System.out.println("la opcion que ingresaste es invalida");
            }
        }
    }
}
