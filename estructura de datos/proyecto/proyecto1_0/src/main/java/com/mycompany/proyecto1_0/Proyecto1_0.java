

package com.mycompany.proyecto1_0;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Proyecto1_0 {

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
        ArrayList<Date> fechaVencimientopro = new ArrayList<>();
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
                            idpro.add(id);
                            String nombre=escribirCaracter("ingrese el nombre del producto", entrada);
                            nombrepro.add(nombre); 
                            Float precio=escribirReales("ingrese el precio del producto", entrada);
                            preciopro.add(precio); 
                            int cantidad=escribirEnteros("ingrese la cantidad del producto", entrada);
                            cantidadpro.add(cantidad); 
                            Date fecha=escribirFecha("Ingrese la fecha de vencimiento (dd/MM/yyyy): ", entrada);
                            fechaVencimientopro.add(fecha);
                            break;
                        case 2:
                            
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

    public static Date escribirFecha(String mensaje, Scanner entrada){
        System.out.println(mensaje);
        String fechaString = entrada.next();
        SimpleDateFormat formato =new SimpleDateFormat("dd/MM/yyyy");
        try {
            return formato.parse(fechaString);
        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto. Utiliza el formato dd/MM/yyyy.");
            return null;
        }
    }

    public static void mostrarInventario(ArrayList<Integer> idpro,ArrayList<String> nombrepro,ArrayList<Float> preciopro,ArrayList<Integer> cantidadpro,ArrayList<Date>fechaVencimientopro ) {
        for (int i = 0; i < idpro.size(); i++) {
            System.out.printf(" %-20s %-20s %-20s %-20s %-20s\n",  idpro.get(i),nombrepro.get(i),preciopro.get(i),cantidadpro.get(i),fechaVencimientopro.get(i));
        }
    }
    
}
