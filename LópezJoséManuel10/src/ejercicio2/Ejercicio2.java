/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla.
*/
package ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
	    int[][] matriz = new int[10][10];

	    for (int fila = 0; fila < 10; fila++) {
	    int numero = fila + 1;
	    for (int columna = 0; columna < 10; columna++) {
	    matriz[fila][columna] = numero * (columna + 1);
	    }
	    
	    } for (int fila = 0; fila < 10; fila++) {
	    for (int columna = 0; columna < 10; columna++) {
	    System.out.print(matriz[fila][columna] + "\t");
	    }
	    System.out.println("");
	    }
	}
}