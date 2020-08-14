package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

//Se tiene un arreglo de 15 filas y 12 columnas. Realice un algoritmo que permita leer el
//arreglo y que calcule y presente los resultados siguientes:
//El menor elemento del arreglo; la suma de los elementos de las cinco primeras filas del
//arreglo; y el total de elementos negativos en las columnas de la quinta a la nueve.
public class ExerciseEight {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int array[][] = new int[15][12];
        int negativeValues = 0;
        int sumElements = 0;
        double less = 0;


        //Cargar la matriz
        System.out.println("Ingrese valor ");
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 12; j++) {

                System.out.print("array[ " + i + " ][ " + j + " ] : ");
                array[i][j] = keyboard.nextInt();
            }

        }
        ///imprimo matriz
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }

        //calculo del menor valor
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 12; j++) {
                if (less > array[i][j]) { ///calculo el menor
                    less = array[i][j];
                }

            }

        }

        //suma de determinadas filas
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 12; j++) {
                sumElements += array[i][j];
            }
        }
        //valores negativos de determinadas columnas
        for (int i = 0; i < 15; i++) {
            for (int j = 4; j < 9; j++) {
                if (array[i][j] < 0) {
                    negativeValues += 1;
                }
            }
            System.out.println(" ");
        }
        System.out.println("El menor elemento del arreglo es: " + less);
        System.out.println("El total de elementos negativos en las columnas de la quinta a la nueve es: " + negativeValues);
        System.out.println("La suma de los elementos de las cinco primeras filas es: " + sumElements);
    }


}

