package ejerciciosArraysInicial;

import java.util.Scanner;

public class EjArraysInicial5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numeroInicial = scanner.nextInt();

        int[] arregloOriginal = new int[5];
        for (int i = 0; i < arregloOriginal.length; i++) {
            arregloOriginal[i] = numeroInicial + i;
        }

        System.out.println("Arreglo original:");
        for (int i = 0; i < arregloOriginal.length; i++) {
            System.out.println("Índice " + i + ": " + arregloOriginal[i]);
        }

        int[] copiaArreglo = new int[arregloOriginal.length];
        System.arraycopy(arregloOriginal, 0, copiaArreglo, 0, arregloOriginal.length);

        System.out.println("\nCopia del arreglo:");
        for (int i = 0; i < copiaArreglo.length; i++) {
            System.out.println("Índice " + i + ": " + copiaArreglo[i]);
        }

	}

}
