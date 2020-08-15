package ar.com.ada.online.second.repetitioncycles;
//Se tiene en un arreglo cien elementos representando calificaciones de los estudiantes
//de una escuela. lea el arreglo y calcule la calificación promedio
//del grupo, además, que cuente los estudiantes que obtuvieron calificaciones arriba del
//promedio del grupo.

import java.util.Scanner;

public class ExerciseTwelve {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int arrayA[] = new int[6];
        int average, higherAverage = 0;
        int studentsAverages = 0;
        int noteAccumulator = 0;
        int generalAverage = 0;
        //Cargar la matriz
        System.out.println("Ingrese valor ");
        for (int i = 0; i < 6; i++) {

            System.out.print(arrayA[i] + " ");
            System.out.print("arrayA[ " + i + " ] : ");
            arrayA[i] = keyboard.nextInt();

        }
        for (int i = 0; i < 6; i++) {

            noteAccumulator = noteAccumulator + arrayA[i];

        }
        generalAverage = noteAccumulator / 6;

        for (int i = 0; i < 6; i++) {
            if (arrayA[i] > generalAverage) {
                higherAverage += 1;


            }
        }
        System.out.println("La calificación promedio es:" + generalAverage);
        System.out.println("los estudiantes que obtuvieron calificaciones arriba del promedio del grupo son en cantidad :" + higherAverage);

    }
}