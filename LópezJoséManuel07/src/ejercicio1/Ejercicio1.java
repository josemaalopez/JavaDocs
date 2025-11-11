/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Ejemplo de uso de while: Programa Java que muestre los números del 1 al 100 utilizando la sentencia while.
*/
package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int num1 = 1, num2 = 100, contador = num1;
		
		System.out.println("Los números del " + num1 + " al " + num2 + " son:");

		while (contador <= num2) {
			System.out.println(contador);
			contador ++;
		}

	}
}
