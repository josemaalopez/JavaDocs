/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.
*/
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num1;
		int contadorPositivo = 0;
		int contadorNegativo = 0;
		int contadorCero = 0;
		
		int sumaPositivos = 0;
		int sumaNegativos = 0;
		
		double mediaPositivos = 0;
		double mediaNegativos = 0;
		
		int contador = 0;
		
		while (contador < 10) {
			System.out.println("Dime un número:");
			num1 = teclado.nextInt();
			
			if (num1 > 0) {
				sumaPositivos = sumaPositivos + num1;
				contadorPositivo = contadorPositivo + 1;
			} else if (num1 < 0) {
				sumaNegativos = sumaNegativos + num1;
				contadorNegativo = contadorNegativo + 1;
			} else {
				contadorCero = contadorCero + 1;
			}
			
			contador = contador + 1;
		}
		if (contadorPositivo > 0) {
			mediaPositivos = (double) sumaPositivos / contadorPositivo;
		}
		if (contadorNegativo > 0) {
			mediaNegativos = (double) sumaNegativos / contadorNegativo;
		}
		
		System.out.println("Media de positivos: " + mediaPositivos);
		System.out.println("Media de negativos: " + mediaNegativos);
		System.out.println("Cantidad de ceros: " + contadorCero);
	}
}
