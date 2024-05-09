package ejerciciosAvanzadoPSR;

import java.util.HashSet;
import java.util.Set;

public class EjAvanzado1 {

	public static void main(String[] args) {
        Set<String> ladoIzquierdo = new HashSet<>();
        ladoIzquierdo.add("Granjero");
        ladoIzquierdo.add("Lobo");
        ladoIzquierdo.add("Gallina");
        ladoIzquierdo.add("Maíz");

        Set<String> ladoDerecho = new HashSet<>();

        System.out.println("Estado inicial:");
        imprimirEstado(ladoIzquierdo, ladoDerecho);

        cruzarRio("Gallina", ladoIzquierdo, ladoDerecho);
        cruzarRio("Granjero", ladoDerecho, ladoIzquierdo);
        cruzarRio("Maíz", ladoIzquierdo, ladoDerecho);
        cruzarRio("Lobo", ladoDerecho, ladoIzquierdo);
        cruzarRio("Gallina", ladoIzquierdo, ladoDerecho);
        cruzarRio("Granjero", ladoDerecho, ladoIzquierdo);

        System.out.println("Estado final:");
        imprimirEstado(ladoIzquierdo, ladoDerecho);
    }

    static void cruzarRio(String objeto, Set<String> origen, Set<String> destino) {
        if (origen.contains(objeto)) {
            origen.remove(objeto);
            destino.add(objeto);
            System.out.println("Cruzó el río con " + objeto);
        }
    }

    static void imprimirEstado(Set<String> ladoIzquierdo, Set<String> ladoDerecho) {
        System.out.println("Izquierda: " + ladoIzquierdo);
        System.out.println("Derecha: " + ladoDerecho);
        System.out.println();
	}

}
