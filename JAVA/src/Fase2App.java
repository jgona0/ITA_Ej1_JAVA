
/*
 * Primer exercici IT ACADEMY
 * Xavi Gonzalez JAVA-1
 */


public class Fase2App {

	public static void main(String[] args) {

		int any_naixement = 1988;
		
		// Creeu una constant amb el valor de l’any (1948)
		final int ANY_TRASPAS = 1948;
		
		// Creeu una variable que guardi cada quan hi ha un any de traspàs
		int cada_traspas = 4;
		
		// Calculeu quants anys de traspàs hi ha entre 1948 i el vostre any de naixement i emmagatzemeu el valor resultant en una variable
		int anys_traspas = (any_naixement - ANY_TRASPAS) / cada_traspas;
		
		// Mostreu per pantalla el resultat del càlcul
		System.out.println("Entre el " + ANY_TRASPAS+ " i el " +any_naixement+ " hi ha " + anys_traspas + " anys de traspàs");
		
	}

}
