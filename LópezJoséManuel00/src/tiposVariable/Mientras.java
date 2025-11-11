
package tiposVariable;

import java.util.Scanner;

public class Mientras {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int contador = 0;
		
		int inicio;
		System.out.println("Introduzca el inicio: ");
		inicio = teclado.nextInt();
		
		int fin;
		System.out.println("Introduzca el fin: ");
		fin = teclado.nextInt();
		
		if (inicio <= fin) { // secuencia creciente
			System.out.println("Secuencia creciente desde " + inicio + " hasta " + fin);
			contador = inicio;
			do {
				System.out.print(contador + " ");
				contador = contador + 1;
			} while (contador <= fin);
		} else {
			System.out.println("Secuencia decreciente desde " + inicio + " hasta " + fin);
			contador = inicio;
			do {
				System.out.print(contador + " ");
				contador = contador - 1;
			} while (contador >= fin);
		}
	}
}
