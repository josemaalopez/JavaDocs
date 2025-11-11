/*  
 * Nombre: José Manuel López Montesinos  
 * Curso: 1º DAW  
 * Descripción: Crea un programa que permita al usuario almacenar una secuencia aritmética en un array y luego mostrarla.  
 */
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el valor inicial (valor V): ");
		int V = teclado.nextInt();

		System.out.print("Introduce el incremento (I, en entero): ");
		int I = teclado.nextInt();

		System.out.print("Introduce la cantidad de valores (cantidad = N): ");
		int N = teclado.nextInt();
		
		int[] secuencia = new int[N];
		
		for (int contador = 0; contador < N; contador++) {
			secuencia[contador] = V + (I * contador);
		}
		System.out.println(""); // Separación
		System.out.println("Secuencia aritmética:");
		for (int contador = 0; contador < N; contador++) {
			System.out.print(secuencia[contador] + " ");
		}

	}
}
