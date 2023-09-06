// See https://aka.ms/new-console-template for more information
using System;

class Program
{
    public static void Main(string[] args)
    {
        int numero;
        Console.WriteLine("ingrese el numero");
        numero = int.Parse(Console.ReadLine());

        Console.WriteLine("el numero es: {0}", numero);
        for (int i = numero; i != 0; i--)
        {
            Console.WriteLine(i);
        }

    }
}