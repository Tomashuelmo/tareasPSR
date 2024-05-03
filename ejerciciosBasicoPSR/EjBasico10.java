package ejerciciosBasicoPSR;

import java.util.Scanner;

public class EjBasico10 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el monto del préstamo:");
        double montoPrestamo = scanner.nextDouble();

        System.out.println("Ingrese el porcentaje de interés anual del préstamo:");
        double tasaInteresAnual = scanner.nextDouble() / 100; 
        System.out.println("Ingrese el valor del pago mensual:");
        double pagoMensual = scanner.nextDouble();

        double balance = montoPrestamo;
        int años = 0;
        int meses = 0;

        while (balance > 0) {
            double interesMensual = balance * (tasaInteresAnual / 12);
            double pagoTotal = pagoMensual + interesMensual;
            balance -= pagoTotal;

            if (balance > 0) {
                meses++;
            }

            if (meses == 12) {
                años++;
                meses = 0;
            }
        }

        System.out.println("Se tardará " + años + " años y " + meses + " meses en pagar el préstamo.");

        scanner.close();

	}

}
