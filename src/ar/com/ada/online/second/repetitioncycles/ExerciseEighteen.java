package ar.com.ada.online.second.repetitioncycles;
//8. Realice un algoritmo que lea una matriz de C columnas y R renglones. A partir de ella
//genere dos vectores que contengan la suma de sus renglones y la suma de sus
//columnas

import java.util.Scanner;

public class ExerciseEighteen {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int array[][] = new int[3][5];
        int arrayA[] = new int[3];
        int arrayB[] = new int[5];

        //Cargar la matriz
        System.out.println("Ingrese valor ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.print("array[ " + i + " ][ " + j + " ] : ");
                array[i][j] = keyboard.nextInt();
            }

        }
        //Recorro matriz-genero vecta A y B
        System.out.println("Matriz ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.print(array[i][j] + " ");

                arrayA[i] += array[i][j];

                arrayB[j] += array[i][j];

            }
            System.out.println(" ");
        }

        //Muestro vector A
        System.out.println("vector A");
        for (int i = 0; i < 3; i++) {
            System.out.print(arrayA[i] + " ");

        }
        System.out.println(" ");

        //muestro vector B
        System.out.println("vector B");
        for (int j = 0; j < 5; j++) {
            System.out.print(arrayB[j] + " ");

        }


    }
}
