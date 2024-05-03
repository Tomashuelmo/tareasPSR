package ejerciciosBasicoPSR;

public class EjBasico6 {

	public static void main(String[] args) {
        long poblacionActual = 7309784505L;
        long crecimientoAnual = 24807909L;
        
        long Pob1Anio = poblacionActual + crecimientoAnual;
        long Pob2anios = Pob1Anio + crecimientoAnual;
        long Pob3anios = Pob2anios + crecimientoAnual;
        long Pob4anios = Pob3anios + crecimientoAnual;
        long Pob5anios = Pob4anios + crecimientoAnual;
        
        System.out.println("Población mundial después de 1 año: " + Pob1Anio);
        System.out.println("Población mundial después de 2 años: " + Pob2anios);
        System.out.println("Población mundial después de 3 años: " + Pob3anios);
        System.out.println("Población mundial después de 4 años: " + Pob4anios);
        System.out.println("Población mundial después de 5 años: " + Pob5anios);
	}

}
