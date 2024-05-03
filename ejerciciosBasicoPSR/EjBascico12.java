package ejerciciosBasicoPSR;

import java.util.Scanner;

public class EjBascico12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un año para determinar si es bisiesto:");
        int anio = scanner.nextInt();

        String resultado = (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) ? "es" : "no es";

        System.out.println("El año " + anio + " " + resultado + " un año bisiesto.");

        scanner.close();
    }
}