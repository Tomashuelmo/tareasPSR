package ejerciciosArraysInicial;

import java.util.Scanner;

public class EjArraysInicial20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de empleados: ");
        int numEmpleados = scanner.nextInt();

        String[] nombres = new String[numEmpleados];
        double[] sueldos = new double[numEmpleados];

        for (int i = 0; i < numEmpleados; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            scanner.nextLine();
            nombres[i] = scanner.nextLine();
            System.out.print("Ingrese el sueldo del empleado " + (i + 1) + ": ");
            sueldos[i] = scanner.nextDouble();
        }

        int indiceMayorSueldo = 0;
        double mayorSueldo = sueldos[0];
        for (int i = 1; i < numEmpleados; i++) {
            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
                indiceMayorSueldo = i;
            }
        }

        System.out.println("\nEl empleado con mayor sueldo es:");
        System.out.println("Nombre: " + nombres[indiceMayorSueldo]);
        System.out.println("Sueldo: " + sueldos[indiceMayorSueldo]);
        
        scanner.close();
	}

}
