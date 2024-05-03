package ejerciciosBasicoPSR;

import java.util.Scanner;

public class EjBasico16 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la hora en formato 'hh:mm:ss':");
        String horaActual = scanner.nextLine();

        System.out.println("Ingrese la cantidad de segundos a sumar:");
        int segundosASumar = scanner.nextInt();

        String[] partes = horaActual.split(":");
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);
        int segundos = Integer.parseInt(partes[2]);
        int tiempoTotalSegundos = horas * 3600 + minutos * 60 + segundos;

        tiempoTotalSegundos += segundosASumar;

        horas = tiempoTotalSegundos / 3600;
        minutos = (tiempoTotalSegundos % 3600) / 60;
        segundos = tiempoTotalSegundos % 60;

        System.out.println("La nueva hora será: " + horas + ":" + minutos + ":" + segundos);

        scanner.close();
	}

}
