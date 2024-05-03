package ejerciciosBasicoPSR;

import java.util.Scanner;

public class EjBasico18 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
        int numeroDecimal = scanner.nextInt();

        if (numeroDecimal == 0) {
            System.out.println("El número 0 en binario es: 0");
        } else {
            StringBuilder binario = new StringBuilder();

            for (int i = 31; i >= 0; i--) {
                int bit = (numeroDecimal >> i) & 1;


                if (bit == 1 || binario.length() > 0) {
                    binario.append(bit);
                }
            }

            System.out.println("El número " + numeroDecimal + " en binario es: " + binario.toString());
        }

        scanner.close();

	}

}
