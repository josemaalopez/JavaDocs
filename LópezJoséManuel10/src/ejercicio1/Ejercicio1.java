/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
y luego muestre la matriz por pantalla.
*/
package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		int[][] matriz5por5 = new int[5][5];
		int numero = 1;

		for (int fila = 0; fila < 5; fila++) {
		for (int columna = 0; columna < 5; columna++) {
	    matriz5por5[fila][columna] = numero;
	    numero++;
	    }
		
	    } for (int fila = 0; fila < 5; fila++) {
	    for (int columna = 0; columna < 5; columna++) {
	    System.out.print(matriz5por5[fila][columna]  + "\t");
	    }
	    System.out.println("");
	    }
	}
}