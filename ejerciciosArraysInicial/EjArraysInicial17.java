package ejerciciosArraysInicial;

import java.util.Scanner;

public class EjArraysInicial17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[] vector = new int[20]; 
        
        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Consultar dato en una posición");
            System.out.println("2. Asignar dato en una posición");
            System.out.println("3. Modificar dato en una posición");
            System.out.println("4. Eliminar dato en una posición");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    consultarDato(vector);
                    break;
                case 2:
                    asignarDato(vector);
                    break;
                case 3:
                    modificarDato(vector);
                    break;
                case 4:
                    eliminarDato(vector);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
            
        } while (opcion != 5);
        
        scanner.close();
    }
    
    public static void consultarDato(int[] vector) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la posición del vector que desea consultar: ");
        int posicion = scanner.nextInt();
        
        if (posicion < 0 || posicion >= vector.length) {
            System.out.println("Posición inválida. Debe ser un valor entre 0 y " + (vector.length - 1) + ".");
        } else {
            System.out.println("El dato en la posición " + posicion + " es: " + vector[posicion]);
        }
    }
    
    public static void asignarDato(int[] vector) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la posición del vector a la que desea asignar un dato: ");
        int posicion = scanner.nextInt();
        
        if (posicion < 0 || posicion >= vector.length) {
            System.out.println("Posición inválida. Debe ser un valor entre 0 y " + (vector.length - 1) + ".");
        } else {
            System.out.print("Ingrese el dato a asignar: ");
            int dato = scanner.nextInt();
            vector[posicion] = dato;
            System.out.println("Dato asignado correctamente en la posición " + posicion + ".");
        }
    }
    
    public static void modificarDato(int[] vector) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la posición del vector que desea modificar: ");
        int posicion = scanner.nextInt();
        
        if (posicion < 0 || posicion >= vector.length) {
            System.out.println("Posición inválida. Debe ser un valor entre 0 y " + (vector.length - 1) + ".");
        } else {
            System.out.print("Ingrese el nuevo dato: ");
            int nuevoDato = scanner.nextInt();
            vector[posicion] = nuevoDato;
            System.out.println("Dato modificado correctamente en la posición " + posicion + ".");
        }
    }
    
    public static void eliminarDato(int[] vector) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la posición del vector que desea eliminar: ");
        int posicion = scanner.nextInt();
        
        if (posicion < 0 || posicion >= vector.length) {
            System.out.println("Posición inválida. Debe ser un valor entre 0 y " + (vector.length - 1) + ".");
        } else {
            vector[posicion] = 0; // Se elimina asignando el valor 0
            System.out.println("Dato eliminado correctamente en la posición " + posicion + ".");
	}

   }
}
