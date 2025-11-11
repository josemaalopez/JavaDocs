/*
 * Descripción: Ejercicio 1
 * Autor:José Manuel López Montesinos
 * Fecha: 26/09/25
 */
package Ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombreAlumno;
		String apellidosAlumno;
		int edadAlumno;
		String direccionAlumno;
		double alturaAlumno;
		double pesoAlumno;
		
		System.out.println("Dime tu nombre: ");
		nombreAlumno = teclado.nextLine();
		
		System.out.println("Dime tus apellidos: ");
		apellidosAlumno = teclado.nextLine();
		
		System.out.println("Dime tu edad: ");
		edadAlumno = teclado.nextInt();
		
		teclado.nextLine();
		System.out.println("Dame tu dirección: ");
		direccionAlumno = teclado.nextLine();
		
		System.out.println("Dime tu altura (en metros): ");
		alturaAlumno = teclado.nextDouble();
		
		System.out.println("Dime tu peso (en kg): ");
		pesoAlumno = teclado.nextDouble();
		
		System.out.println("Nombre: " + nombreAlumno);
		System.out.println("Apellidos: " + apellidosAlumno);
		System.out.println("Edad: " + edadAlumno);
		System.out.println("Dirección: " + direccionAlumno);
		System.out.println("Altura (m): " + alturaAlumno);
		System.out.println("Peso (kg): " + pesoAlumno);

		
	}

}
