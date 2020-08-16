package ar.com.ada.online.second.repetitioncycles;
//Calcule el producto de dos vectores. Uno de ellos es de una fila
con diez elementos y el otro con una columna de diez elementos

import java.util.Scanner;

public class ExerciseFifteen {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int arrayA[] = new int[10];
        int arrayB[] = new int[10];
        int arrayC[] = new int[10];
//carga de vector A
        System.out.println("Vector A");
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite valor ");
            arrayA[i] = keyboard.nextInt();
        }
        //carga de vector B
        System.out.println("Vector B");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite valor ");
            arrayB[i] = keyboard.nextInt();
        }
        System.out.println("Vector C");
        for (int i = 0; i < 10; i++) {
            arrayC[i] = arrayA[i] * arrayB[i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arrayC[i] + " ");
        }
    }

}
