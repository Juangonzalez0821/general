import java.util.Scanner;

public class EjemploDoWhile {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Iniciamos un bucle do-while, que se ejecutará al menos una vez
        do {
            // Solicitamos al usuario que ingrese un número positivo o 0 para salir
            System.out.print("Ingresa un número positivo (ingresa 0 para salir): ");
            numero = scanner.nextInt();

            // Verificamos el valor del número ingresado
            if (numero > 0) {
                System.out.println("Has ingresado un número positivo.");
            } else if (numero < 0) {
                System.out.println("Has ingresado un número negativo.");
            } else {
                System.out.println("Saliendo del programa...");
            }
        } while (numero != 0); // Continuamos el bucle mientras el número sea diferente de 0

        // Imprimimos un mensaje al finalizar el bucle
        System.out.println("Fin del programa.");
    }
}
