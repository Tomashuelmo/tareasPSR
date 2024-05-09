package ejerciciosAvanzadoPSR;
import java.util.*;

public class EjAvanzado2 {

	static List<String> mujeres = Arrays.asList("Clara", "Luisa", "María", "Nélida");
    static List<String> trabajos = Arrays.asList("diseñadora de moda", "florista", "jardinera", "directora de orquesta");
    static Map<String, String> asignaciones = new HashMap<>();

    public static void main(String[] args) {
        List<List<String>> permutaciones = generarPermutaciones(trabajos);
        
        for (List<String> perm : permutaciones) {
            asignaciones.clear();
            for (int i = 0; i < mujeres.size(); i++) {
                asignaciones.put(mujeres.get(i), perm.get(i));
            }
            if (esSolucionValida()) {
                imprimirSolucion();
                break;
            }
        }
    }

    static List<List<String>> generarPermutaciones(List<String> trabajos) {
        List<List<String>> permutaciones = new ArrayList<>();
        generarPermutacionesRecursivas(trabajos, new ArrayList<>(), permutaciones);
        return permutaciones;
    }

    static void generarPermutacionesRecursivas(List<String> trabajos, List<String> permutacionActual, List<List<String>> permutaciones) {
        if (permutacionActual.size() == trabajos.size()) {
            permutaciones.add(new ArrayList<>(permutacionActual));
            return;
        }
        for (String trabajo : trabajos) {
            if (!permutacionActual.contains(trabajo)) {
                permutacionActual.add(trabajo);
                generarPermutacionesRecursivas(trabajos, permutacionActual, permutaciones);
                permutacionActual.remove(permutacionActual.size() - 1);
            }
        }
    }

    static boolean esSolucionValida() {
        String luisaTrabajo = asignaciones.get("Luisa");
        String mariaTrabajo = asignaciones.get("María");
        if (luisaTrabajo.equals("florista") && !mariaTrabajo.equals("directora de orquesta")) {
            return false;
        }
        if (!luisaTrabajo.equals("florista") && mariaTrabajo.equals("directora de orquesta")) {
            return false;
        }
        String claraTrabajo = asignaciones.get("Clara");
        if (claraTrabajo.equals("jardinera") || claraTrabajo.equals("Luisa")) {
            return false;
        }
        String nelidaTrabajo = asignaciones.get("Nélida");
        if (nelidaTrabajo.equals("jardinera") || nelidaTrabajo.equals("diseñadora de moda")) {
            return false;
        }
        return true;
    }

    static void imprimirSolucion() {
        for (String mujer : mujeres) {
            String trabajo = asignaciones.get(mujer);
            System.out.println(mujer + " trabaja como " + trabajo);
        }

	}

}
