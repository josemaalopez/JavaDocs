package repetir;

import java.util.Scanner;

public class Repetir {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, suma = 0, contador = 0;
		
		do {
			System.out.println("Dame un número: (0 para terminar)");
			numero = teclado.nextInt();
			if (numero !=0) {
				contador = contador + 1;
			}
			suma = suma + numero;
		} while (numero !=0 );
		
		System.out.println("La suma es: " + suma);
		System.out.println("Contador de números: " + contador);
	}

}
