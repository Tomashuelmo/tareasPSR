package ejerciciosArraysInicial;

public class EjArraysInicial13 {

	public static void main(String[] args) {
        System.out.println("Números pares:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
        
        System.out.println("Números impares:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
	}

}
