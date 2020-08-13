package ar.com.ada.online.second.repetitioncycles;
// Lea una matriz de cinco filas y cinco columnas  que cuente los
//elementos negativos que contiene, así como también cuántos elementos de la diagonal
//principal son igual a cero.

import java.util.Scanner;


public class ExerciseFourteen {
    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);
        int array[][] = new int[5][5];
        int negativeValues = 0;
        int sumDiagonalZeros = 0;


        //Cargar la matriz
        System.out.println("Ingrese valor ");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
                System.out.print("array[ " + i + " ][ " + j + " ] : ");
                array[i][j] = keyboard.nextInt();
            }

        }
        //contamos los valores negativos de la matriz y cantidad de ceros en diag principal"
        System.out.println("Matriz original:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
                if (array[i][j] < 0) {
                    negativeValues += 1;
                }
                if (i == j) {
                    if (array[i][j] == 0) {
                        sumDiagonalZeros += 1;
                    }

                }

            }
            System.out.println(" ");
        }
        System.out.println("La cantidad de elementos negativos es: " + negativeValues);
        System.out.println("La cantidad de 0 de la diagonal principal es: " + sumDiagonalZeros);
    }
}