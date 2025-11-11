/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: El usuario quiere acceder a unos estudios para los que se requiere ser mayor de edad.
Comprobaremos la edad y en caso de ser menor de 18 años mostraremos el siguiente
mensaje: No tiene la edad requerida para realizar estos estudios.
*/
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int edad;
		String nombre, apellidos;
		
		System.out.println("Dime tu edad: ");
		edad = teclado.nextInt();
		teclado.nextLine();

		if (edad < 18) {
			System.out.println("No tiene la edad requerida para realizar estos estudios.");
			} else {
			System.out.println("Faciliteme su nombre:");
			nombre = teclado.nextLine();
			
			System.out.println("Faciliteme sus apellidos:");
			apellidos = teclado.nextLine();
			
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellidos);
			System.out.println("Edad: " + edad);
			
			System.out.println("Usted ha sido admitido");
			}
	}

}