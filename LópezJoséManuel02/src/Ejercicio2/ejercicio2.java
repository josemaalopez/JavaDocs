/*
 * Descripción: Ejercicio 2
 * Autor:José Manuel López Montesinos
 * Fecha: 1/10/25
 */
package Ejercicio2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombreEquipo;
		int anyoFundacion;
		String nombreEstadio;
		String nombreCapitan;
		
		System.out.println("Dime el nombre de tu equipo: ");
		nombreEquipo = teclado.nextLine();
		
		System.out.println("Dame la fecha en que se fundó: ");
		anyoFundacion = teclado.nextInt();
		
		teclado.nextLine();
		System.out.println("Dime el nombre de tu campo de fútbol: ");
		nombreEstadio = teclado.nextLine();
		
		System.out.println("¿Cómo se llama tu capitán? ");
		nombreCapitan = teclado.nextLine();
		
		System.out.println("**********************************************************************************************");
		System.out.println("******* " + "Nombre del Equipo: " + nombreEquipo + " ******************************************************");
		System.out.println("******* " + "Fundado en: " + anyoFundacion + " *********************************************************************");
		System.out.println("******* " + "Estadio: " + nombreEstadio + " **********************************************************************");
		System.out.println("****** " + "Capitán: " + nombreCapitan + " ***********************************************************************");
		System.out.println("**********************************************************************************************");
	}

}
