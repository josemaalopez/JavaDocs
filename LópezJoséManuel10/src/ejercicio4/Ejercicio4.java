/*
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas.
El usuario introducirá las notas por teclado y luego el programa mostrará la nota mínima, máxima y media de cada alumno.
*/
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nota = 0, notaMinima, notaMaxima, notaMedia;
		String[] asignaturas = new String[5];
		for (int contador = 0; contador < asignaturas.length; contador++) {
			System.out.print("Introduce el nombre de la asignatura " + (contador + 1) + ": ");
			asignaturas[contador] = teclado.nextLine();
		}
	    double[][] notaAsignatura = new double[4][5];
	    for (int fila = 0; fila < 4; fila++) {
			System.out.println("Dime las notas del alumno " + (fila + 1) + ": ");
		for (int columna = 0; columna < 5; columna++) {
			System.out.print("Nota en " + asignaturas[columna] + ": ");
			nota = teclado.nextInt();
			notaAsignatura[fila][columna] = nota;
		    }
		}
	    
		System.out.println("Notas que has metido: ");
		
		for (int fila = 0; fila < 4; fila++) {
			System.out.println("Alumno " + (fila + 1) + ":");
		    for (int columna = 0; columna < 5; columna++) {
		        System.out.println(asignaturas[columna] + ": " + notaAsignatura[fila][columna]);
		    }
		}
		
		System.out.println("De las distintas notas que has introducido se pueden sacar 3 valores: ");
		
		for (int fila = 0; fila < 4; fila++) {
			notaMinima = notaAsignatura[fila][0];
			notaMaxima = notaAsignatura[fila][0];
			double suma = 0;
		for (int columna = 0; columna < 5; columna++) {
			double valor = notaAsignatura[fila][columna];
			if (valor < notaMinima) notaMinima = valor;
			if (valor > notaMaxima) notaMaxima = valor;
			suma = suma + valor;
			}
			
			notaMedia = suma / 5;
			System.out.println("Del alumno " + (fila + 1) + " se puede sacar una nota mínima con valor " + notaMinima + ", una nota máxima con valor " + notaMaxima + " y su nota media, que es " + notaMedia + ". ");
		}
	}
}
