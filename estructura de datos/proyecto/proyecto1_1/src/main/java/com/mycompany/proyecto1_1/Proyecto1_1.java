/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto1_1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gonzalez
 */
public class Proyecto1_1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Hello World!");
        
        //definir variables
        int opc,n;


        //definir arrays para el inventario
        ArrayList<Integer> idpro = new ArrayList<>();
        ArrayList<String> nombrepro = new ArrayList<>();
        ArrayList<Float> preciopro = new ArrayList<>();
        ArrayList<Integer> cantidadpro = new ArrayList<>();
        ArrayList<String> fechaVencimientopro = new ArrayList<>();

        cargarDatosInventario(idpro, nombrepro, preciopro, cantidadpro, fechaVencimientopro);
        ordenar(idpro, nombrepro, preciopro, cantidadpro, fechaVencimientopro);
        do {
            n=1;
            System.out.println("¿Que proceso desea realizar?");
            System.out.println("1. Actualizar inventario");
            System.out.println("2. Agregar venta");
            System.out.println("3. Ver inventario");
            System.out.println("4. Terminar proceso");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Actualizar inventario");
                    System.out.println("1. Agregar producto");
                    System.out.println("2. modificar producto");
                    opc = entrada.nextInt();
                    switch (opc) {
                        case 1:
                            System.out.println("agregar producto");
                            int id=escribirEnteros("ingrese el ID: ", entrada);
                            int nR=noRepetir(idpro, id);
                            if (nR==1) {
                                idpro.add(id);
                                String nombre=escribirCaracter("ingrese el nombre del producto", entrada);
                                nombrepro.add(nombre); 
                                Float precio=escribirReales("ingrese el precio del producto", entrada);
                                preciopro.add(precio); 
                                int cantidad=escribirEnteros("ingrese la cantidad del producto", entrada);
                                cantidadpro.add(cantidad); 
                                String fecha=escribirCaracter("Ingrese la fecha de vencimiento (dd/MM/yyyy): ", entrada);
                                fechaVencimientopro.add(fecha);
                            } else {
                                System.out.println("el id ingresado ya esta en uso");
                            }
                            
                            break;
                        case 2:
                            int indice= buscarIndice("ingrese el id del producto", entrada, idpro);
                            
                            if (indice!=-1) {
                                id = escribirEnteros("escriba el id del producto actualizado", entrada);
                                nR=noRepetir(idpro, id);
                                if (nR==1) {
                                    String auxnombre=escribirCaracter("ingrese el nombre del producto", entrada);
                                    Float auxprecio=escribirReales("ingrese el precio del producto", entrada);                            
                                    int auxcantidad=escribirEnteros("ingrese la cantidad del producto", entrada);                            
                                    String auxfecha=escribirCaracter("Ingrese la fecha de vencimiento (dd/MM/yyyy): ", entrada);
                                    idpro.set(indice, id);
                                    nombrepro.set(indice, auxnombre);
                                    preciopro.set(indice, auxprecio); 
                                    cantidadpro.set(indice, auxcantidad);
                                    fechaVencimientopro.set(indice, auxfecha);
                                } else {
                                    System.out.println("el id ingresado ya esta en uso");
                                }
                                
                            }else {
                                System.out.println("no se encontro el id ingresado");
                            }
                            
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Agregar venta");
                    break;
                case 3:
                    System.out.println("Ver inventario");
                    System.out.printf("%-20s %-20s %-20s %-20s %-20s\n", "id", "nombre", "precio", "cantidad", "fecha vencimiento");
                    
                    mostrarInventario(idpro,nombrepro,preciopro,cantidadpro,fechaVencimientopro);
                    break;
                case 4:
                    System.out.println("fin del proceso");
                    n=0;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
            guardarDatosInventario(idpro, nombrepro, preciopro, cantidadpro, fechaVencimientopro);
        } while (n!=0);
    }

    public static int escribirEnteros(String mensaje, Scanner entrada){
        System.out.println(mensaje);
        return entrada.nextInt();
    }

    public static String escribirCaracter(String mensaje, Scanner entrada) {
        System.out.println(mensaje);
        return entrada.next();
    }

    public static Float escribirReales(String mensaje, Scanner entrada){
        System.out.println(mensaje);
        return entrada.nextFloat();
    }



    public static void mostrarInventario(ArrayList<Integer> idpro,ArrayList<String> nombrepro,ArrayList<Float> preciopro,ArrayList<Integer> cantidadpro,ArrayList<String>fechaVencimientopro ) {
        for (int i = 0; i < idpro.size(); i++) {
            System.out.printf("%-20s %-20s %-20s %-20s %-20s\n",  idpro.get(i),nombrepro.get(i),preciopro.get(i),cantidadpro.get(i),fechaVencimientopro.get(i));
        }
    }

    private static void cargarDatosInventario(ArrayList<Integer> idpro, ArrayList<String> nombrepro, ArrayList<Float> preciopro, ArrayList<Integer> cantidadpro, ArrayList<String> fechaVencimientopro) {
        try (BufferedReader br = new BufferedReader(new FileReader("inventario.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                idpro.add(Integer.parseInt(parts[0]));
                nombrepro.add(parts[1]);
                preciopro.add(Float.parseFloat(parts[2]));
                cantidadpro.add(Integer.parseInt(parts[3]));
                fechaVencimientopro.add(parts[4]);
            }
        } catch (FileNotFoundException e) {
            // El archivo no existe, se inicia con un inventario vacío.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void guardarDatosInventario(ArrayList<Integer> idpro, ArrayList<String> nombrepro, ArrayList<Float> preciopro, ArrayList<Integer> cantidadpro, ArrayList<String> fechaVencimientopro) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("inventario.txt"))) {
            for (int i = 0; i < idpro.size(); i++) {
                String line = idpro.get(i) + "," + nombrepro.get(i) + "," + preciopro.get(i) + "," + cantidadpro.get(i) + "," + fechaVencimientopro.get(i);
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //buscar el indice de un producto
    public static int buscarIndice (String mensaje, Scanner entrada, ArrayList<Integer> idpro) {
        System.out.println(mensaje);
        int aux= entrada.nextInt();
        for (int i = 0; i < idpro.size(); i++) {
            if (aux==idpro.get(i)) {
                return i;
            }
        }

        // Si no se encontró ninguna coincidencia, devolver -1
        return -1;
    }
    //metodo para que no se repita el id de los productos
    public static int noRepetir(ArrayList<Integer> idpro,int id) {
        for (int i = 0; i < idpro.size(); i++) {
            if (id==idpro.get(i)) {
                return -1;
            }
        }
        return 1;
    }

    public static void ordenar(ArrayList<Integer> idpro, ArrayList<String> nombrepro, ArrayList<Float> preciopro, ArrayList<Integer> cantidadpro, ArrayList<String> fechaVencimientopro) {
        // Método de ordenamiento de burbuja
        int n = idpro.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (idpro.get(j) > idpro.get(j + 1)) {
                    // Intercambiar los elementos mal ordenados del idpro
                    int tempId = idpro.get(j);
                    idpro.set(j, idpro.get(j + 1));
                    idpro.set(j + 1, tempId);
    
                    // Intercambiar el nombre con respecto al id
                    String tempNombre = nombrepro.get(j);
                    nombrepro.set(j, nombrepro.get(j + 1));
                    nombrepro.set(j + 1, tempNombre);
    
                    // Intercambiar el precio
                    float tempPrecio = preciopro.get(j);
                    preciopro.set(j, preciopro.get(j + 1));
                    preciopro.set(j + 1, tempPrecio);
    
                    // Intercambiar la cantidad
                    int tempCantidad = cantidadpro.get(j);
                    cantidadpro.set(j, cantidadpro.get(j + 1));
                    cantidadpro.set(j + 1, tempCantidad);
    
                    // Intercambiar la fecha de vencimiento
                    String tempFecha = fechaVencimientopro.get(j);
                    fechaVencimientopro.set(j, fechaVencimientopro.get(j + 1));
                    fechaVencimientopro.set(j + 1, tempFecha);
                }
            }
        }
    }
    




}
