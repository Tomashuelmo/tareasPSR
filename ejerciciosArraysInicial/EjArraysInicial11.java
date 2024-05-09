package ejerciciosArraysInicial;

import java.util.Scanner;

public class EjArraysInicial11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce una cadena de caracteres: ");
        String cadena = scanner.nextLine();

        char[] caracteres = cadena.toCharArray();

        char[] alReves = new char[caracteres.length];

        for (int i = 0; i < caracteres.length; i++) {
            alReves[i] = caracteres[caracteres.length - 1 - i];
        }

        String cadenaAlReves = new String(alReves);

        System.out.println("La cadena al revés es: " + cadenaAlReves);
        
        scanner.close();

	}

}
