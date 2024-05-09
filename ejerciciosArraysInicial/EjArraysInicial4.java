package ejerciciosArraysInicial;

public class EjArraysInicial4 {

	public static void main(String[] args) {
        int cantidadNumerosDivisiblesPorTres = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                cantidadNumerosDivisiblesPorTres++;
            }
        }

        int[] numerosDivisiblesPorTres = new int[cantidadNumerosDivisiblesPorTres];

        int indice = 0; 
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                numerosDivisiblesPorTres[indice] = i;
                indice++;
            }
        }

        System.out.println("Datos del arreglo de números divisibles por 3:");
        for (int i = 0; i < numerosDivisiblesPorTres.length; i++) {
            System.out.println("Índice " + i + ": " + numerosDivisiblesPorTres[i]);
        }

	}

}
