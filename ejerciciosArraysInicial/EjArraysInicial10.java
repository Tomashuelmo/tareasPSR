package ejerciciosArraysInicial;

import java.util.Scanner;

public class EjArraysInicial10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine().toLowerCase(); 

        char[] vocales = {'a', 'e', 'i', 'o', 'u'};

        int contadorVocales = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (esVocal(caracter, vocales)) {
                contadorVocales++;
            }
        }

        System.out.println("El número de vocales en la cadena es: " + contadorVocales);
    }

    public static boolean esVocal(char c, char[] vocales) {
        for (char vocal : vocales) {
            if (c == vocal) {
                return true;
            }
        }
        return false;

	}

}
