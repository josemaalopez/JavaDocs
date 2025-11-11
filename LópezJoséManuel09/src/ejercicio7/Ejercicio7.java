/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga
todos los valores desde P hasta Q, y lo muestre por pantalla.
*/
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int P, Q, contadorPosicion;
		
		System.out.println("Dame un valor P: ");
		P = teclado.nextInt();
		System.out.println("Dame un valor Q: ");
		Q = teclado.nextInt();
		
		int tamanyoPQ = Q - P + 1;
		int[] array = new int[tamanyoPQ];
		
		int valor = P;
		for (contadorPosicion = 0; contadorPosicion < tamanyoPQ; contadorPosicion++) {
			
			array[contadorPosicion] = valor;
			System.out.println("El valor " + contadorPosicion + " es: " + array[contadorPosicion]);
			valor = valor + 1;
		}
	}
}
