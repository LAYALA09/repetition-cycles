package ar.com.ada.online.second.repetitioncycles;
//Se tiene un arreglo de seis filas y ocho columnas y se sabe que se tiene un elemento
//negativo. Indique la posición que ese elemento ocupa en el
//arreglo (en la fila y la columna en la que se encuentra ese elemento)

import java.util.Scanner;

public class ExerciseSeventeen {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int array[][] = new int[3][4];
        //Cargar la matriz
        System.out.println("Ingrese valor ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print("array[ " + i + " ][ " + j + " ] : ");
                array[i][j] = keyboard.nextInt();
            }

        }
        //Indicamos valores negativos
        System.out.println("Ingrese valor ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (array[i][j] < 0) {
                    System.out.print("El número " + array[i][j] + " se enuentra en la fila y columna [ " + i + " ][ " + j + " ] . ");
                }


            }
        }

    }
}


