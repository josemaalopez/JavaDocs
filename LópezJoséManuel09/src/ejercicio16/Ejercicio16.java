/* 
 * Nombre: José Manuel López Montesinos 
 * Curso: 1º DAW
 * Descripción: Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc.
 * hasta introducir 10 diez veces, y luego la muestre por pantalla. En esta ocasión se utiliza Arrays.fill().
 */
package ejercicio16;

import java.util.Arrays;

public class Ejercicio16 {

	public static void main(String[] args) {
		int tamaño = 0;
		for (int contador = 1; contador <= 10; contador++) {
			tamaño += contador;
		}
		
		int[] array = new int[tamaño];
		int posicion = 0;

		for (int contador = 1; contador <= 10; contador++) {
			Arrays.fill(array, posicion, posicion + contador, contador);
			posicion += contador;
		}

		System.out.print("Secuencia: ");
		for (int contador = 0; contador < array.length; contador++) {
			System.out.print(array[contador] + " ");
		}
	}
}
