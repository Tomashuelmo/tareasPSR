package ejerciciosArraysInicial;

import java.util.Scanner;

public class EjArraysInicial12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce una cadena de caracteres: ");
        String cadena = scanner.nextLine();
        
        cadena = cadena.toLowerCase();

        cadena = cadena.replaceAll("\\s+", "");

        char[] caracteres = cadena.toCharArray();
        
        boolean esPalindromo = true;

        for (int i = 0; i < caracteres.length / 2; i++) {
            if (caracteres[i] != caracteres[caracteres.length - 1 - i]) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }
        
        scanner.close();
	}

}
