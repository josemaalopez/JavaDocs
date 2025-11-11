/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
menores que cero y cuántos son igual a cero.
*/
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);

	    int N, M;
	    int mayoresque0 = 0, menoresque0 = 0, igualesque0 = 0;

	    System.out.println("Introduce el número de filas (N): ");
	    N = teclado.nextInt();

	    System.out.println("Introduce el número de columnas (M): ");
	    M = teclado.nextInt();

	    int[][] matrizNM = new int[N][M];

	    System.out.println("Introduce los valores de la matriz: ");
	        for (int fila = 0; fila < N; fila++) {
	            for (int columna = 0; columna < M; columna++) {
	                System.out.print("Valor (" + fila + ")(" + columna + "): ");
	                matrizNM[fila][columna] = teclado.nextInt();
	            }
	        }

	        for (int fila = 0; fila < N; fila++) {
	            for (int columna = 0; columna < M; columna++) {
	                if (matrizNM[fila][columna] > 0) {
	                    mayoresque0++;
	                } else if (matrizNM[fila][columna] < 0) {
	                    menoresque0++;
	                } else {
	                    igualesque0++;
	                }
	            }
	        }
	        System.out.println("Los números mayores que cero son " + mayoresque0 + ", los menores que cero son " + menoresque0 + " y los iguales a cero son " + igualesque0 + ".");
	}
}