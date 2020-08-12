package ar.com.ada.online.second.repetitioncycles;
//Lea
//un arreglo de M filas y N columnas y que calcule la suma de los elementos de la diagonal principal.

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int sumOfDiagonalValues = 0;
        int row;
        int column;
        //Ingreso datos A
        System.out.println(" Ingrese el tamaño de la fila de la matriz A");
        row = keyboard.nextInt();
        System.out.println(" Ingrese el tamaño de la Columna de la matriz A");
        column = keyboard.nextInt();
        if (row == column) {
            int array[][] = new int[row][column];

            System.out.println("Digite la matriz A");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.println("array[ " + i + " ][ " + j + " ] : ");

                    array[i][j] = keyboard.nextInt();

                }
                System.out.println(" ");
            }

            System.out.println("Matriz original:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print(array[i][j] + " ");
                    if (i == j) {
                        sumOfDiagonalValues += array[i][j];
                    }
                }
                System.out.println(" ");
            }
        } else {
            System.out.print("No es valido, fila y columna deben ser de igual dimensión");
        }
        System.out.print("La suma de los elementos de la diagonal principal es: " + sumOfDiagonalValues);
    }
}

