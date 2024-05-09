package ejerciciosArraysInicial;

public class EjArraysInicial6 {

	public static void main(String[] args) {
        int[] numerosPares = new int[20];

        for (int i = 0; i < numerosPares.length; i++) {
            numerosPares[i] = (i + 1) * 2;
        }

        int suma = 0;
        for (int numero : numerosPares) {
            suma += numero;
        }

        System.out.println("La suma de los veinte primeros números pares es: " + suma);
    	}
	}


