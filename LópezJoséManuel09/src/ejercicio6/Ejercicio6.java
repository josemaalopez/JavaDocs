/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño N,
escriba M en todas sus posiciones y lo muestre por pantalla.
*/
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int N, M, contadorPosicion;
		
		System.out.println("Dame un valor para N (tamaño del array): ");
		N = teclado.nextInt();
		
		int[] array = new int[N];
		
		System.out.println("Dame un valor para M (valor de todas las posiciones): ");
		M = teclado.nextInt();
		
		for (contadorPosicion = 0; contadorPosicion < N; contadorPosicion++) {
		System.out.println("El valor de la posición " + contadorPosicion + " es: " + M);
	}
	}
}
