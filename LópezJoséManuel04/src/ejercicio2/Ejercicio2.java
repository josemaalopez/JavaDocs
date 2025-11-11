/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: El usuario quiere acceder a unos estudios para los que se requieren dos condiciones, por un
lado ser mayor de 18 años y además haber obtenido una nota académica mayor de 7.
*/
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		int edad;
		double notaAcademica;
		
		System.out.println("Introduce tu nombre: ");
		nombre = teclado.nextLine();
		
		System.out.println("Introduce tu edad: ");
		edad = teclado.nextInt();
		
		System.out.println("Introduce tu nota académica: ");
		notaAcademica = teclado.nextDouble();
		
		if (edad > 18 && notaAcademica > 7) {
		System.out.println(nombre + ", usted ha sido admitido en el curso, cumple las condiciones requeridas.");
		} else {
		System.out.println(nombre + ", lo sentimos, no ha sido admitido/a en el curso ya que no cumple los requisitos mínimos");
		}

	}

}