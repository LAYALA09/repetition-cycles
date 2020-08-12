package ar.com.ada.online.second.repetitioncycles;
//Realice y represente  el producto de dos matrices de orden M x N y P x Q.

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);
        //int arrayA[][];

        //int arrayB[][] ;
        //int arrayC[][];
        int rowB;
        int columnB;

        int rowA;
        int columnA;


        //Ingreso datos A
        System.out.println(" Ingrese el tamaño de la fila de la matriz A");
        rowA = keyboard.nextInt();
        System.out.println(" Ingrese el tamaño de la Columna de la matriz A");
        columnA = keyboard.nextInt();

        //Ingreso datos B
        System.out.println(" Ingrese el tamaño de la fila de la matriz B");
        rowB = keyboard.nextInt();
        System.out.println(" Ingrese el tamaño de la Columna de la matriz B");
        columnB = keyboard.nextInt();


        //Cargar la matriz A
        if (rowA == columnB) {
            int arrayA[][] = new int[rowA][columnA];
            int arrayB[][] = new int[rowB][columnB];
            int arrayC[][] = new int[rowA][columnB];
            System.out.println("Digite la matriz A");
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnA; j++) {
                    System.out.println("arrayA[ " + i + " ][ " + j + " ] : ");
                    arrayA[i][j] = keyboard.nextInt();

                }
                System.out.println(" ");
            }
            //Cargar la matriz B
            System.out.println("Digite la matriz B");
            for (int i = 0; i < rowB; i++) {
                for (int j = 0; j < columnB; j++) {
                    System.out.print("arrayB[ " + i + " ][ " + j + " ] : ");
                    arrayB[i][j] = keyboard.nextInt();
                }
                System.out.println(" ");
            }
            //muestro la matriz A
            System.out.println("Matriz A :");
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnA; j++) {
                    System.out.print(arrayA[i][j] + " ");


                }
                System.out.println(" ");
            }
            //muestro la matriz B
            System.out.println("Matriz B :");
            for (int i = 0; i < rowB; i++) {
                for (int j = 0; j < columnB; j++) {
                    System.out.print(arrayB[i][j] + " ");


                }
                System.out.println(" ");


            }
            //Matriz C
            System.out.println("Matriz C que se obtiene de A*B ");
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnB; j++) {
                    for (int n = 0; n < columnA; n++) {
                        arrayC[i][j] += arrayA[i][n] * arrayB[n][j];

                    }
                    System.out.print(arrayC[i][j] + " ");
                }
                System.out.println(" ");
            }

        } else {
            System.out.println("La operación no se puede realizar");
        }

    }
}



