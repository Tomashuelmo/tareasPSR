package ejerciciosArraysInicial;

import java.util.Scanner;

public class EjArraysInicial18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        int[] arregloOriginal = new int[10];
        int[] arregloCopia = new int[5];
        
        System.out.println("Ingrese los datos para rellenar el arreglo de 10 posiciones:");
        for (int i = 0; i < arregloOriginal.length; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            arregloOriginal[i] = scanner.nextInt();
        }
        
        for (int i = 5; i < arregloOriginal.length; i++) {
            arregloCopia[i - 5] = arregloOriginal[i];
        }

        System.out.println("\nArreglo resultante de la copia de los últimos 5 valores:");
        for (int i = 0; i < arregloCopia.length; i++) {
            System.out.println("Índice " + i + ": " + arregloCopia[i]);
        }
        
        scanner.close();

	}

}
