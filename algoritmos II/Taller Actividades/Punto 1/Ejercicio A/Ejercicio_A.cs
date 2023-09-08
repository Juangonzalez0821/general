// See https://aka.ms/new-console-template for more information
using System;

class Ejercicio_A
{
    static void Main()
    {
        Console.Write("Tabla de multiplicar:");
        Console.Write("ingrese un numero para generar la tabla de multiplicar: ");Console.Write("ingrese un numero para generar la tabla de multiplicar: ");
        int numero = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine("tabla de multiplicar del {0} : ", numero);
        for (int i = 1; i <= 10; i++)
        {
            int r = numero * i;
            Console.WriteLine("{0} * {1} = {2}", numero, i, (numero*i));
        }
    Console.WriteLine("Presione cualquier tecla para salir.");
    Console.ReadKey();
    }
}
