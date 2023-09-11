// See https://aka.ms/new-console-template for more information

using System;

class Ejercicio_c
{
    static void Main()
    {
        int cp = 0;
        int cip = 0;
        Console.WriteLine("Contar números pares e impares: ");
        Console.WriteLine("Digite la cantidad de números que quiere contar");
        int n = int.Parse(Console.ReadLine());

        for (int i = 1 ; i <= n ; i++ ){
            Console.WriteLine("Digite número {0}", i);
            int n1 = int.Parse(Console.ReadLine());

            if (n1 % 2 ==0)
            {
                cp++;
                Console.WriteLine("El numero ingresado es par ");
            }else
            {
                cip++;
                Console.WriteLine("El numero ingresado es impar ");
            }
        }
        Console.WriteLine("El número de pares es: {0}", cp);
        Console.WriteLine("El número de impares es: {0}", cip);
        Console.WriteLine("Presione cualquier tecla para salir.");
        Console.ReadKey();
    }
}
