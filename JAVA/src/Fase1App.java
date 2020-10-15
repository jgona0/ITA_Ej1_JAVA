
/*
 * Primer exercici IT ACADEMY
 * Xavi Gonzalez JAVA-1
 */


public class Fase1App {

	public static void main(String[] args) {

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
		
	}

}
