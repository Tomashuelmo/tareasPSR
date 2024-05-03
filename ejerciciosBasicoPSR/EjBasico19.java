package ejerciciosBasicoPSR;

import java.util.Scanner;

public class EjBasico19 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la velocidad en kilómetros por hora (km/h):");
        double velocidadKmh = scanner.nextDouble();

        double velocidadMs = velocidadKmh * 1000 / 3600; // 1 km/h = 1000 m / 3600 s
        System.out.println("La velocidad " + velocidadKmh + " km/h equivale a " + velocidadMs + " m/s.");
        
        scanner.close();
	}

}
