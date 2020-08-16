package ar.com.ada.online.second.repetitioncycles;
//Calcule el valor que se obtiene al multiplicar entre sí los
//elementos de la diagonal principal de una matriz de 5 por 5 elementos

import java.util.Scanner;

public class ExerciseNineteen {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int arrayA[][] = new int[5][5];



        //Cargar la matriz
        System.out.println("Ingrese valor ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arrayA[i][j] + " ");
                System.out.print("arrayA[ " + i + " ][ " + j + " ] : ");
                arrayA[i][j] = keyboard.nextInt();
            }
            System.out.println(" ");
        }
        //Muestro matriz A
        System.out.println("Matriz A  ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arrayA[i][j] + " ");
                if (i == j) {
                    arrayA[i][j] = arrayA[i][j] * arrayA[i][j];
                }
            }
            System.out.println(" ");
        }
        //Muestro matriz A
        System.out.println("Matriz A cuya diagonal fue multiplicada entre si  ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arrayA[i][j] + " ");


            }
            System.out.println(" ");
        }
    }
}
