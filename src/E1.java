
public class E1 {

	public static void main(String[] args) {

		/*----------
		-- FASE 1 --
		----------*/
		System.out.println(" Fase 1:");

		 // Crea tres variables string e inicialitzales amb les dades pertinents (nom, cognom1, cognom2)
		String nom = "Xavi";
		String cognom = "Gonzalez";
		String cognom2 = "Navarro";
		
		// Crea tres variables int e inicialitzales amb les dades pertinents (dia, mes, any)
		int dia_naixement = 10;
		int mes_naixement = 10;
		int any_naixement = 1988;
		
		// Mostra per pantalla les variables string concatenant-les en aquest ordre (cognom1 + cognom2, + nom)
		System.out.println(cognom + " " + cognom2 + ", " + nom);
		
		// Mostra per pantalla les variables int concatenant-les amb “/” entre cada una d’elles
		System.out.println(dia_naixement + "/" + mes_naixement + "/" + any_naixement);
		
		

		/*----------
		-- FASE 2 --
		----------*/
		System.out.println(" \n Fase 2:");
		
		// Creeu una constant amb el valor de l’any (1948)
		final int any_traspas = 1948;
		
		// Creeu una variable que guardi cada quan hi ha un any de traspàs
		int cada_traspas = 4;
		
		// Calculeu quants anys de traspàs hi ha entre 1948 i el vostre any de naixement i emmagatzemeu el valor resultant en una variable
		int anys_traspas = (any_naixement - any_traspas) / cada_traspas;
		
		// Mostreu per pantalla el resultat del càlcul
		System.out.println("Hi ha " + anys_traspas + " anys de traspàs");
		
		
		
		
		/*----------
		-- FASE 3 --
		----------*/
		System.out.println(" \n Fase 3:");
		
		
		// Partint de l’any 1948 heu de fer un bucle for i mostrar els anys de traspàs fins arriba al vostre any de naixement
		// Creeu una variable bool que sera certa si l’any de naixement és de traspàs o falsa si no ho és
	    // En cas de que la variable bool sigui certa, heu de mostrar per consola una frase on ho digui, en cas de ser falsa mostrareu la frase pertinent. Creeu dues variables string per guardar les frases.
		
		boolean si_any_traspas = false;
		String frase_si = "El meu any de naixement és de traspàs";
		String frase_no = "El meu any de naixement NO és de traspàs";
		
		for (int i=any_traspas; i <= any_naixement ; i+=cada_traspas) {
			
			System.out.println(i);
			
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
		

		
		
		/*----------
		-- FASE 4 --
		----------*/
		System.out.println(" \n Fase 4:");
		
		// Creeu una variable on juntareu el nom i els cognoms (tot en una variable) i un altre on juntareu la data de naixement separada 
		// per “/” (tot en una variable). Mostreu per consola les variables del nom complet, la data de naixement i si l’any de naixement 
		// es de traspàs o no.
		
		String nom_final = nom + " " +cognom + " " + cognom2;
		String data_final = dia_naixement + "/" + mes_naixement + "/" + any_naixement;
	
		System.out.println("El meu nom és " + nom_final);
		System.out.println("Vaig neixer el " + data_final );
		if (si_any_traspas == true) {
			System.out.println(frase_si);
		}
		
		else {
			System.out.println(frase_no);
		}
		
	}

}
