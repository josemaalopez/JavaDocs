/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Crea un programa que pida diez números reales por teclado, los almacene en un array, y
luego muestre todos sus valores.
*/
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int[] array10num;
		array10num = new int[10];
		
		for (int contadorPosicion = 0; contadorPosicion < array10num.length; contadorPosicion++) {
			System.out.println("Teclea un número: ");
			array10num[contadorPosicion] = teclado.nextInt();
			
		} for (int contadorPosicion = 0; contadorPosicion < array10num.length; contadorPosicion++) {
			System.out.println("El valor de la posición " + contadorPosicion + " es: " + array10num[contadorPosicion]);
		}
	}
}