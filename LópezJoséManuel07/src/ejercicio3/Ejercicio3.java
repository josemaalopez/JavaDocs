/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Ejemplo de uso de do-while. Programa Java que muestre los números del 100 al 1 utilizando la sentencia do..while.
*/
package ejercicio3;

public class Ejercicio3 {

		public static void main(String[] args) {

		int num1 = 100, num2 = 1, contador = num1;

		System.out.println("Los números del " + num1 + " al " + num2 + " son:");

		do { 
			System.out.println(contador);
			contador --;
		} while ( contador >= num2 );
	}
}
