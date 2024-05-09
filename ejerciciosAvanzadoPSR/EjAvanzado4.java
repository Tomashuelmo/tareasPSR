package ejerciciosAvanzadoPSR;

import java.util.Scanner;

public class EjAvanzado4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cuenta matemática:");
        String expresion = scanner.nextLine();

        try {
            double resultado = evaluarExpresion(expresion);
            System.out.println("El resultado es: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static double evaluarExpresion(String expresion) {
        expresion = expresion.replaceAll("\\s+", ""); 
        double resultado = 0.0;

        if (expresion.contains("+")) {
            String[] numeros = expresion.split("\\+");
            if (numeros.length != 2) {
                throw new IllegalArgumentException("Expresión inválida");
            }
            resultado = Double.parseDouble(numeros[0]) + Double.parseDouble(numeros[1]);
        }
        else if (expresion.contains("-")) {
            String[] numeros = expresion.split("-");
            if (numeros.length != 2) {
                throw new IllegalArgumentException("Expresión inválida");
            }
            resultado = Double.parseDouble(numeros[0]) - Double.parseDouble(numeros[1]);
        }
        else if (expresion.contains("*")) {
            String[] numeros = expresion.split("\\*");
            if (numeros.length != 2) {
                throw new IllegalArgumentException("Expresión inválida");
            }
            resultado = Double.parseDouble(numeros[0]) * Double.parseDouble(numeros[1]);
        }
        else if (expresion.contains("/")) {
            String[] numeros = expresion.split("/");
            if (numeros.length != 2) {
                throw new IllegalArgumentException("Expresión inválida");
            }
            double divisor = Double.parseDouble(numeros[1]);
            if (divisor == 0) {
                throw new IllegalArgumentException("División por cero");
            }
            resultado = Double.parseDouble(numeros[0]) / divisor;
        }
        else if (expresion.contains("^")) {
            String[] numeros = expresion.split("\\^");
            if (numeros.length != 2) {
                throw new IllegalArgumentException("Expresión inválida");
            }
            resultado = Math.pow(Double.parseDouble(numeros[0]), Double.parseDouble(numeros[1]));
        }
        else if (expresion.contains("sqrt")) {
            String[] numeros = expresion.split("sqrt");
            if (numeros.length != 2) {
                throw new IllegalArgumentException("Expresión inválida");
            }
            resultado = Math.sqrt(Double.parseDouble(numeros[1]));
        }
        else {
            throw new IllegalArgumentException("Operador no válido");
        }

        return resultado;
	}

}
