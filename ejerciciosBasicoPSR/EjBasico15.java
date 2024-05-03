package ejerciciosBasicoPSR;

import java.util.Scanner;

public class EjBasico15 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de segundos:");
        int segundos = scanner.nextInt();

        int horas = segundos / 3600;
        int segundosRestantes = segundos % 3600;
        int minutos = segundosRestantes / 60;
        int segundosFinales = segundosRestantes % 60;

        System.out.println("El número de horas, minutos y segundos es:");
        System.out.println(horas + " horas, " + minutos + " minutos y " + segundosFinales + " segundos");

        scanner.close();
	}

}
