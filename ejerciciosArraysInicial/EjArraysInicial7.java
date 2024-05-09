package ejerciciosArraysInicial;

import java.util.Scanner;

public class EjArraysInicial7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }

        double promedio = suma / numeros.length;

        System.out.println("El promedio de los cinco números ingresados es: " + promedio);
    }
}


