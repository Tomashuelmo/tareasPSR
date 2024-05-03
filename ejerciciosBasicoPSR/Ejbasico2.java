package ejerciciosBasicoPSR;

import java.util.Scanner;

public class Ejbasico2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int suma = 0;
        boolean numeroValido = false;

        do {
            System.out.println("Ingrese un número 5 dígitos:");
            numero = scanner.nextInt();
            if (numero >= 10000 && numero <= 99999) {
                numeroValido = true;
            } else {
                System.out.println("Error: Debe ingresar un número de 5 dígitos. Por favor, inténtelo de nuevo.");
            }
        } while (!numeroValido);

        int digito;
        for (int i = 0; i < 5; i++) {
            digito = numero % 10; 
            suma += digito;
            numero /= 10; 
        }

        System.out.println("La suma de los dígitos es: " + suma);

        scanner.close();
	}

}
