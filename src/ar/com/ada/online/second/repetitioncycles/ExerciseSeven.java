package ar.com.ada.online.second.repetitioncycles;
//Lea un vector y a partir de él forme un segundo vector, de tal
//forma que el primer elemento pase a ser el segundo, el segundo pase a ser el tercero, el
//último pase a ser el primero, y así sucesivamente

import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int array[] = new int[6];
        int aux;

        //cargar el arreglo
        System.out.println("Vector A");
        for (int i = 0; i < 6; i++) {
            System.out.println("Digite valor ");
            array[i] = keyboard.nextInt();
        }
        aux = array[5];

        for (int i = 4; i >= 0; i--) {

            array[i + 1] = array[i];
        }
        array[0] = aux;
        System.out.println("El nuevo arreglo es; ");
        for (int i = 0; i < 6; i++) {
            System.out.println(i + "Número:" + array[i]);

        }
    }

}

