// See https://aka.ms/new-console-template for more information
using System;

class Program
{
    static int Power(int baseNum, int exponent)
    {
        if (exponent == 0)
            return 1;

        return baseNum * Power(baseNum, exponent - 1);
    }

    static void Main(string[]args)
    {
        int baseNum = 2;
        int exponent = 5;
        int result = Power(baseNum, exponent);
        Console.WriteLine($"{baseNum} elevado a la potencia {exponent} es: {result}");
    }
}