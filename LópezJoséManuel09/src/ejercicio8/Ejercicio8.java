/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
cuántos valores del array son igual o superiores a R.
*/
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] array100num = new double[100];

		for (int contadorPosicion = 0; contadorPosicion < array100num.length; contadorPosicion++) {
			array100num[contadorPosicion] = Math.random();
		} 
		
		System.out.print("Introduce un valor R entre 0.0 y 1.0: ");
		double valorR = teclado.nextDouble();
		
		int contadorValores = 0;
		
		for (int contadorPosicion = 0; contadorPosicion < array100num.length; contadorPosicion++) {
			if (array100num[contadorPosicion] >= valorR) {
				contadorValores++;
			}
		}
		System.out.println("Hay " + contadorValores + " valores del array que son iguales o superiores a " + valorR);
	}
}