package icc.clases;

/**
 * Clase para ejemplificar el uso de la clase <code>Ciudadano</code>.
 * @author 
 */
public class UsoCiudadano {

	public static void main(String[] args) {
		Ciudadano carmen = new Ciudadano("Carmen Elizabeth Juanita", "de Costa Brava", "Cortez", "30/03/2001");
		System.out.println("El RFC de Carmen es: " + carmen.calculaRFC());
		System.out.println(carmen.toString());
		System.out.println("Debe ser: DECC010330");

		Ciudadano siqueiros = new Ciudadano("David", "Álfaro", "Siqueiros", "29/12/1896");
		System.out.println("El RFC de David es: " + siqueiros.calculaRFC());
		System.out.println(siqueiros.toString());
		System.out.println("Debe ser: AASD961229");
        /*
        * Aquí creo que hay un error porque el RFC que debe ser esta mal
        */

		Ciudadano cantinflas = new Ciudadano("Mario Fortino Alfonso", "Moreno", "Reyes", "12/08/1911");
		System.out.println("El RFC de Mario es: " + cantinflas.calculaRFC());
		System.out.println(cantinflas.toString());
		System.out.println("Debe ser: MORM110812");
    }
}
