/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t_clase;

import java.util.Scanner;


public class T_clase {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Hello World!");
        //variables generales
        int n = 0;
        int opc = 0;
        int opc1 = 0;
        int codigo_a = 0;
        int aux = 0;
        String nombre_a = "";
        String aux1 = "";
        int opc2 = 0;
        int opc3 = 0;
        int opc4 = 0;
        int aux2 = 0;
        int menor = 0;
        int pos = 0;
        int tmp = 0;
        System.out.println("Ingrese el numero de libros que va a ingresar");
        n = entrada.nextInt();
        //variables de el arreglo
        int [] codigo = new int[n];
        String [] nombre = new String[n];
        int[] no_p = new int[n];
                
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el codigo del libro");
            codigo[i] = entrada.nextInt();
            System.out.println("Ingrese el nombre del libro");
            nombre[i] = entrada.next();
            System.out.println("Ingrese el numero de paginas del libro");
            no_p[i] = entrada.nextInt();
        }
        System.out.println("¿Que desea realizar?");
        System.out.println("1. Actualizar libro");
        System.out.println("2. Buscar libro");
        System.out.println("3. Ordenar por criterio");
        opc = entrada.nextInt();
        switch (opc){
            case 1 -> {
                //Actulizar libro
                System.out.println("Actualizacion de libro");
                System.out.println("¿De que manera desea buscar el libro?");
                System.out.println("1. Codigo");
                System.out.println("2. Nombre ");
                opc1 = entrada.nextInt();
                switch (opc1){
                    case 1 -> {
                        System.out.println("Ingrese el Codigo del libro");
                        codigo_a = entrada.nextInt();
                        for (int i = 0; i <= n; i++) {
                            if (codigo_a==codigo[i]) {
                                System.out.println("Ingrese el Codigo actualizado");
                                aux = entrada.nextInt();
                                codigo [i]=aux;
                                System.out.println("Datos actualizados");
                                System.out.println("Codigo: " + codigo[i]);
                                System.out.println("Nombre: " +nombre[i]);
                                System.out.println("Numero de paginas: " +no_p[i]);
                            }
                            else{
                                System.out.println("No se encontro el codigo ingresado");
                            }
                        }
                    }
                    case 2 -> {
                        System.out.println("Ingrese el nombre del libro");
                        nombre_a = entrada.next();
                        for (int i = 0; i <=n; i++) {
                            if (nombre[i].equals(nombre_a)) {
                                System.out.println("Ingrese el nombre actualizado");
                                aux1 = entrada.next();
                                nombre[i]=aux1;
                                System.out.println("Datos actualizados");
                                System.out.println("Codigo: " + codigo[i]);
                                System.out.println("Nombre: " +nombre[i]);
                                System.out.println("Numero de paginas: " +no_p[i]);
                            }
                            else{
                                System.out.println("No se encontro el nombre ingresado");
                            }
                        }
                    }
                    default -> {
                        System.out.println("La opcion ingresada no es valida");
                    }
                }
            }

            case 2 -> {
                //Busqueda del libro
                System.out.println("Busqueda del libro");
                System.out.println("¿De que manera desea buscar el libro?");
                System.out.println("1. Codigo");
                System.out.println("2. Nombre ");
                opc2 = entrada.nextInt();
                switch (opc2){
                    case 1 -> {
                        System.out.println("Ingrese el Codigo del libro");
                        codigo_a = entrada.nextInt();
                        for (int i = 0; i <= n; i++) {
                            if (codigo_a==codigo[i]) {
                                System.out.println("Datos actualizados");
                                System.out.println("Codigo: " + codigo[i]);
                                System.out.println("Nombre: " +nombre[i]);
                                System.out.println("Numero de paginas: " +no_p[i]);
                            }
                            else{
                                System.out.println("No se encontro el codigo ingresado");
                            }
                        }
                    }
                    case 2 -> {
                        System.out.println("Ingrese el nombre del libro");
                        nombre_a = entrada.next();
                        for (int i = 0; i <=n; i++) {
                            if (nombre[i].equals(nombre_a)) {
                                System.out.println("Informacion del libro");
                                System.out.println("Codigo: " + codigo[i]);
                                System.out.println("Nombre: " +nombre[i]);
                                System.out.println("Numero de paginas: " +no_p[i]);
                            }
                            else{
                                System.out.println("No se encontro el nombre ingresado");
                            }
                        }
                    }
                    default -> {
                        System.out.println("La opcion ingresada no es valida");
                    }
                }
            }
            case 3 -> {
                //ordenar libro
                System.out.println("¿Por que campo desea ordenar?");
                System.out.println("1. Codigo");
                System.out.println("2. Numero de paginas");
                opc3 = entrada.nextInt();
                switch (opc3){
                    case 1 ->{
                        //ordenar libro por codigo
                        System.out.println("¿Por que metodo desea ordenar?");
                        System.out.println("1. Burbuja");
                        System.out.println("2. Insercion");
                        System.out.println("3. Seleccion");
                        opc4 = entrada.nextInt();
                        switch (opc4){
                            case 1 ->{
                                //metodo burbuja
                                for (int i = n-1; i > 0; i--) {
                                    for (int k = 0; k < i; k++) {
                                        if (codigo[k]>codigo[k+1]) {
                                            aux2=codigo[k];
                                            codigo[k]=codigo[k+1];
                                            codigo[k+1]=aux2;
                                        }
                                    }
                                }
                                System.out.println("Esta es la lista ordenada por codigo");
                                for (int i = 0; i < n; i++) {
                                    System.out.println(codigo[i] +"  "+ nombre[i] +"  "+ no_p[i]);
                                }
                            }
                            case 2 ->{
                                //metodo insercion
                                for (int i = 0; i < n; i++) {
                                    menor= codigo[i];
                                    pos= i;
                                    for (int j = i+1; j < n; j++) {
                                        if (codigo[j]<  menor) {
                                            menor= codigo[j];
                                            pos=j;
                                        }
                                    }
                                    if (pos!=1) {
                                        tmp=codigo[i];
                                        codigo[i]=codigo[pos];
                                        codigo[pos]= tmp;
                                    }
                                }
                                System.out.println("Esta es la lista ordenada por codigo");
                                for (int i = 0; i < n; i++) {
                                    System.out.println(codigo[i] +"  "+ nombre[i] +"  "+ no_p[i]);
                                }     
                            }
                            case 3 ->{
                                //metodo seleccion
                                for (int i = 0; i < no_p.length; i++) {
                                    aux2=codigo[i];
                                    int j= i-1;
                                    while ((j >=0)&&(aux2 < codigo[j])) {
                                        codigo[j+1]=codigo[j];
                                        j--;
                                    }
                                    codigo[j+1]=aux2;
                                }
                            }
                            default ->{
                                System.out.println("La opcion ingresada no es valida");
                            }
                        }
                    }
                    case 2 ->{
                        //ordenar libro por Numero de paginas
                        System.out.println("¿Por que metodo desea ordenar?");
                        System.out.println("1. Burbuja");
                        System.out.println("2. Insercion");
                        System.out.println("3. Seleccion");
                        opc4 = entrada.nextInt();
                        switch (opc4){
                            case 1 ->{
                                //metodo burbuja
                                for (int i = n-1; i > 0; i--) {
                                    for (int k = 0; k < i; k++) {
                                        if (no_p[k]>no_p[k+1]) {
                                            aux2=no_p[k];
                                            no_p[k]=no_p[k+1];
                                            no_p[k+1]=aux2;
                                        }
                                    }
                                }
                                System.out.println("Esta es la lista ordenada por codigo");
                                for (int i = 0; i < n; i++) {
                                    System.out.println(codigo[i] +"  "+ nombre[i] +"  "+ no_p[i]);
                                }
                            }
                            case 2 ->{
                                //metodo insercion
                                for (int i = 0; i < n; i++) {
                                    menor= no_p[i];
                                    pos= i;
                                    for (int j = i+1; j < n; j++) {
                                        if (no_p[j]<  menor) {
                                            menor= no_p[j];
                                            pos=j;
                                        }
                                    }
                                    if (pos!=1) {
                                        tmp=no_p[i];
                                        no_p[i]=no_p[pos];
                                        no_p[pos]= tmp;
                                    }
                                }
                                System.out.println("Esta es la lista ordenada por codigo");
                                for (int i = 0; i < n; i++) {
                                    System.out.println(codigo[i] +"  "+ nombre[i] +"  "+ no_p[i]);
                                }     
                            }
                            case 3 ->{
                                //metodo seleccion
                                for (int i = 0; i < no_p.length; i++) {
                                    aux2=no_p[i];
                                    int j= i-1;
                                    while ((j >=0)&&(aux2 < no_p[j])) {
                                        no_p[j+1]=no_p[j];
                                        j--;
                                    }
                                    no_p[j+1]=aux2;
                                }
                            }
                            default ->{
                                System.out.println("La opcion ingresada no es valida");
                            }
                        }
                    }
                    default ->{
                        System.out.println("La opcion ingresada no es valida");
                    }
                }
            }
            default -> {
                System.out.println("La opcion ingresada no es valida");
            }
            
        }
        
        System.out.println("fin del programa");
    }
}
