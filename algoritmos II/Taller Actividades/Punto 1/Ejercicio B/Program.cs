﻿// See https://aka.ms/new-console-template for more information
using System;

class Program
{
    static void Main()
    {
        double suma = 0;
        double promedio = 0;
        Console.WriteLine("¿Cuántos números va a ingresar?");
        int l = int.Parse(Console.ReadLine());

        for (int i = 1; i <= l; i++)
        {
            Console.WriteLine("Ingrese el número {0}", i);
            double numero = double.Parse(Console.ReadLine());
            suma = suma + numero;
        }
        promedio = suma / l;
        Console.WriteLine("El promedio de los números es: {0}", promedio);
    }
}