package ejerciciosBasicoPSR;

import java.util.Scanner;

public class EjBasico20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de variedades de artículos vendidos:");
        int cantidadVariedades = scanner.nextInt();
        scanner.nextLine(); 

        String[] nombres = new String[cantidadVariedades];
        int[] cantidades = new int[cantidadVariedades];
        double[] precios = new double[cantidadVariedades];

        for (int i = 0; i < cantidadVariedades; i++) {
            System.out.println("Ingrese el nombre del artículo " + (i + 1) + ":");
            nombres[i] = scanner.nextLine();

            System.out.println("Ingrese la cantidad de " + nombres[i] + ":");
            cantidades[i] = scanner.nextInt();

            System.out.println("Ingrese el precio unitario de " + nombres[i] + ":");
            precios[i] = scanner.nextDouble();

            scanner.nextLine();
        }

        System.out.println("\nFACTURA");
        System.out.println("----------------------------------------");
        double totalPagar = 0.0;
        for (int i = 0; i < cantidadVariedades; i++) {
            double subtotal = cantidades[i] * precios[i];
            totalPagar += subtotal;
            System.out.printf("Artículo: %s - Cantidad: %d - Precio unitario: %.2f - Subtotal: %.2f%n",
                    nombres[i], cantidades[i], precios[i], subtotal);
        }
        System.out.println("----------------------------------------");
        System.out.printf("Total a pagar: %.2f%n", totalPagar);

        scanner.close();
	}

}
