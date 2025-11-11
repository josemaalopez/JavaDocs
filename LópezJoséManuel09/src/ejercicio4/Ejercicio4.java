/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Crea un programa que pida veinte números enteros por teclado, los almacene en un array y
luego muestre por separado la suma de todos los valores positivos y negativos.
*/
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int[] array20num;
		array20num = new int[20];
		int suma = 0;
		int sumaPositivos = 0;
		int sumaNegativos = 0;
		
		for (int contadorPosicion = 0; contadorPosicion < array20num.length; contadorPosicion++) {
			System.out.println("Teclea un número: ");
			array20num[contadorPosicion] = teclado.nextInt();
		}
		
		for (int contadorPosicion = 0; contadorPosicion < array20num.length; contadorPosicion++) {
		
			if (array20num[contadorPosicion] < 0) {
			sumaNegativos = sumaNegativos + array20num[contadorPosicion];
			} 
			if (array20num[contadorPosicion] > 0) {
			sumaPositivos = sumaPositivos + array20num[contadorPosicion];
			}
		}
		System.out.println("La suma de los valores positivos es: " + sumaPositivos);
		System.out.println("La suma de los valores negativos es: " + sumaNegativos);
	}
}