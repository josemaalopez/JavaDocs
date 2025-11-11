/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Crea un programa que pida diez números reales por teclado, los almacene en un array, y
luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
*/
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int[] array10num;
		array10num = new int[10];
		
		for (int contadorPosicion = 0; contadorPosicion < array10num.length; contadorPosicion++) {
			System.out.println("Teclea un número: ");
			array10num[contadorPosicion] = teclado.nextInt();
		}
		int numMenor = array10num[0];
		int numMayor = array10num[0];
			
		for (int contadorPosicion = 0; contadorPosicion < array10num.length; contadorPosicion++) {
				
				if (numMenor > array10num[contadorPosicion]) {
					numMenor = array10num[contadorPosicion];
				}
				if (numMayor < array10num[contadorPosicion]) {
					numMayor = array10num[contadorPosicion];
				}
		}
		System.out.println("El menor de los 10 números introducidos es " + numMenor + " y el mayor es " + numMayor);
	}
}