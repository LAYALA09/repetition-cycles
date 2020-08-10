package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;


    //Ejemplo 3.2
//Se requiere  obtener un vector (C) de N elementos que contenga la
//suma de los elementos correspondientes de otros dos vectores (A y B).
    public class ExerciseTwoA {

        public static void main(String[] args) {

            int[] arrayA = new int[5];
            int[] arrayB = new int[5];
            int[] arrayC = new int[5];


            Scanner keyboard = new Scanner(System.in);

            System.out.println("Suma de vectores");

            System.out.println(" Vectores A");
            System.out.println(" Ingrese valor");
            for (int i = 0; i <arrayA.length ; i++) {

                arrayA[i] = keyboard.nextInt();

            }
            System.out.println(" Vectores B");
            System.out.println(" Ingrese valor");
            for (int i = 0; i < arrayB.length; i++) {

                arrayB[i] = keyboard.nextInt();

            }


            for (int i = 0; i < arrayC.length; i++) {

                arrayC[i] = arrayB[i] + arrayA[i];

            }
            System.out.println("Muestra de Vector C");
            for (int i = 0; i < arrayC.length; i++) {

                System.out.println(+ arrayC[i]);

            }


        }
    }





