package expresionesRegulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ComparaCadenas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String posibleDni;
		
		// Generamos el patrón
		Pattern patron = Pattern.compile("[0-9]{8}[A-Z]");
		
		System.out.println("Dame el DNI: ");
		posibleDni = teclado.nextLine();
		
		Matcher texto = patron.matcher(posibleDni);
		if (texto.matches()) {
			System.out.println("El dni tiene forma correcta.");
		} else {
			System.out.println("El dni NO tiene forma correcta.");
		}
		
	}

}
