package ejerciciosBasicoPSR;

import java.util.Scanner;

public class EjBasico8 {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio del círculo (como un entero):");
        int radio = scanner.nextInt();

        double diametro = 2 * radio;
        double circunferencia = 2 * Math.PI * radio;
        double area = Math.PI * radio * radio;

        System.out.println("El diámetro del círculo es: " + diametro);
        System.out.println("La circunferencia del círculo es: " + circunferencia);
        System.out.println("El área del círculo es: " + area);

        scanner.close();
	}

}
