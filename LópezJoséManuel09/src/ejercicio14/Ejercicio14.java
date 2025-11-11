/* 
 * Nombre: José Manuel López Montesinos 
 * Curso: 1º DAW
 * Descripción: Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de valores: 
 * 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, etc. hasta introducir 10 diez veces, y luego la muestre por pantalla.
 */
package ejercicio14;

public class Ejercicio14 {

	public static void main(String[] args) {

		int[] secuencia = new int[55];
		int contador = 0;

		for (int valor = 1; valor <= 10; valor++) { // el valor se puede cambiar pero hay que cambiar el tamaño del array también
			for (int repeticion = 1; repeticion <= valor; repeticion++) {
				secuencia[contador] = valor;
				contador++;
			}
		}

		System.out.println("Secuencia de valores: ");
		contador = 0;
		while (contador < secuencia.length) {
			System.out.print(secuencia[contador] + " ");
			contador++;
		}
	}
}

