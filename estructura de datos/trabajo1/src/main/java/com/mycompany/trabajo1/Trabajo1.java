package com.mycompany.trabajo1;

import java.util.Scanner;
/**
 *
 * @author Gonzalez
 */
public class Trabajo1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 1;
        do {
            System.out.println("1. calcula area y perimetro del Rectangulo");
            System.out.println("2. calcula area y perimetro del Cuadrado");
            System.out.println("3. calcula area y perimetro del Triangulo");
            System.out.println("4. calcula area y perimetro del Trapecio");
            System.out.println("5. calcula la tabla de multiplicar de un numero");
            System.out.println("6. terminar el proceso");
            System.out.print("Elige una opcion: ");
            int opc = teclado.nextInt();
            switch (opc){
                case 1 -> {
                    System.out.print("Ingresa la medida de la Base del Rectangulo: ");
                    double Base  = teclado.nextDouble();
                    System.out.print("Ingresa la medida de la Altura del Rectangulo: ");
                    double Altura  = teclado.nextDouble();
                    double Perimetro = 2 * (Base + Altura);
                    double Area  = Base * Altura;
                    System.out.println("El area del Rectangulo es: " + Area);
                    System.out.println("El perimetro del Rectangulo es: " + Perimetro);
                }
                case 2 -> {
                    System.out.print("Ingresa la medida de un lado del Cuadrado: ");
                    double lado  = teclado.nextDouble();
                    double Perimetro = 4 * lado ;
                    double Area  = lado  * lado;
                    System.out.println("El area del Cuadrado es: " + Area);
                    System.out.println("El perimetro del Cuadrado es: " + Perimetro);
                }
                case 3 -> {
                    int t = 1;
                    do{
                        System.out.println("1. Triangulo Rectangulo");
                        System.out.println("2. Triangulo Equilatero");
                        System.out.println("3. Triangulo Isosceles o Escaleno");
                        System.out.print("Seleccione el tipo de Triangulo: ");
                        int opci = teclado.nextInt();
                
                        switch (opci) {
                            case 1 -> {
                                System.out.print("Ingresa la longitud del cateto 1: ");
                                double cateto1 = teclado.nextDouble();
                                System.out.print("Ingresa la longitud del cateto 2: ");
                                double cateto2 = teclado.nextDouble();
                                System.out.print("Ingresa la longitud de la hipotenusa: ");
                                double hipotenusa = teclado.nextDouble();
                                double area = (cateto1 * hipotenusa) / 2;
                                double perimetro = cateto1 + cateto2 + hipotenusa;
                                System.out.println("area del Triangulo Rectangulo: " + area);
                                System.out.println("perimetro del Triangulo Rectangulo: " + perimetro);
                            }
                            case 2 -> {
                                System.out.print("Ingresa la longitud de un lado del Triangulo Equilatero: ");
                                double lado = teclado.nextDouble();
                                double area = (Math.sqrt(3) / 4)*(lado*lado);
                                double p  = lado * 3;
                                System.out.println("area del Triangulo Equilatero: " + area);
                                System.out.println("perimetro del Triangulo Equilatero: " + p);
                            }
                            case 3 -> {
                                System.out.print("Ingresa la longitud del lado 1: ");
                                double lado1 = teclado.nextDouble();
                                System.out.print("Ingresa la longitud del lado 2: ");
                                double lado2 = teclado.nextDouble();
                                System.out.print("Ingresa la longitud del lado 3: ");
                                double lado3 = teclado.nextDouble();
                                double perimetro = lado1 + lado2 + lado3;
                                double semip = perimetro/ 2;
                                double area = Math.sqrt(semip * (semip - lado1) * (semip - lado2) * (semip - lado3));
                                System.out.println("area de un Isosceles o Escaleno: " + area);
                                System.out.println("perimetro de un Isosceles o Escaleno: " + perimetro);
                            }
                            default -> {
                                System.out.println("la opcion que ingresaste es invalida\n");

                            } 
                        }
                        t = t - 1;
                    } while (t != 0);
                }
                case 4 -> {
                    System.out.print("Ingresa la longitud de la base mayor: ");
                    double baseMayor = teclado.nextDouble();
                    System.out.print("Ingresa la longitud de la base menor: ");
                    double baseMenor = teclado.nextDouble();
                    System.out.print("Ingresa la altura: ");
                    double altura = teclado.nextDouble();
                    System.out.print("Ingresa la longitud de uno de los lados: ");
                    double lado1 = teclado.nextDouble();
                    System.out.print("Ingresa la longitud del otro lado: ");
                    double lado2 = teclado.nextDouble();
                    double area = ((baseMayor + baseMenor) / 2) * altura;
                    double perimetro = baseMayor + baseMenor + lado1 + lado2;
                    System.out.println("El area del trapecio es: " + area);
                    System.out.println("El perimetro del trapecio es: " + perimetro);
                }
                case 5 -> {
                    System.out.print("Ingresa el numero del cual deseas saber la tabla: ");
                    double num = teclado.nextDouble();
                    if (num % 2 == 0) {
                        System.out.println("El numero es par.");
                    } else {
                        System.out.println("El numero es impar.");
                    }
                    for (int i = 1; i <= 10; i++) {
                        int resultado = (int) (num * i);
                        System.out.println(num + " x " + i + " = " + resultado);
                    }
                }
                case 6 -> {
                    System.out.println("terminaste el proceso");
                    n = n - 1;
                }
                default -> {
                    System.out.println("la opcion que ingresaste es invalida\n");
                } 
            }   
        } while (n != 0);
        System.out.println("Fin del programa.");   
    }
}




