/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Utilizando un bucle while solicita al usuario que introduzca valores positivos, almacena
la suma de todos estos valores, así como la cantidad de números introducidos. El bucle
parará cuando introduzca un 0. En ese momento el programa mostrará por pantalla la
cantidad de números mayores de 0 introducidos así como la media de los mismos.
*/
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num1;
		System.out.println("Dime un número");
		num1 = teclado.nextInt();
		
		int sumaTotal = 0, contador = 0;
		while (num1 != 0) {
			sumaTotal = sumaTotal + num1;
			contador = contador + 1;
			
			System.out.println("Dime otro número (0 para acabar)");
			num1 = teclado.nextInt();
		}
		
		double media = (double) sumaTotal / contador;
		System.out.println("Has introducido " + contador + " números y su media aritmética es: " + media);
		
	}
}
