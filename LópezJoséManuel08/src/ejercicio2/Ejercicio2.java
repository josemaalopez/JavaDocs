/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Escribe un programa Java que muestre los números pares comprendidos entre el 1 y el 200. Para ello utiliza un contador y suma de 2 en 2.
*/
package ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		System.out.println("Los números pares comprendidos entre el 1 y el 200 son:");
		
		for (int contador = 0; contador < 200;) {
			 
			contador = contador + 2 ;
			System.out.print(contador + " ");
			 
		}

	}

}