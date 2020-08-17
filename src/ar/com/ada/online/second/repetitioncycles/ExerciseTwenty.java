package ar.com.ada.online.second.repetitioncycles;
//A partir de la matriz del problema anterior encuentre cuántos
//elementos tienen valor par y cuántos valores impares.

import java.util.Scanner;

public class ExerciseTwenty {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int arrayA[][] = new int[5][5];
        int countedPair = 0;
        int countedOdd = 0;


        //Cargar la matriz
        System.out.println("Ingrese valor ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arrayA[i][j] + " ");
                System.out.print("arrayA[ " + i + " ][ " + j + " ] : ");
                arrayA[i][j] = keyboard.nextInt();
            }

        }
        //Determino nro. par e impar
        System.out.println("Matriz A");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arrayA[i][j] + " ");
                if (arrayA[i][j] % 2 == 0) {
                    countedPair += 1;
                } else {
                    countedOdd += 1;
                }


            }
            System.out.println(" ");

        }


        System.out.println("Cantidad de números pares de la matriz : " + countedPair);
        System.out.println("Cantidad de números impares de la matriz : " + countedOdd);
    }
}