/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Ejemplo de uso de do-while. Programa Java que muestre los números del 1 al 100 utilizando la sentencia do..while.
*/
package ejercicio2;

public class Ejercicio2 {

public static void main(String[] args) {
		
		int num1 = 1, num2 = 100, contador = num1;
		
		System.out.println("Los números del " + num1 + " al " + num2 + " son:");

		do { 
			System.out.println(contador);
			contador ++;
		} while ( contador <= num2 );
	}
}