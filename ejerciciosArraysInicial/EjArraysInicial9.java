package ejerciciosArraysInicial;

public class EjArraysInicial9 {

	public static void main(String[] args) {
        int[] primos = new int[25]; 

        int contador = 0;

        for (int i = 2; i <= 100; i++) {
            boolean esPrimo = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                primos[contador] = i;
                contador++;
            }
        }

        System.out.println("Números primos entre 1 y 100:");
        for (int i = 0; i < contador; i++) {
            System.out.println("Índice " + i + ": " + primos[i]);
        }
	}
}
