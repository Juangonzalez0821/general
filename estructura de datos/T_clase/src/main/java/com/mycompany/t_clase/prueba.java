/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t_clase;

import java.util.Scanner;

/**
 *
 * @author Gonzalez
 */
public class prueba {

    /**
     * @param arg
     * @param opc 
     */
    public static void main(String[]arg){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Hello World!");
        //variables
        int s;//variable salida del do while
        //int n;//variable que mide la cantidad de los libros que va a ingresar
        int opc;//variable de los menus
        int auxc;//auxiliar para editar variable codigo
        int auxc1;//auxiliar para editar variable codigo
        String auxn;//auxiliar para editar variable nombre
        String auxn1;//auxiliar para editar variable nombre
        int auxp;//auxiliar para editar variable No. paginas
        int auxp1;//auxiliar para editar variable No. paginas
        int min;//auciliar que ayuda en el metodo insersion-





        int[] codigo = {1, 5, 2, 4, 3};
        String[] nombre = {"aa", "ee", "bb", "dd", "cc"};
        int[] no_p = {101, 305, 802, 4504, 403};
        int n = codigo.length;
        //cuantos libros va a ingresar
        /*System.out.println("Ingrese el numero de libros que va a ingresar");
        n = entrada.nextInt();//cantidad de libros
        //variables del arreglo
        int [] codigo = new int[n];
        String [] nombre = new String[n];
        int[] no_p = new int[n];

        //ciclo que lee los datos que se ingresaran de los libros
        for (int i = 0; i < n; i++) {
                System.out.println("Ingrese el codigo del libro");
                codigo[i] = entrada.nextInt();
                System.out.println("Ingrese el nombre del libro");
                nombre[i] = entrada.next();
                System.out.println("Ingrese el numero de paginas del libro");
                no_p[i] = entrada.nextInt();
            }
        */

        //ciclo do while
        do {
            //menu 1
            System.out.println("¿Que desea realizar?");
            System.out.println("1. Actualizar libro");
            System.out.println("2. Buscar libro");
            System.out.println("3. Ordenar por criterio");
            opc = entrada.nextInt();
            //switch menu 1
            switch (opc) {    
                case 1 -> {
                    //actualizar libro
                    //menu 1.1
                    System.out.println("Actualizacion de libro");
                    System.out.println("¿Que desea actualizar del libro?");
                    System.out.println("1. Codigo");
                    System.out.println("2. Nombre ");
                    System.out.println("3. Numero de paginas ");
                    opc = entrada.nextInt();
                    //switch menu 1.1
                    switch (opc) {
                        case 1 -> {
                            //actualizar el codigo de libro
                            System.out.println("Ingrese el Codigo del libro");
                            auxc = entrada.nextInt();
                            for (int i = 0; i <= n; i++) {
                                if (auxc==codigo[i]) {
                                    System.out.println("Ingrese el Codigo actualizado");
                                    auxc1 = entrada.nextInt();
                                    codigo [i]=auxc1;
                                    System.out.println("Datos actualizados");
                                    System.out.println("Codigo\tNombre\t \tNo. paginas ");
                                    System.out.println(codigo[i] + "\t" + nombre[i] + "\t \t" + no_p[i]);
                                }
                            }
                        }
                        case 2 -> {
                            //actualizar el nombre de libro
                            System.out.println("Ingrese el nombre del libro");
                            auxn = entrada.next();
                            for (int i = 0; i <=n; i++) {
                                if (nombre[i].equals(auxn)) {
                                    System.out.println("Ingrese el nombre actualizado");
                                    auxn1 = entrada.next();
                                    nombre[i]=auxn1;
                                    System.out.println("Datos actualizados");
                                    System.out.println("Codigo\tNombre\t \tNo. paginas ");
                                    System.out.println(codigo[i] + "\t" + nombre[i] + "\t \t" + no_p[i]);
                                }
                            }
                        }
                        case 3 -> {
                            //actualizar el No de paginas
                            System.out.println("Ingrese el Codigo del libro");
                            auxc = entrada.nextInt();
                            for (int i = 0; i <= n; i++) {
                                if (auxc==codigo[i]) {
                                    System.out.println("Ingrese el No. de paginas actualizado");
                                    auxp1 = entrada.nextInt();
                                    no_p [i]=auxp1;
                                    System.out.println("Datos actualizados");
                                    System.out.println("Codigo\tNombre\t \tNo. paginas ");
                                    System.out.println(codigo[i] + "\t" + nombre[i] + "\t \t" + no_p[i]);
                                }
                            }
                        }
                        //default menu 1.1
                        default -> {
                            System.out.println("La opcion ingresada no es valida");
                        }
                    }
                }
                case 2 -> {
                    //Buscar libro
                    //menu 1.2
                    System.out.println("Busqueda del libro");
                    System.out.println("¿De que manera desea buscar el libro?");
                    System.out.println("1. Codigo");
                    System.out.println("2. Nombre ");
                    opc = entrada.nextInt();
                    //switch menu 1.2
                    switch (opc) {
                        case 1 -> {
                            //buscar libro por codigo
                            System.out.println("Ingrese el Codigo del libro");
                            auxc = entrada.nextInt();
                            for (int i = 0; i <= n; i++) {
                                if (auxc==codigo[i]) {
                                    System.out.println("Informacion del libro");
                                    System.out.println("Codigo\tNombre\t \tNo. paginas ");
                                    System.out.println(codigo[i] + "\t" + nombre[i] + "\t \t" + no_p[i]);;
                                }
                            }
                        }
                        case 2 -> {
                            //buscar libro por nombre
                            System.out.println("Ingrese el nombre del libro");
                            auxn = entrada.next();
                            for (int i = 0; i <=n; i++) {
                                if (nombre[i].equals(auxn)) {
                                    System.out.println("Informacion del libro");
                                    System.out.println("Codigo\tNombre\t \tNo. paginas ");
                                    System.out.println(codigo[i] + "\t" + nombre[i] + "\t \t" + no_p[i]);;
                                }
                            }
                        }
                        default -> {
                            System.out.println("La opcion ingresada no es valida");
                        }
                    }

                }
                case 3 -> {
                    //ordenas libros
                    //menu 1.3
                    System.out.println("¿Por que campo desea ordenar?");
                    System.out.println("1. Codigo");
                    System.out.println("2. Numero de paginas");
                    opc = entrada.nextInt();
                    //switch menu 1.3
                    switch (opc) {
                        case 1 ->{
                            //ordenar por codigo
                            //menu 1.3.1
                            System.out.println("¿Por que metodo desea ordenar?");
                            System.out.println("1. Burbuja");
                            System.out.println("2. Insercion");
                            System.out.println("3. Seleccion");
                            opc = entrada.nextInt();
                            //switch menu 1.3.1
                            switch (opc) {
                                case 1 ->{
                                    //metodo burbuja por codigo
                                    for (int i = 0; i < n; i++) {
                                        for (int j = 0; j < n -i -1; j++) {
                                            if (codigo[j]>codigo[j+1]) {
                                                //intercambiar los elementos mal ordenados (codigo)
                                                auxc = codigo[j];
                                                codigo[j] = codigo[j+1];
                                                codigo[j+1] = auxc;
                                                //intercambiar los elementos mal ordenados (nombre)
                                                auxn = nombre[j];
                                                nombre[j] = nombre[j+1];
                                                nombre[j+1] = auxn;
                                                //intercambiar los elementos mal ordenados (No. paginas)
                                                auxp = no_p[j];
                                                no_p[j] = no_p[j+1];
                                                no_p[j+1] = auxp;
                                            }
                                            
                                        }
                                    }
                                    System.out.println("Esta es la lista ordenada por codigo");
                                    System.out.println("Codigo\tNombre\t \tNo. paginas ");
                                    for (int i = 0; i < n; i++) {
                                        System.out.println(codigo[i] + "\t" + nombre[i] + "\t \t" + no_p[i]);
                                    }
                                }
                                case 2 ->{
                                    //metodo insersion por codigo
                                    for (int i = 0; i < n-1; i++) {
                                        min = i; 
                                        for (int j = i+1; j < n; j++) {
                                            if (codigo[j]<codigo[min]) {
                                                min=j;
                                            }
                                        }
                                        //intercambiar los elementos mal ordenados (codigo)
                                        auxc = codigo[min];
                                        codigo[min] = codigo[i];
                                        codigo[i] = auxc;
                                        //intercambiar los elementos mal ordenados (nombre)
                                        auxn = nombre[min];
                                        nombre[min] = nombre[i];
                                        nombre[i] = auxn;
                                        //intercambiar los elementos mal ordenados (No. paginas)
                                        auxp = no_p[min];
                                        no_p[min] = no_p[i];
                                        no_p[i] = auxp;
                                    }
                                    System.out.println("Esta es la lista ordenada por codigo");
                                    System.out.println("Codigo\tNombre\t \tNo. paginas ");
                                    for (int i = 0; i < n; i++) {
                                        System.out.println(codigo[i] + "\t" + nombre[i] + "\t \t" + no_p[i]);
                                    }
                                }
                                case 3 ->{
                                    //metodo insersion por codigo
                                    for (int i = 0; i < n; i++) {
                                        auxc=codigo[i];
                                        auxn=nombre[i];
                                        auxp=no_p[i];
                                        int j = i-1;
                                        while (j >= 0 && codigo[j] > auxc) {
                                            codigo[j + 1] = codigo[j];
                                            nombre[j + 1] = nombre[j];
                                            no_p[j + 1] = no_p[j];
                                            j--;
                                        }
                                        //intercambiar los elementos mal ordenados (codigo)
                                        codigo[j + 1] = auxc;
                                        //intercambiar los elementos mal ordenados (nombre)
                                        nombre[j + 1] = auxn;
                                        //intercambiar los elementos mal ordenados (No. paginas)
                                        no_p[j + 1] = auxp;
                                    }
                                    System.out.println("Esta es la lista ordenada por codigo");
                                    System.out.println("Codigo\tNombre\t \tNo. paginas ");
                                    for (int i = 0; i < n; i++) {
                                        System.out.println(codigo[i] + "\t" + nombre[i] + "\t \t" + no_p[i]);
                                    }
                                }
                                default ->{
                                    System.out.println("La opcion ingresada no es valida");
                                }
                            }
                        }
                        case 2 ->{
                            //ordenar por numero de paginas
                            //menu 1.3.1
                            System.out.println("¿Por que metodo desea ordenar?");
                            System.out.println("1. Burbuja");
                            System.out.println("2. Insercion");
                            System.out.println("3. Seleccion");
                            opc = entrada.nextInt();
                            //switch menu 1.3.1
                            switch (opc) {
                                case 1 ->{
                                    //metodo burbuja por No. paginas
                                    for (int i = 0; i < n; i++) {
                                        for (int j = 0; j < n -i -1; j++) {
                                            if (no_p[j]>no_p[j+1]) {
                                                //intercambiar los elementos mal ordenados (codigo)
                                                auxc = codigo[j];
                                                codigo[j] = codigo[j+1];
                                                codigo[j+1] = auxc;
                                                //intercambiar los elementos mal ordenados (nombre)
                                                auxn = nombre[j];
                                                nombre[j] = nombre[j+1];
                                                nombre[j+1] = auxn;
                                                //intercambiar los elementos mal ordenados (No. paginas)
                                                auxp = no_p[j];
                                                no_p[j] = no_p[j+1];
                                                no_p[j+1] = auxp;
                                            }
                                            
                                        }
                                    }
                                    System.out.println("Esta es la lista ordenada por codigo");
                                    System.out.println("Codigo\tNombre\t \tNo. paginas ");
                                    for (int i = 0; i < n; i++) {
                                        System.out.println(codigo[i] + "\t" + nombre[i] + "\t \t" + no_p[i]);
                                    }
                                }
                                case 2 ->{
                                    //metodo insersion por No. paginas
                                    for (int i = 0; i < n-1; i++) {
                                        min = i; 
                                        for (int j = i+1; j < n; j++) {
                                            if (no_p[j]<no_p[min]) {
                                                min=j;
                                            }
                                        }
                                        //intercambiar los elementos mal ordenados (codigo)
                                        auxc = codigo[min];
                                        codigo[min] = codigo[i];
                                        codigo[i] = auxc;
                                        //intercambiar los elementos mal ordenados (nombre)
                                        auxn = nombre[min];
                                        nombre[min] = nombre[i];
                                        nombre[i] = auxn;
                                        //intercambiar los elementos mal ordenados (No. paginas)
                                        auxp = no_p[min];
                                        no_p[min] = no_p[i];
                                        no_p[i] = auxp;
                                    }
                                    System.out.println("Esta es la lista ordenada por codigo");
                                    System.out.println("Codigo\tNombre\t \tNo. paginas ");
                                    for (int i = 0; i < n; i++) {
                                        System.out.println(codigo[i] + "\t" + nombre[i] + "\t \t" + no_p[i]);
                                    }
                                }
                                case 3 ->{
                                    //metodo insersion por No. paginas
                                    for (int i = 0; i < n; i++) {
                                        auxc=codigo[i];
                                        auxn=nombre[i];
                                        auxp=no_p[i];
                                        int j = i-1;
                                        while (j >= 0 && no_p[j] > auxp) {
                                            codigo[j + 1] = codigo[j];
                                            nombre[j + 1] = nombre[j];
                                            no_p[j + 1] = no_p[j];
                                            j--;
                                        }
                                        //intercambiar los elementos mal ordenados (codigo)
                                        codigo[j + 1] = auxc;
                                        //intercambiar los elementos mal ordenados (nombre)
                                        nombre[j + 1] = auxn;
                                        //intercambiar los elementos mal ordenados (No. paginas)
                                        no_p[j + 1] = auxp;
                                    }
                                    System.out.println("Esta es la lista ordenada por codigo");
                                    System.out.println("Codigo\tNombre\t \tNo. paginas ");
                                    for (int i = 0; i < n; i++) {
                                        System.out.println(codigo[i] + "\t" + nombre[i] + "\t \t" + no_p[i]);
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
                }
                //default menu 1
                default -> {
                    System.out.println("La opcion ingresada no es valida");
                }
                
            }



            System.out.println("Ingrese cero (0) si desea continuar y uno (1) si desea salir");
            s = entrada.nextInt();
        } while (s==0);
        System.out.println("fin del programa");
    }
    

}
