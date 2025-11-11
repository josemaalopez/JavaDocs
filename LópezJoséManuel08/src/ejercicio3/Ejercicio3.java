/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Escribe un programa Java que muestre los números pares comprendidos entre el 1 y el 200. Esta vez utiliza un contador sumando de 1 en 1. 
*/
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
			System.out.println("Los números pares comprendidos entre el 1 y el 200 son: ");
			for (int contador = 1; contador <= 200; contador = contador + 1) {
		
			if (contador % 2 == 0) {
			
			System.out.print(contador + " ");
			
			}
		}
	}
}