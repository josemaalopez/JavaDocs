/*
 * Descripción: Ejemplos de tipos de variables
 * Autor: José Manuel López
 * Fecha: 22/09/25
 */
package tiposVariable;

public class EjemplosTipos {

	public static void main(String[] args) {
		int numAlumnos; // Declaramos la variable numAlumnos
		numAlumnos = 0;
		System.out.println("Valor de la variable: " + numAlumnos);
		
		numAlumnos = 12;
		System.out.println("Valor de la variable: " + numAlumnos);
		
		double alturaAlumno = 1.75;
		System.out.println("Valor de la variable: " + alturaAlumno + " cm");
		
		char letraDni;
		letraDni = 'c';
		
		String nombreAlumno = "Alberto";
		System.out.println("Valor de la variable: " + nombreAlumno);
		
		final int NUM_MAX_ALUMNOS = 25; // Declaramos una constante
		System.out.println("Valor de la constante: " + NUM_MAX_ALUMNOS);
		
		final String CURSO = "1º DAW";
		System.out.println("Valor del grupo constante (curso actual): " + CURSO);
		
		
	}

}