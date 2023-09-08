// See https://aka.ms/new-console-template for more information
using System;

class Ejercicio_C
{
    static void Main()
    {
        Console.WriteLine("Contar los dígitos de un número:");
        int n;
        int contador;
        double nt;
        Console.WriteLine("Ingrese un número:");
        n = int.Parse(Console.ReadLine());
        contador = 0;
        if (n == 0)
        {
            contador =1;
        }
        nt = Math.Abs(n);
        while (nt >= 1)
        {
            nt=nt/10;
            contador++;
        }

        Console.WriteLine("El número tiene {0} dígitos.", contador);
        Console.WriteLine("Presione cualquier tecla para salir.");
        Console.ReadKey();
    }
}