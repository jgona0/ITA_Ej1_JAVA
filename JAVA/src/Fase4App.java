
/*
 * Primer exercici IT ACADEMY
 * Xavi Gonzalez JAVA-1
 */


public class Fase4App {

	public static void main(String[] args) {

		String nom = "Xavi";
		String cognom = "Gonzalez";
		String cognom2 = "Navarro";

		int dia_naixement = 10;
		int mes_naixement = 10;
		int any_naixement = 1988;
		
		final int ANY_TRASPAS = 1948;
		
		int cada_traspas = 4;
		

		// Creeu una variable on juntareu el nom i els cognoms (tot en una variable) i un altre on juntareu la data de naixement separada 
		// per “/” (tot en una variable). Mostreu per consola les variables del nom complet, la data de naixement 
		String nom_final = nom + " " +cognom + " " + cognom2;
		String data_final = dia_naixement + "/" + mes_naixement + "/" + any_naixement;	
		
		System.out.println("El meu nom és " + nom_final);
		System.out.println("Vaig neixer el " + data_final );
		
		
		 
		// i si l’any de naixement es de traspàs o no.
		
		boolean si_any_traspas = false;
		String frase_si = "El meu any de naixement és de traspàs";
		String frase_no = "El meu any de naixement NO és de traspàs";
		
		for (int i=ANY_TRASPAS; i <= any_naixement ; i+=cada_traspas) {
						
			if (i == any_naixement) {
				si_any_traspas = true;
			}
		}
		
		if (si_any_traspas == true) {
			System.out.println(frase_si);
		}
		
		else {
			System.out.println(frase_no);
		}

		
	}

}
