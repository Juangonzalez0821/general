package com.mycompany.act_1;

import java.util.Scanner;
/**
 *
 * @author Gonzalez
 */
public class Act_1 {

    public static void main(String[] args) {
        int vt;
        int d;
        int vf;
        try (Scanner teclado = new Scanner (System.in)) {
            System.out.println("ingrese la cantidad: ");
            int cantidad =teclado.nextInt();
            System.out.println("ingrese el valor del producto: ");
            int vu = teclado.nextInt();
            System.out.println("ingrese el articulo: ");
            String art = teclado.next();
            double importe =teclado.nextDouble()

            if (cantidad>20) {
                vt = vu * cantidad;
                d = vt *10/100;
                vf = vt - d;
                System.out.print("el valor final del producto "+ art + " es: " + vf);  
            }else{
                if (cantidad<10) {
                    vt = cantidad * vu;
                    System.out.print("el valor final del producto "+ art + " es: " + vt);
                }else{
                    vt = vu * cantidad;  
                    d = vt *5/100;
                    vf = vt -d;
                    System.out.print("el valor final del producto "+ art + " es: " + vf);
                }
            }
        }    
    }
}
