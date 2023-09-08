// See https://aka.ms/new-console-template for more information
using System;

class Ejercicio_A
{
    static void Main()
    {
        int numero;
        int suma = 0;
        Console.WriteLine("Sumar números hasta que se ingrese un cero:");
        do
        {
            Console.WriteLine("Ingresa un número (ingresa 0 para salir): ");
            numero = int.Parse(Console.ReadLine());
            if (numero != 0)
            {
                suma =suma+ numero;
            }else
            {
                Console.WriteLine("Saliendo del programa...");
            }
        } while (numero != 0);
        Console.WriteLine("la suma es: {0}", suma);
        Console.WriteLine("Fin del programa.");
        Console.WriteLine("Presione cualquier tecla para salir.");
        Console.ReadKey();

    }
}




