package ejerciciosArraysInicial;

public class EjArraysInicial8 {

	public static void main(String[] args) {
        int[] numeros = {-2, 5, 8, -9, 10, 15, -4};

        int sumaPositivos = 0;
        int sumaNegativos = 0;

        for (int numero : numeros) {
            if (numero > 0) {
                sumaPositivos += numero;
            } else if (numero < 0) {
                sumaNegativos += numero;
            }
        }

        System.out.println("La suma de los elementos positivos es: " + sumaPositivos);
        System.out.println("La suma de los elementos negativos es: " + sumaNegativos);
    }
}


