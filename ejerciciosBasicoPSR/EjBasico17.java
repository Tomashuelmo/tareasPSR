package ejerciciosBasicoPSR;

import java.util.Scanner;

public class EjBasico17 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de a:");
        double a = scanner.nextDouble();

        System.out.println("Ingrese el valor de b:");
        double b = scanner.nextDouble();

        System.out.println("Ingrese el valor de c:");
        double c = scanner.nextDouble();

        double discriminante = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("No es una ecuación de segundo grado.");
        } else if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones son: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("La solución es única: x = " + x);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }

        scanner.close();

	}

}
