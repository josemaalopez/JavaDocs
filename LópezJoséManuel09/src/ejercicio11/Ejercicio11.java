/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el
primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores del
primer array al segundo array en orden inverso, y mostrar ambos por pantalla.
*/
package ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {
		int[] array1 = new int[100];
		int[] array2 = new int[100];

		for (int contador = 0; contador < 100; contador++) {
		    array1[contador] = contador + 1;
		}

		for (int contador = 0; contador < 100; contador++) {
		    array2[contador] = array1[99 - contador];
		}
		
		System.out.println("Array 1: ");
		for (int valor : array1) {
		    System.out.print(valor + " ");
		}
		System.out.println("");
		System.out.println("");// Estos println hacen que el título Array 2 salte a la siguiente línea y deje un espacio entre los 2 arrays, sin este println se quedaba al final del Array 1
		System.out.println("Array 2: ");
		for (int valor : array2) {
		    System.out.print(valor + " ");
		}


	}

}
