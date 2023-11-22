package com.mycompany.proyecto1_1; // Declaración del paquete, este código pertenece al paquete com.mycompany.proyecto1_1.

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Proyecto1_1 { // Define la clase principal "Proyecto1_1".

    public static void main(String[] args) { // El método principal, el punto de entrada de tu programa Java.
        Scanner entrada = new Scanner(System.in); // Crea un objeto Scanner para la entrada del usuario.
        System.out.println("                        PetStock\n"); // Imprime "Hello World!" en la consola.
        

        // Definir variables
        int opc, n;
        double iva; // Declarar dos variables enteras opc y n.

        // Definir arrays para el inventario
        ArrayList<Integer> idpro = new ArrayList<>(); // Crea un ArrayList para almacenar los ID de productos.
        ArrayList<String> nombrepro = new ArrayList<>(); // Crea un ArrayList para almacenar nombres de productos (como cadenas).
        ArrayList<Float> preciopro = new ArrayList<>(); // Crea un ArrayList para almacenar precios de productos (como números de punto flotante).
        ArrayList<Integer> cantidadpro = new ArrayList<>(); // Crea un ArrayList para almacenar cantidades de productos (como enteros).
        ArrayList<String> fechaVencimientopro = new ArrayList<>(); // Crea un ArrayList para almacenar fechas de vencimiento de productos (como cadenas).


        //definir arrays factura
        ArrayList<Integer> idfactura = new ArrayList<>();
         ArrayList<String> nombreprofactura = new ArrayList<>();
        ArrayList<Integer> cantidadfactura = new ArrayList<>();
        ArrayList<Float> preciofactura = new ArrayList<>();
        
        
        //alertas

        
        // Cargar datos del inventario desde un archivo (el método 'cargarDatosInventario' debería estar definido en alguna parte de tu código).
        cargarDatosInventario(idpro, nombrepro, preciopro, cantidadpro, fechaVencimientopro);
        cargarDatosVentas(idfactura, nombreprofactura, cantidadfactura, preciofactura);
        
        // Ordenar los datos del inventario (el método 'ordenar' debería estar definido en alguna parte de tu código).
        ordenar(idpro, nombrepro, preciopro, cantidadpro, fechaVencimientopro);
        System.out.println("Alertas");
        for (int i = 0; i < idpro.size(); i++) {
            // Itera a través de la lista de IDs de productos.
            if (cantidadpro.get(i)<20) {
                System.out.println("El producto "+nombrepro.get(i)+" esta proximo a agotarse quedan "+cantidadpro.get(i)+" unidades en Stock");
            }
        }
        do {
            n = 1; // Inicializa la variable 'n' a 1.

            System.out.println("\n------------------------------------------------------------------------");
            System.out.println("¿Qué proceso desea realizar?"); // Muestra un mensaje en la consola preguntando al usuario qué proceso desea realizar.
            System.out.println("1. Actualizar inventario"); // Muestra la opción 1: "Actualizar inventario" en la consola.
            System.out.println("2. Agregar venta"); // Muestra la opción 2: "Agregar venta" en la consola.
            System.out.println("3. Ver inventario");
            System.out.println("4. Ver ventas");// Muestra la opción 3: "Ver inventario" en la consola.
            System.out.println("5. Terminar proceso"); // Muestra la opción 4: "Terminar proceso" en la consola.  
            System.out.println("------------------------------------------------------------------------");         
            opc = entrada.nextInt(); // Lee la opción elegida por el usuario desde la entrada estándar.

            switch (opc) { // Inicia una estructura de control 'switch' basada en el valor de 'opc'.
                case 1: // Si 'opc' es igual a 1, ejecuta lo siguiente:
                    System.out.println("Actualizar inventario"); // Muestra un mensaje indicando que se está actualizando el inventario.
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("1. Agregar producto"); // Muestra la opción 1: "Agregar producto" en la consola.
                    System.out.println("2. Modificar producto"); // Muestra la opción 2: "Modificar producto" en la consola.
                    opc = entrada.nextInt(); // Lee la elección del usuario entre agregar o modificar producto.
            
                    switch (opc) { // Inicia un segundo 'switch' basado en la elección de agregar o modificar.
                        case 1: // Si 'opc' es igual a 1, ejecuta lo siguiente:
                            System.out.println("Agregar producto"); // Muestra un mensaje indicando que se está agregando un producto.
                            int id = escribirEnteros("Ingrese el ID: ", entrada); // Llama a la función 'escribirEnteros' para obtener el ID del producto.
                            int nR = noRepetir(idpro, id); // Llama a la función 'noRepetir' para verificar si el ID ya existe en el inventario.
                            if (nR != -1) { // Si el ID no se repite, realiza lo siguiente:
                                idpro.add(id); // Agrega el ID a la lista de IDs de productos.
                                String nombre = escribirCaracter("Ingrese el nombre del producto: ", entrada); // Llama a la función 'escribirCaracter' para obtener el nombre del producto.
                                nombrepro.add(nombre); // Agrega el nombre a la lista de nombres de productos.
                                Float precio = escribirReales("Ingrese el precio del producto: ", entrada); // Llama a la función 'escribirReales' para obtener el precio del producto.
                                preciopro.add(precio); // Agrega el precio a la lista de precios de productos.
                                int cantidad = escribirEnteros("Ingrese la cantidad del producto: ", entrada); // Llama a la función 'escribirEnteros' para obtener la cantidad del producto.
                                cantidadpro.add(cantidad); // Agrega la cantidad a la lista de cantidades de productos.
                                String fecha = escribirCaracter("Ingrese la fecha de vencimiento (dd/MM/yyyy): ", entrada); // Llama a la función 'escribirCaracter' para obtener la fecha de vencimiento del producto.
                                fechaVencimientopro.add(fecha); // Agrega la fecha de vencimiento a la lista.
                            } else {
                                System.out.println("El ID ingresado ya está en uso");
                            }
                            break;
                        case 2: // Si 'opc' es igual a 2, ejecuta lo siguiente:
                            int indice = buscarIndice("Ingrese el ID del producto a actualizar: ", entrada, idpro); // Llama a la función 'buscarIndice' para encontrar el índice del producto a actualizar.
                            if (indice != -1) { // Si se encuentra el índice, realiza lo siguiente:
                                id = escribirEnteros("Escriba el ID del producto actualizado: ", entrada); // Lee el nuevo ID del producto actualizado.
                                nR = noRepetir(idpro, id); // Llama a la función 'noRepetir' para verificar si el nuevo ID ya existe en el inventario.
                                if (nR != -1) { // Si el nuevo ID no se repite, realiza lo siguiente:
                                    String auxnombre = escribirCaracter("Ingrese el nombre del producto: ", entrada); // Llama a la función 'escribirCaracter' para obtener el nombre actualizado del producto.
                                    Float auxprecio = escribirReales("Ingrese el precio del producto: ", entrada); // Llama a la función 'escribirReales' para obtener el precio actualizado del producto.
                                    int auxcantidad = escribirEnteros("Ingrese la cantidad del producto: ", entrada); // Llama a la función 'escribirEnteros' para obtener la cantidad actualizada del producto.
                                    String auxfecha = escribirCaracter("Ingrese la fecha de vencimiento (dd/MM/yyyy): ", entrada); // Llama a la función 'escribirCaracter' para obtener la fecha de vencimiento actualizada del producto.
                                    idpro.set(indice, id); // Actualiza el ID en la lista de IDs de productos.
                                    nombrepro.set(indice, auxnombre); // Actualiza el nombre en la lista de nombres de productos.
                                    preciopro.set(indice, auxprecio); // Actualiza el precio en la lista de precios de productos.
                                    cantidadpro.set(indice, auxcantidad); // Actualiza la cantidad en la lista de cantidades de productos.
                                    fechaVencimientopro.set(indice, auxfecha); // Actualiza la fecha de vencimiento en la lista.
                                } else {
                                    System.out.println("El ID ingresado ya está en uso");
                                }
                            } else {
                                System.out.println("No se encontró el ID ingresado");
                            }
                            break;
                        default:
                            break;
                    }
                    break;
            
                case 2:
                        System.out.println("Agregar venta");
                        System.out.println("------------------------------------------------------------------------");
                        //escriba el id de la factura
                        int idf = escribirEnteros("Ingrese el número de la factura", entrada);
                        
                        int nRv = noRepetir(idfactura, idf);
                        if (nRv != -1) {
                            idfactura.add(idf);
                            //solicitar el id, con el id el llamada el precio y descuenta de la cantidad general del inventario
                            int indice = buscarIndice("Ingrese el id del producto", entrada, idpro);
                            int aux1 = cantidadpro.get(indice);
                            //solicita la cantidad
                            int cantf = escribirEnteros("Ingrese la cantidad", entrada);
                            cantidadfactura.add(cantf);
                            aux1 -= cantf;
                            cantidadpro.set(indice, aux1);
                            Float aux2 = preciopro.get(indice);
                            float  preciof = aux2*cantf;
                            preciofactura.add(preciof);
                            String auxnombre = nombrepro.get(indice);
                            nombreprofactura.add(auxnombre);
                            iva = 0.19;
                            System.out.println("------------------------------------------------------");
                            System.out.println("                 Esta es su factura");
                            System.out.println("Id factura: "+idf);
                            System.out.println("Nombre producto: : "+auxnombre);
                            System.out.println("Cantidad: "+cantf);
                            System.out.println("Valor unitario: "+aux2);
                            System.out.println("Valor Total iva: "+ (iva*preciof));
                            System.out.println("Valor total: " + (preciof+(preciof*iva)));
                        } else {
                            System.out.println("El ID ingresado ya está en uso");
                        }
                        
                        //solicitar la cantidad, la cantidad la multiplica por el precio
                        //mostar en pantalla la factura
                        //y guardar en un archivo lo que se vendio con su id de factura
                    break;
                case 3: // Si 'opc' es igual a 3, ejecuta lo siguiente:
                    System.out.print("\u001B[2J");
                    ordenar(idpro, nombrepro, preciopro, cantidadpro, fechaVencimientopro);
                    System.out.println("Ver inventario"); // Muestra un mensaje indicando que se está visualizando el inventario.
                    System.out.printf("%-20s %-20s %-20s %-20s %-20s\n", "Id", "Nombre", "Precio", "Cantidad", "Fecha Vencimiento"); // Imprime una cabecera de tabla con encabezados de columnas formateados.
                
                    mostrarInventario(idpro, nombrepro, preciopro, cantidadpro, fechaVencimientopro); // Llama a la función 'mostrarInventario' para mostrar el inventario en la consola.
                    break;  
                case 4: // Si 'opc' es igual a 4, ejecuta lo siguiente:
                    System.out.println("                               Ver ventas\n"); // Muestra un mensaje indicando que se está visualizando el inventario.
                    System.out.printf("%-20s %-20s %-20s %-20s\n", "Id factura", "Nombre Producto", "Cantidad", "Precio"); // Imprime una cabecera de tabla con encabezados de columnas formateados.
                
                    mostrarVentas (idfactura,nombreprofactura,cantidadfactura,preciofactura);
                    break;
                case 5: // Si 'opc' es igual a 4, ejecuta lo siguiente:
                    System.out.println("Fin del proceso"); // Muestra un mensaje indicando que el proceso está terminando.
                    n = 0; // Asigna 0 a la variable 'n' para finalizar el bucle y, por lo tanto, el proceso.
                    break; // Sale del 'switch' y continúa con el bucle 'do-while'.            
                default: // Si 'opc' no coincide con ningún caso anterior, ejecuta lo siguiente:
                    System.out.println("Opción incorrecta"); // Muestra un mensaje indicando que la opción elegida es incorrecta.
                    break; // Sale del 'switch'.
                
            } // Cierra el bloque del 'switch' interno que maneja la opción de agregar o modificar productos.
            guardarDatosVentas(idfactura, nombreprofactura, cantidadfactura, preciofactura);
            guardarDatosInventario(idpro, nombrepro, preciopro, cantidadpro, fechaVencimientopro); // Llama a la función 'guardarDatosInventario' para guardar los datos del inventario.
        } while (n != 0); // Ejecuta el bucle 'do-while' mientras 'n' no sea igual a 0, lo que permite al usuario realizar más acciones o finalizar el proceso.
    }

    public static int escribirEnteros(String mensaje, Scanner entrada) {
        System.out.println(mensaje); // Muestra un mensaje recibido como argumento, que solicita un número entero.
        return entrada.nextInt(); // Lee y retorna un número entero ingresado por el usuario desde el objeto Scanner 'entrada'.
    }

    public static String escribirCaracter(String mensaje, Scanner entrada) {
        System.out.println(mensaje); // Muestra un mensaje recibido como argumento, que solicita una cadena de texto.
        return entrada.next(); // Lee y retorna una cadena de texto ingresada por el usuario desde el objeto Scanner 'entrada'.
    }

    public static Float escribirReales(String mensaje, Scanner entrada) {
        System.out.println(mensaje); // Muestra un mensaje recibido como argumento, que solicita un número de punto flotante.
        return entrada.nextFloat(); // Lee y retorna un número de punto flotante ingresado por el usuario desde el objeto Scanner 'entrada'.
    }

    public static void mostrarInventario(ArrayList<Integer> idpro, ArrayList<String> nombrepro, ArrayList<Float> preciopro, ArrayList<Integer> cantidadpro, ArrayList<String> fechaVencimientopro) {
        for (int i = 0; i < idpro.size(); i++) {
            // Imprime los datos del inventario formateados en columnas con un ancho de 20 caracteres.
            System.out.printf("%-20s %-20s %-20s %-20s %-20s\n", idpro.get(i), nombrepro.get(i), preciopro.get(i), cantidadpro.get(i), fechaVencimientopro.get(i));
        }
    }
    
    public static void mostrarVentas(ArrayList<Integer> idfactura, ArrayList<String> nombreprofactura, ArrayList<Integer> cantidadfactura, ArrayList<Float> preciofactura){
        for (int i = 0; i < idfactura.size(); i++) {
            // Imprime los datos del inventario formateados en columnas con un ancho de 20 caracteres.
            System.out.printf("%-20s %-20s %-20s %-20s\n", idfactura.get(i), nombreprofactura.get(i), cantidadfactura.get(i), preciofactura.get(i));
        }
    }

    private static void cargarDatosInventario(ArrayList<Integer> idpro, ArrayList<String> nombrepro, ArrayList<Float> preciopro, ArrayList<Integer> cantidadpro, ArrayList<String> fechaVencimientopro) {
        try (BufferedReader br = new BufferedReader(new FileReader("inventario.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(","); // Divide la línea en partes usando la coma como separador.
                idpro.add(Integer.parseInt(parts[0])); // Convierte la primera parte en un entero y la agrega a la lista de IDs.
                nombrepro.add(parts[1]); // Agrega la segunda parte a la lista de nombres.
                preciopro.add(Float.parseFloat(parts[2])); // Convierte la tercera parte en un número de punto flotante y la agrega a la lista de precios.
                cantidadpro.add(Integer.parseInt(parts[3])); // Convierte la cuarta parte en un entero y la agrega a la lista de cantidades.
                fechaVencimientopro.add(parts[4]); // Agrega la quinta parte a la lista de fechas de vencimiento.
            }
        } catch (FileNotFoundException e) {
            // El archivo no existe, se inicia con un inventario vacío.
        } catch (Exception e) {
            e.printStackTrace(); // Maneja cualquier excepción no controlada e imprime el seguimiento de la pila en caso de error.
        }
    }
    
    private static void guardarDatosInventario(ArrayList<Integer> idpro, ArrayList<String> nombrepro, ArrayList<Float> preciopro, ArrayList<Integer> cantidadpro, ArrayList<String> fechaVencimientopro) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("inventario.txt"))) {
            // Abre un BufferedWriter para escribir en el archivo "inventario.txt".
            for (int i = 0; i < idpro.size(); i++) {
                // Itera a través de las listas de datos del producto.
                String line = idpro.get(i) + "," + nombrepro.get(i) + "," + preciopro.get(i) + "," + cantidadpro.get(i) + "," + fechaVencimientopro.get(i);
                bw.write(line); // Escribe una línea en el archivo que contiene los datos del producto, separados por comas.
                bw.newLine(); // Escribe un salto de línea para separar las entradas de productos.
            }
        } catch (IOException e) {
            e.printStackTrace(); // Maneja cualquier excepción de E/S (entrada/salida) y muestra el seguimiento de la pila en caso de error.
        }
    }

    private static void cargarDatosVentas(ArrayList<Integer> idfactura, ArrayList<String> nombreprofactura, ArrayList<Integer> cantidadfactura, ArrayList<Float> preciofactura) {
        try (BufferedReader br = new BufferedReader(new FileReader("Ventas.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(","); // Divide la línea en partes usando la coma como separador.
                idfactura.add(Integer.parseInt(parts[0])); // Convierte la primera parte en un entero y la agrega a la lista de IDs.
                nombreprofactura.add(parts[1]); // Agrega la segunda parte a la lista de nombres.
                cantidadfactura.add(Integer.parseInt(parts[2])); // Convierte la tercera parte en un número de punto flotante y la agrega a la lista de precios.
                preciofactura.add(Float.parseFloat(parts[3])); // Convierte la cuarta parte en un entero y la agrega a la lista de cantidades.
            }
        } catch (FileNotFoundException e) {
            // El archivo no existe, se inicia con un inventario vacío.
        } catch (Exception e) {
            e.printStackTrace(); // Maneja cualquier excepción no controlada e imprime el seguimiento de la pila en caso de error.
        }
    }

    private static void guardarDatosVentas(ArrayList<Integer> idfactura, ArrayList<String> nombreprofactura, ArrayList<Integer> cantidadfactura, ArrayList<Float> preciofactura) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Ventas.txt"))) {
            // Abre un BufferedWriter para escribir en el archivo "inventario.txt".
            for (int i = 0; i < idfactura.size(); i++) {
                // Itera a través de las listas de datos del producto.
                String line = idfactura.get(i) + "," + nombreprofactura.get(i) + "," + cantidadfactura.get(i) + "," + preciofactura.get(i);
                bw.write(line); // Escribe una línea en el archivo que contiene los datos del producto, separados por comas.
                bw.newLine(); // Escribe un salto de línea para separar las entradas de productos.
            }
        } catch (IOException e) {
            e.printStackTrace(); // Maneja cualquier excepción de E/S (entrada/salida) y muestra el seguimiento de la pila en caso de error.
        }
    }
    
    //buscar el indice de un producto
    public static int buscarIndice(String mensaje, Scanner entrada, ArrayList<Integer> idpro) {
        System.out.println(mensaje); // Muestra un mensaje recibido como argumento, solicitando un valor.
        int aux = entrada.nextInt(); // Lee un valor entero ingresado por el usuario desde la entrada estándar y lo almacena en 'aux'.
        for (int i = 0; i < idpro.size(); i++) {
            // Itera a través de la lista de IDs de productos.
            if (aux == idpro.get(i)) {
                // Compara 'aux' con el valor en la posición 'i' de la lista de IDs.
                return i; // Si encuentra una coincidencia, devuelve el índice (posición) en el que se encontró.
            }
        }
    
        // Si no se encontró ninguna coincidencia, devuelve -1 para indicar que no se encontró el valor.
        return -1;
    }
    
    //metodo para que no se repita el id de los productos
    public static int noRepetir(ArrayList<Integer> idpro, int id) {
        // Itera a través de la lista de IDs de productos.
        for (int i = 0; i < idpro.size(); i++) {
          if (id == idpro.get(i)) {
            // Si encuentra una coincidencia, devuelve -1 y sale del bucle.
            return -1;
          } else {
            // Si no encuentra una coincidencia, continúa con el bucle.
            continue;
          }
        }
      
        // Si no se encontró ninguna coincidencia, devuelve 1.
        return 1;
      }
         

    public static void ordenar(ArrayList<Integer> idpro, ArrayList<String> nombrepro, ArrayList<Float> preciopro, ArrayList<Integer> cantidadpro, ArrayList<String> fechaVencimientopro) {
        // Método de ordenamiento de burbuja
    
        int n = idpro.size(); // Obtiene el tamaño de la lista de IDs de productos (número de productos).
        for (int i = 0; i < n - 1; i++) {
            // Itera a través de los elementos desde el primero hasta el penúltimo.
            for (int j = 0; j < n - i - 1; j++) {
                // Itera a través de los elementos desde el primero hasta el último elemento no ordenado.
                if (idpro.get(j) > idpro.get(j + 1)) {
                    // Compara los IDs en las posiciones 'j' y 'j + 1'.
                    // Si el ID en 'j' es mayor que el ID en 'j + 1', se necesita intercambiar los elementos para ordenar.
    
                    // Intercambiar los elementos mal ordenados del idpro
                    int tempId = idpro.get(j);
                    idpro.set(j, idpro.get(j + 1));
                    idpro.set(j + 1, tempId);
    
                    // Intercambiar el nombre con respecto al ID
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