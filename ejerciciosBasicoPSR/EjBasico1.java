package ejerciciosBasicoPSR;

import java.util.Scanner;

public class EjBasico1 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su peso (en kilogramos):");
        float pesoEnTierra = scanner.nextFloat();

        float pesoEnLuna = (float) (pesoEnTierra * 0.17);

        System.out.println("Tu peso efectivo en la Luna es: " + pesoEnLuna + " kg.");

        scanner.close();
    
	}

}
