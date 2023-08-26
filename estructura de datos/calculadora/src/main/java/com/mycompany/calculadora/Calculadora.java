package com.mycompany.calculadora;

import java.util.Scanner;
/**
 *
 * @author Gonzalez
 */
public class Calculadora {

    public static void main(String[] args) {
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
                    break;
                case 2:
                    r= n1 - n2 ;
                    System.out.println("el resultado de la resta de los dos numeros es: " + r);
                    break;
                case 3:
                    r= n1 * n2 ;
                    System.out.println("el resultado de la Multiplicacion de los dos numeros es: " + r);
                    break;
                case 4:
                    if (n2 != 0) { // Verifica que el divisor no sea cero para evitar divisi�n por cero
                        r= n1 / n2 ;
                        System.out.println("el resultado de la Division de los dos numeros es: " + r);
                    } else {
                        System.out.println("No es posible dividir entre cero");
                    }
                    break;
                default:
                    System.out.println("la opcion que ingresaste es invalida");
                    
            }
        }
    }
}
