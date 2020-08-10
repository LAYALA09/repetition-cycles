package ar.com.ada.online.second.repetitioncycles;
//obtener la matriz
//transpuesta de cualquier matriz de orden M x M.

import java.util.Scanner;

public class ExerciseOne {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int arrayA[][] = new int[3][3];

       //Cargar la matriz
        System.out.println("Digite la matriz");
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {

                System.out.print("arrayA[ "+i+" ][ "+j+" ] : " );
                arrayA[i][j] = keyboard.nextInt();
            }

        }
        //muestro la matriz
        System.out.println("Matriz original");
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[0].length; j++) {
                System.out.print(arrayA[i][j]  + " ");

            }
            System.out.println(" ");
        }
        //trasponiendo matriz
        int assistant;
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < i; j++) {////para trasponer colocar j<i, asi la sacamos de la diagonal hacia abajo
                assistant = arrayA[i][j];
                arrayA[i][j] = arrayA[j][i];
                arrayA[j][i] = assistant;
            }

        }
        System.out.println("La matriz traspuesta es : ");
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[0].length; j++) {
                System.out.print(arrayA [i][j]  + " ");
            }
            System.out.println(" ");
        }
    }
}
