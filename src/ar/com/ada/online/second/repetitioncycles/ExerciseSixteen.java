package ar.com.ada.online.second.repetitioncycles;
//Una compañía de transporte cuenta con cinco choferes, de los cuales se conoce:
//nombre, horas trabajadas cada día de la semana (seis días) y sueldo por hora. Realice
//un algoritmo que:
//a. Calcule el total de horas trabajadas a la semana para cada trabajador.
//b. Calcule el sueldo semanal para cada uno de ellos.
//c. Calcule el total que pagará la empresa.
//d. Indique el nombre del trabajador que labora más horas el día lunes.
//e. Imprima un reporte con todos los datos anteriores.

import java.util.Scanner;

public class ExerciseSixteen {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String names[] = new String[5];//nombre de los trabajadores
        int hours[][] = new int[5][6];//horas trabajadas de c/u el dia lunes
        int hourlyWage[] = new int[5];//salario por hora de c/u
        int weekHoursWorked[] = new int[5];//horas semanales de ca/u
        int weekWage[] = new int[5];//salario semanal
        int companyPayment = 0;//pago total de la company
        int hoursWorkaholic = 0;// horas del empleado que mas trabajó el lunes
        String nameWorkaholic = "";// nombre del empleado que mas trab

        for (int i = 0; i < names.length; i++) {
            System.out.println("Ingrese el nombre del trabajador  " + i + " ");
            names[i] = keyboard.next();
            System.out.println("Ingrese el salario por hora del trabajador " + names[i]);
            hourlyWage[i] = keyboard.nextInt();
            for (int j = 0; j < hours[i].length; j++) {
                System.out.println("Ingrese las horas  laborales del trabajador  " + names[i]);
                hours[i][j] = keyboard.nextInt();
            }

        }
        for (int i = 0; i < hours.length; i++) {
            weekHoursWorked[i] = 0;
            for (int j = 0; j < hours[i].length; j++) {
                //calculo del total de horas trabajadas de la semana
                weekHoursWorked[i] += hours[i][j];
                //trabajador con mas horas trabajadas
                if (j < i) {
                    if ((weekHoursWorked[i] > hoursWorkaholic)) {
                        hoursWorkaholic = weekHoursWorked[i];
                        nameWorkaholic = names[i];
                    }
                }
            }
            //calculo el sueldo semanal para cada uno de ellos
            weekWage[i] = weekHoursWorked[i] * hourlyWage[i];
            companyPayment += weekWage[i];
        }
        //impresión
        System.out.println("Reporte de trabajadores :");
        for (int i = 0; i < hours.length; i++) {
            System.out.println("\nTrabajador " + names[i] + "\nHoras trabajadas :" + weekHoursWorked[i]);
            System.out.println("\nSueldo semanal de " + names[i] + " $" + weekWage[i]);
        }
        System.out.println("\nLa empresa pagará un total de: " + companyPayment + " salarios");
        System.out.println("Empleado con más horas trabajadas es  :" + nameWorkaholic);
    }
}
