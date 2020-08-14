package ar.com.ada.online.second.repetitioncycles;
//Lea dos vectores de cien elementos y que calcule la suma de
//éstos guardando su resultado en otro vector, el cual se debe presentar en forma
//impresa.
import java.util.Scanner;

public class ExerciseNine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[]  arrayA = new int[100];
        int[]  arrayB = new int[100];
        int[]  arrayC = new int[100];

        System.out.println("Suma de vectores A + B = C ");

        System.out.println(" Vectores A");

        System.out.println(" Ingrese valor");
        for (int i = 0; i <100; i++) {

            arrayA[i] = keyboard.nextInt();

        }
        System.out.println(" Vectores B");
        System.out.println(" Ingrese valor");
        for (int i = 0; i < 100; i++) {

            arrayB[i] = keyboard.nextInt();

        }


        for (int i = 0; i < 100; i++) {

            arrayC[i] = arrayB[i] + arrayA[i];

        }
        System.out.println("Muestra de Vector C");
        for (int i = 0; i < 100; i++) {

            System.out.println(+ arrayC[i]);

        }


    }
}



