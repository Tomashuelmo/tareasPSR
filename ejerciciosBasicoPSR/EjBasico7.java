package ejerciciosBasicoPSR;

import java.util.Scanner;

public class EjBasico7 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un valor en pesos:");
        int cantidadPesos = scanner.nextInt();

        int[] valores = { 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
        String[] denominaciones = { "billetes de 1000", "billetes de 500", "billetes de 200", "billetes de 100",
                "billetes de 50", "billetes de 20", "monedas de 10", "monedas de 5", "monedas de 2", "monedas de 1" };

        System.out.println("Para la cantidad de " + cantidadPesos + " pesos, se necesitan:");
        for (int i = 0; i < valores.length; i++) {
            int cantidad = cantidadPesos / valores[i];
            if (cantidad > 0) {
                System.out.println(cantidad + " " + denominaciones[i]);
                cantidadPesos %= valores[i];

            	}

        }
        scanner.close();
	}
}