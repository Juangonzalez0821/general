// See https://aka.ms/new-console-template for more information
using System;

class Ejercicio_B
{
    static void Main()
    {
        int numero;
        Console.WriteLine("Determinar si un número es primo:");
        Console.WriteLine("Ingresa un numero");
        numero = int.Parse(Console.ReadLine());
        if (numero % 2 == 0 || numero % 3 == 0 || numero % 5 == 0 )
        {
            if (numero == 2 || numero == 3 || numero == 5)
            {
                Console.WriteLine("el numero ingresado es primo");
            }else
            {
                Console.WriteLine("no es un numero primo");
            }
        }
        else
        {
            Console.WriteLine("el numero ingresado es primo");
        }
        Console.WriteLine("Presione cualquier tecla para salir.");
        Console.ReadKey();
    }
}

