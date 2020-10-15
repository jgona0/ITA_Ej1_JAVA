
/*
 * Primer exercici IT ACADEMY
 * Xavi Gonzalez JAVA-1
 */


public class Fase3App {

	public static void main(String[] args) {

		int any_naixement = 1988;
	
		final int ANY_TRASPAS = 1948;
		
		int cada_traspas = 4;
		
		System.out.println("Aquests son els anys de traspàs entre el " +ANY_TRASPAS+ " i el " +any_naixement+ ":");
		
		// Partint de l’any 1948 heu de fer un bucle for i mostrar els anys de traspàs fins arriba al vostre any de naixement
		// Creeu una variable bool que sera certa si l’any de naixement és de traspàs o falsa si no ho és
	    // En cas de que la variable bool sigui certa, heu de mostrar per consola una frase on ho digui, en cas de ser falsa mostrareu la frase pertinent. Creeu dues variables string per guardar les frases.
		
		boolean si_any_traspas = false;
		String frase_si = "El meu any de naixement és de traspàs";
		String frase_no = "El meu any de naixement NO és de traspàs";
		
		for (int i=ANY_TRASPAS; i <= any_naixement ; i+=cada_traspas) {
			
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
		
	}

}
