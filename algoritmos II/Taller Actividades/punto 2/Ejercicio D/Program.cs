// See https://aka.ms/new-console-template for more information
using System;

class Ejercicio_D
{
    static void Main()
    {
        int r = 1;
        Console.WriteLine("Factorial de un número: ");
        Console.WriteLine("Ingre el numero que desea sacar el factorial");
        int n = int.Parse(Console.ReadLine());
        for (int i = 1; i <= n; i++)
        {
            r = r * i;
        }
        Console.WriteLine("el factorial de {0} es: {1}", n, r);
        Console.WriteLine("Presione cualquier tecla para salir.");
        Console.ReadKey();
    }
}



