package cadenas;

import java.util.Scanner;

public class OperacionesCadenas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String cadena;
		System.out.println("Dame una cadena de caracteres");
		cadena = teclado.nextLine();
		
		// Mostrar la longitud de la cadena
		System.out.println("La longitud de la cadena es: " + cadena.length());
		// Mostrar el primer carácter de la cadena
		System.out.println("El primer carácter de la cadena es: " + cadena.charAt(0));
		// Mostrar el último caracter de la cadena
		System.out.println("El último carácter de la cadena es: " + cadena.charAt(cadena.length() - 1));
		// Mostrar la segunda palabra de la cadena
		String [] palabras = cadena.split(" ");
		String segundaPalabra = palabras[1];
		System.out.println("La segunda palabra de la cadena es: " + segundaPalabra);
		// Mostrar la cadena con la primera letra y la última en mayúscula
		
		char primLetra = cadena.charAt(0);
		String pLetra = "" + primLetra;
		pLetra = pLetra.toUpperCase();
		
		String ultLetra = cadena.substring(cadena.length() - 1); cadena.length();
		ultLetra = ultLetra.toUpperCase();
		
		String medio = cadena.substring(1, cadena.length() - 1);
		
		System.out.println(primLetra + medio + ultLetra);
		
	}

}
