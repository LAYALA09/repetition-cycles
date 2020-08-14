package ar.com.ada.online.second.repetitioncycles;
//Se tiene una matriz de 12 filas por 19 , encontrar
//todos sus elementos negativos y para que les cambie ese valor negativo por un cero.

import java.util.Scanner;

public class ExerciseEleven {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int arrayA[][] = new int[12][19];


        //Cargar la matriz
        System.out.println("Ingrese valor ");
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(arrayA[i][j] + " ");
                System.out.print("arrayA[ " + i + " ][ " + j + " ] : ");
                arrayA[i][j] = keyboard.nextInt();
            }

        }
        //Detectar valores negativos y transformarlos en 0
        System.out.println("Matriz original:");
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(arrayA[i][j] + " ");
                if (arrayA[i][j] < 0) {
                    arrayA[i][j] = 0;
                }
            }
            System.out.println(" ");
        }
        System.out.println("Matriz modificada");
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(arrayA[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}