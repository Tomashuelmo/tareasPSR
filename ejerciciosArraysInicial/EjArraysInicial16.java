package ejerciciosArraysInicial;

import java.util.Arrays;
import java.util.Scanner;

public class EjArraysInicial16 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la dimensión del vector: ");
        int dimension = scanner.nextInt();
        
        int[] vector = new int[dimension];

        for (int i = 0; i < dimension; i++) {
            System.out.print("Ingrese el número para la posición " + i + ": ");
            vector[i] = scanner.nextInt();
        }

        System.out.println("Números ingresados de forma creciente:");
        Arrays.sort(vector);
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println(); 

        int negativos = 0;
        int positivos = 0;
        int ceros = 0;
        
        for (int num : vector) {
            if (num < 0) {
                negativos++;
            } else if (num > 0) {
                positivos++;
            } else {
                ceros++;
            }
        }
        
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de ceros: " + ceros);
        
        scanner.close();
	}

}
