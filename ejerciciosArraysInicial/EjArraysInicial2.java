package ejerciciosArraysInicial;

public class EjArraysInicial2 {

	public static void main(String[] args) {
        int[] numeros = new int[11]; 

        for (int i = 0, num = 4; i < numeros.length; i++, num++) {
            numeros[i] = num;
        }

        System.out.println("Datos del arreglo:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }
	}

}
