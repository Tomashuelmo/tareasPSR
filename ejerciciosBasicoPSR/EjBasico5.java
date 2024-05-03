package ejerciciosBasicoPSR;

public class EjBasico5 {
    public static void main(String[] args) {
        int n = 20;
       
        int[] fibonacci = new int[n];
        
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
       
        System.out.println("Los primeros 20 números de Fibonacci son:");
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci[i]);
        }
    }
}