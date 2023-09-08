// See https://aka.ms/new-console-template for more information
using System;

class Ejercicio_E
{
    static void Main()
    {
        int opc;
        Console.WriteLine("Calcular el área de un triángulo, cuadrado y circulo:");
        Console.WriteLine("1. calcula area de un Triangulo");
        Console.WriteLine("2. calcula area de un Cuadrado");
        Console.WriteLine("3. calcula area de un circulo");
        Console.WriteLine("4. terminar el proceso");
        opc = int.Parse(Console.ReadLine());
        switch (opc)
        {
            case 1: 
                int opci;
                Console.WriteLine("1. Triángulo Rectángulo");
                Console.WriteLine("2. Triángulo Equilátero");
                Console.WriteLine("3. Triángulo Isósceles o Escaleno");
                Console.WriteLine("Seleccione el tipo de Triángulo: ");
                opci = int.Parse(Console.ReadLine());
                double cateto1, cateto2, cateto3, hipotenusa, perimetro, semip;
                switch (opci)
                {
                    case 1:
                        Console.WriteLine("Ingrese la longitud de un cateto");
                        cateto1 = double.Parse(Console.ReadLine());
                        Console.WriteLine("Ingrese la longitud de la hipotenusa");
                        hipotenusa = double.Parse(Console.ReadLine());
                        Console.WriteLine("Área del Triángulo Rectángulo: {0}", (cateto1 * hipotenusa) / 2);
                        break;
                    case 2:
                        Console.WriteLine("ngresa la longitud de un lado del Triangulo Equilatero: ");
                        cateto1 = double.Parse(Console.ReadLine());
                        Console.WriteLine("Área del Triángulo Equilátero: {0}", (cateto1 * cateto1 * Math.Sqrt(3)) / 4);
                        break;
                    case 3:
                        Console.WriteLine("Ingresa la longitud del lado 1: ");
                        cateto1 = double.Parse(Console.ReadLine());
                        Console.WriteLine("Ingresa la longitud del lado 2: ");
                        cateto2 = double.Parse(Console.ReadLine());
                        Console.WriteLine("Ingresa la longitud del lado 3: ");
                        cateto3 = double.Parse(Console.ReadLine());
                        perimetro = cateto1 + cateto2 + cateto3;
                        semip = perimetro/ 2;
                        Console.WriteLine("Área de un Isósceles o Escaleno: {0}", Math.Sqrt(semip * (semip - cateto1) * (semip - cateto2) * (semip - cateto3)));
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                Console.WriteLine("Ingresa la medida de un lado del Cuadrado: ");
                int lado = int.Parse(Console.ReadLine());
                Console.WriteLine("El area del cuadrado es: {0}", (lado*lado));
                break;
            case 3:
                Console.WriteLine("Ingresa la medida del radio del circulo: ");
                double radio= double.Parse(Console.ReadLine());
                Console.WriteLine("El area del circulo es: {0}", (Math.PI * Math.Pow(radio, 2)));
                
                break;
            default:
                break;
        }
        Console.WriteLine("Presione cualquier tecla para salir.");
        Console.ReadKey();
    }
}


