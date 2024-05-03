package ejerciciosBasicoPSR;

import java.util.Scanner;

public class EjBasico13 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero para determinar si es capicúa:");
        int numero = scanner.nextInt();

        boolean esCapicua = esCapicua(numero);

        if (esCapicua) {
            System.out.println(numero + " es un número capicúa.");
        } else {
            System.out.println(numero + " no es un número capicúa.");
        }

        scanner.close();
    }

    public static boolean esCapicua(int numero) {
        int original = numero;
        int reverso = 0;

        while (numero > 0) {
            reverso = reverso * 10 + numero % 10;
            numero /= 10;
        }

        return original == reverso;
	}

}
