package ejerciciosBasicoPSR;

import java.util.Scanner;

public class EjBasico11 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la duración de la llamada en minutos:");
        int duracionLlamada = scanner.nextInt();

        double costoLlamada = 5.0 + 0.5 * Math.max(duracionLlamada - 5, 0);

        System.out.println("El monto a pagar por la llamada es: $" + costoLlamada);

        scanner.close();
	}

}
