package ar.com.ada.online.second.repetitioncycles;


import java.util.Scanner;

//Se tienen dos matrices cuadradas (de 12 filas y 12 columnas cada una). Realice un
//algoritmo que lea los arreglos y que determine si la diagonal principal de la primera es
//igual a la diagonal principal de la segunda. (Diagonal principal es donde los subíndices I,
//J son iguales).
public class ExerciseTen {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int arrayA[][] = new int[12][12];
        int arrayB[][] = new int[12][12];
        int ResultsumA = 0;
        int ResultsumB = 0;


        //Cargar la matriz A
        System.out.println("Ingrese valor matriz A");
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.print(arrayA[i][j] + " ");
                System.out.print("array[ " + i + " ][ " + j + " ] : ");
                arrayA[i][j] = keyboard.nextInt();
                if (i == j) {
                    ResultsumA += 1;

                }
            }
        }
        //Cargar la matriz B
        System.out.println("Ingrese valor matriz B");
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.print(arrayA[i][j] + " ");
                System.out.print("array[ " + i + " ][ " + j + " ] : ");
                arrayB[i][j] = keyboard.nextInt();
                if (i == j) {
                    ResultsumB += 1;

                }
            }

        }
        //Comparamos equivalencia de diagonal principal de A y B

        if (ResultsumA == ResultsumB) {
            System.out.println("Ambas matrices tienen igual diagonal");


        }
    }
}






