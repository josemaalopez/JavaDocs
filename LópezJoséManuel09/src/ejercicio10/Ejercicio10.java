/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas.
Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego
mostrará la altura media, máxima y mínima así como cuántas personas miden por encima y
por debajo de la media.
*/
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);

	    int N;

	    System.out.println("Dime cuántas alturas quieres introducir (en entero): ");
	    N = teclado.nextInt();

	    double array[] = new double[N];

	    for (int contadorPosicion = 0; contadorPosicion < N; contadorPosicion++) {
	    System.out.println("Altura " + (contadorPosicion + 1) + ": ");
	    array[contadorPosicion] = teclado.nextDouble();
	    }

	    double sumaAltura = 0;
	    double alturaMaxima = array[0];
	    double alturaMinima = array[0];

	    for (int contador = 0; contador < N; contador++) {
	            sumaAltura = sumaAltura + array[contador];
	        if (array[contador] > alturaMaxima) {
	                alturaMaxima = array[contador];
	        }
	        if (array[contador] < alturaMinima) {
	                alturaMinima = array[contador];
	        }
	    	}
	        double alturaMedia = sumaAltura / N;

	        int encimaDeLaMedia = 0;
	        int debajoDeLaMedia = 0;

	        for (int contador = 0; contador < N; contador++) {
	            if (array[contador] > alturaMedia) {
	                encimaDeLaMedia++;
	            } else if (array[contador] < encimaDeLaMedia) {
	                debajoDeLaMedia++;
	            }
	        }
	        System.out.println("\nAltura media: " + alturaMedia);
	        System.out.println("Altura máxima: " + alturaMaxima);
	        System.out.println("Altura mínima: " + alturaMinima);
	        System.out.println("Personas por encima de la media: " + encimaDeLaMedia);
	        System.out.println("Personas por debajo de la media: " + debajoDeLaMedia);
	}
}