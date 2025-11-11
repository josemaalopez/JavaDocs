/*
 * Descripción: Cómo funciona el operador condicional y el contador de caracteres
 * Autor:José Manuel López Montesinos
 * Fecha: 26/09/25
 */
package OperadoresBasicos;

import java.util.Scanner;

public class EjOperCondicional {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		System.out.println("Dime tu nombre: ");
		nombre = teclado.nextLine();
		int longitud = nombre.length();
		System.out.println("Número de caracteres: " + longitud);
		
		String nombreEnMinuscula;
		nombreEnMinuscula = nombre.toLowerCase();
		System.out.println(nombreEnMinuscula);
		
		System.out.println("En mayúscula es: " + nombre.toUpperCase());
		
		boolean esPepe;
		nombre = nombre.toLowerCase();
		esPepe = nombre.equals("pepe");
		System.out.println(esPepe);
/*		
		int edad;
		System.out.println("Dime tu edad: ");
		edad = teclado.nextInt();
	
		String mayorEdad;
		mayorEdad = (edad > 18) ? "Eres mayor de edad": "Eres menor de edad";
		System.out.println(mayorEdad);
*/		
	}

}
