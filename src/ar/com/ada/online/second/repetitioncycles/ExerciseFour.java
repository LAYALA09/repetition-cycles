package ar.com.ada.online.second.repetitioncycles;
//Obtener una matriz como el resultado de la resta de dos
//matrices de orden M x N.

import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int rowA;
        int columnA;
        int rowB;
        int columnB;
        //Ingreso datos
        System.out.println(" Ingrese el tamaño de la fila de la matriz A");
        rowA = keyboard.nextInt();
        System.out.println(" Ingrese el tamaño de la Columna de la matriz A");
        columnA = keyboard.nextInt();
        System.out.println(" Ingrese el tamaño de la fila de la matriz B");
        rowB = keyboard.nextInt();
        System.out.println(" Ingrese el tamaño de la Columna de la matriz B");
        columnB = keyboard.nextInt();

        if (rowA == columnA && rowB == columnB) {
            if (rowA == rowB && columnA == columnB) {

                int arrayA[][] = new int[rowA][columnA];
                int arrayB[][] = new int[rowB][columnB];
                int arrayC[][] = new int[rowB][columnB];

                System.out.println("Digite la matriz A");
                for (int i = 0; i < rowA; i++) {
                    for (int j = 0; j < columnA; j++) {

                        System.out.println("arrayA[ " + i + " ][ " + j + " ] : ");

                        arrayA[i][j] = keyboard.nextInt();

                    }
                    System.out.println(" ");
                }
                System.out.println("Digite la matriz B");
                for (int i = 0; i < rowB; i++) {
                    for (int j = 0; j < columnB; j++) {

                        System.out.println("arrayB[ " + i + " ][ " + j + " ] : ");

                        arrayB[i][j] = keyboard.nextInt();

                    }
                    System.out.println(" ");
                }

                //Imprimo matriz A y resto A y B para obtener C
                System.out.println("Matriz A");
                for (int i = 0; i < rowB; i++) {
                    for (int j = 0; j < columnB; j++) {

                        System.out.print(arrayA[i][j] + " ");

                        arrayC[i][j] = arrayA[i][j] - arrayB[i][j];

                    }
                    System.out.println(" ");
                }
                //Imprimo matriz B
                System.out.println("Matriz B");
                for (int i = 0; i < rowB; i++) {
                    for (int j = 0; j < columnB; j++) {

                        System.out.print(arrayB[i][j] + " ");
                    }
                    System.out.println(" ");
                }
                //Imprimo matriz C
                System.out.println("Matriz C");
                for (int i = 0; i < rowB; i++) {
                    for (int j = 0; j < columnB; j++) {

                        System.out.print(arrayC[i][j] + " ");
                    }
                    System.out.println(" ");
                }

            } else {
                System.out.print("No es valido, las matrices deben ser de igual dimensión");
            }


        } else {
            System.out.print("No es valido, filas y columnas deben ser de igual dimensión");

        }


    }
}
