package ejerciciosArraysInicial;

import java.util.Scanner;

public class EjArraysInicial19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de alumnos: ");
        int numAlumnos = scanner.nextInt();
        
        double[] notas = new double[numAlumnos];
        
        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Ingrese la nota del alumno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        double promedio = suma / numAlumnos;
        
        System.out.println("\nLa nota promedio de la clase es: " + promedio);
        
        System.out.println("\nAlumnos por encima del promedio:");
        for (int i = 0; i < numAlumnos; i++) {
            if (notas[i] > promedio) {
                System.out.println("Alumno " + (i + 1) + ": " + notas[i]);
            }
        }
        
        scanner.close();

	}

}
