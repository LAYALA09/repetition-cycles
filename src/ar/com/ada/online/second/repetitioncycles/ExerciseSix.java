package ar.com.ada.online.second.repetitioncycles;
// Lea
//los nombres y las edades de diez alumnos, y que los datos se almacenen en dos
//vectores, y con base en esto se determine el nombre del alumno con la edad mayor del
//arreglo

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        int sum = 0;
        int arrayAge[] = new int[10];
        String arrayName[] = new String[10];


        Scanner keyboard = new Scanner(System.in);


        //Carga de vectores de nombres y edades

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa Apellido y Nombre del Alumno: ");
            arrayName[i] = keyboard.nextLine();

        }
        for (int i = 0; i < 10; i++) {

            System.out.println("Ingresa edad del alumno: ");
            arrayAge[i] = keyboard.nextInt();
        }
        //Muestro los vectores y determinamos el alumno de mayor edad

        System.out.println("Apellidos y nombres                    Edad ");
        for (int i = 0; i < 10; i++) {
            System.out.println(arrayName[i] + "    ||||||||        " + arrayAge[i]);

        }
        int aux = 0;
        String nameStudent = " ";
        for (int i = 0; i < 10; i++) {
            if (arrayAge[i] > aux) {
                aux = arrayAge[i];
                nameStudent = arrayName[i];

            }
            System.out.println(" ");
        }
        System.out.println("El nombre del alumno con mayor edad es :" + nameStudent);
    }
}
