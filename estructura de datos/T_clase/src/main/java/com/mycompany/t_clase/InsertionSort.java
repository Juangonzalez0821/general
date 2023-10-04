/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t_clase;

/**
 *
 * @author Gonzalez
 */
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    
    public static void main(String[] args) {
        // Declarar y llenar el arreglo 'edad'
        int[] edad = {32, 18, 45, 28, 50, 22, 19, 35, 40, 30};
        
        // Llamar al método de ordenamiento por inserción
        insertionSort(edad);
        
        // Imprimir el arreglo ordenado
        System.out.println("Arreglo 'edad' ordenado:");
        for (int valor : edad) {
            System.out.print(valor + " ");
        }
    }
}
