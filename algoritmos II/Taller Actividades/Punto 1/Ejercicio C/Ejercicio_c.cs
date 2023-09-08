// See https://aka.ms/new-console-template for more information

using System;

class Ejercicio_c
{
    static void Main()
    {
        int n1, //cp, cip;
        Console.WriteLine("Digite la cantidad de números que quiere contar");
        int n = int.Parse(Console.ReadLine());

        for (int i = 1 ; i <= n ; i++ ){
            Console.WriteLine("Digite número {0}", i);

        }
    }
}
