/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y
mostrará en qué posiciones del array aparece N.
*/
package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] array100num = new int[100];

		for (int contadorPosicion = 0; contadorPosicion < array100num.length; contadorPosicion++) {
			array100num[contadorPosicion] = (int) (1 + (Math.random() * 10));
		}

		System.out.print("Introduce un valor N (entero entre 1 y 10): ");
		int valorN = teclado.nextInt();

		System.out.println("El valor " + valorN + " aparece en las posiciones: ");
		
		for (int contadorPosicion = 0; contadorPosicion < array100num.length; contadorPosicion++) {
			
			if (array100num[contadorPosicion] == valorN) {
				System.out.print(contadorPosicion + " ");
			}
		}
	}
}