package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;


    //Ejemplo 3.2
//Se requiere  obtener un vector (C) de N elementos que contenga la
//suma de los elementos correspondientes de otros dos vectores (A y B).
    public class ExerciseTwoA {

        public static void main(String[] args) {

            int[] arrayA ;
            int[] arrayB ;
            int[] arrayC ;
            int sizeArray;

            Scanner keyboard = new Scanner(System.in);

            System.out.println(" Ingrese el tamñao de los arreglos");
            sizeArray = keyboard.nextInt();
            arrayA = new int[sizeArray];
            arrayB = new int[sizeArray];
            arrayC = new int[sizeArray];

            System.out.println("Suma de vectores A + B = C ");

            System.out.println(" Vectores A");

            System.out.println(" Ingrese valor");
            for (int i = 0; i <sizeArray; i++) {

                arrayA[i] = keyboard.nextInt();

            }
            System.out.println(" Vectores B");
            System.out.println(" Ingrese valor");
            for (int i = 0; i < sizeArray; i++) {

                arrayB[i] = keyboard.nextInt();

            }


            for (int i = 0; i < sizeArray; i++) {

                arrayC[i] = arrayB[i] + arrayA[i];

            }
            System.out.println("Muestra de Vector C");
            for (int i = 0; i < sizeArray; i++) {

                System.out.println(+ arrayC[i]);

            }


        }
    }





