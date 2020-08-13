package ar.com.ada.online.second.repetitioncycles;
//Determinar si una matriz
//es de tipo diagonal: es una matriz cuadrada en la cual todos sus elementos son cero,
//excepto los electos de la diagonal principal.
import java.util.Scanner;

     public class ExerciseFive {
    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);

        int rowA;
        int columnA;

        //Ingreso datos
        System.out.println(" Ingrese el tamaño de la fila de la matriz A");
        rowA = keyboard.nextInt();
        System.out.println(" Ingrese el tamaño de la Columna de la matriz A");
        columnA = keyboard.nextInt();


        if (rowA == columnA ) {

                int arrayA[][] = new int[rowA][columnA];

//cargo matriz
            int aux=3;
                System.out.println("Digite la matriz A");
                for (int i = 0; i < rowA; i++) {
                    for (int j = 0; j < columnA; j++) {
                          if (i==j){
                              aux+=1;
                              arrayA[i][j]+= aux;
                          }else{
                              arrayA[i][j]+= 0;
                          }

                    }
                    System.out.println(" ");
                }


                //Imprimo matriz A y resto A y B para obtener C
                System.out.println("Matriz A");
                for (int i = 0; i < rowA; i++) {
                    for (int j = 0; j < columnA; j++) {

                        System.out.print(arrayA[i][j] + " ");



                    }
                    System.out.println(" ");
                }
            }
        }
    }
