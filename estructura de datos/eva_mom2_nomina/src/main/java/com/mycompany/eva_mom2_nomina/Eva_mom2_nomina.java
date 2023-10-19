/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_mom2_nomina;
import java.util.Scanner;
/**
 *
 * @author Gonzalez
 */
public class Eva_mom2_nomina {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Hello World!");
        //variables
        int n;
        System.out.println("¿cuantas perosnas va a ingresar?");
        n = entrada.nextInt();
        int c = 9;
        String [] personas = new String[n];
        double [][] sueldo = new double[n][c];

 

        
        for (int i = 0; i < n; i++) {
            //nombre
            System.out.println("ingrese el nombre de la persona "+(i+1));
            personas[i] = entrada.next();
            //salario basico
            System.out.println("ingrese el salario basico de " + personas[i]);
            sueldo[i][0] = entrada.nextInt();
            //dias trabajados
            System.out.println("ingrese los dias trabajados de " + personas[i]);
            sueldo[i][1] = entrada.nextInt();
        }

        for (int i = 0; i < n; i++) {
            //calcular el salario promedio
            sueldo[i][2]=sueldo[i][0]/30*sueldo[i][1];
            //calcular el auxilio de transporte
            if (sueldo[i][0]>2300000) {
                sueldo[i][3]=000000;
            }else{
                sueldo[i][3]=140606;
            }
            //calcular el total devengado
            sueldo[i][4]=sueldo[i][2]+sueldo[i][3];
            //calcular salud
            sueldo[i][5]=sueldo[i][4]*0.04;
            //calcular pension
            sueldo[i][6]=sueldo[i][4]*0.04;
            //calcular el total deducido
            sueldo[i][7]=sueldo[i][5]+sueldo[i][6];
            //calcular el total a pagar
            sueldo[i][8]=sueldo[i][4]-sueldo[i][7];
        }
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "Nombre", "S.B.", "D.T.", "S. Pro", "Aux. T.", "T. Dev.", "Salud", "Pen", "T. Dedu.", "T. P.");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %-20.2f %-20.0f %-20.0f %-20.0f %-20.1f %-20.2f %-20.2f %-20.2f %-20.2f\n", personas[i], sueldo[i][0], sueldo[i][1], sueldo[i][2], sueldo[i][3], sueldo[i][4], sueldo[i][5], sueldo[i][6], sueldo[i][7], sueldo[i][8]);
        }
        
    }
}

