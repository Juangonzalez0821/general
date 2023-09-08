// See https://aka.ms/new-console-template for more information
using System;

class Ejercicio_F
{
    static void Main()
    {
        Console.WriteLine("Convertir de grados Celsius a Fahrenheit y Kelvin.:");
        double celsius, fahrenheit, kelvin;
        Console.Write("Ingrese la temperatura en grados Celsius: ");
        celsius = Convert.ToDouble(Console.ReadLine());
        fahrenheit = (celsius * 9 / 5) + 32;
        kelvin = celsius + 273.15;
        Console.WriteLine("Temperatura en grados Fahrenheit: " + fahrenheit);
        Console.WriteLine("Temperatura en Kelvin: " + kelvin);
        Console.WriteLine("Presione cualquier tecla para salir.");
        Console.ReadKey();
    }
}


