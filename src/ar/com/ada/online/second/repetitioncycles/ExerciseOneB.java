package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;
public class ExerciseOneB {
    public static void main(String[] args) {
        int sum=0;
        int[] arrayNumbers = new int[10];
        Scanner keyboard= new Scanner(System.in);
        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.printf("Ingrese el valor para la posicion %d de arrglo ", i);
            arrayNumbers[i]= keyboard.nextInt();
            sum+= arrayNumbers[i];
        }
        System.out.printf("La suma de los elementos del arreglo es: %d ", sum);

        }

}
