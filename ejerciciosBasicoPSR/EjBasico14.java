package ejerciciosBasicoPSR;

import java.util.Scanner;

public class EjBasico14 {

	public static void main(String[] args) {
        String[] nombresMeses = {"", "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la fecha en formato 'dd mm aaaa':");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int año = scanner.nextInt();

        if (mes < 1 || mes > 12) {
            System.out.println("Mes inválido.");
            return;
        }

        System.out.println("La fecha en texto es: " + dia + " de " + nombresMeses[mes] + " de " + año);

        scanner.close();

	}

}
