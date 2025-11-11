package repetir;

import java.util.Scanner;

public class Para {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un número");
		int numero = teclado.nextInt();
		
		for (int contador = 1; contador <= 10; contador ++) {
			System.out.println(numero + " x " + contador + " = " + numero*contador);
		}

	}
	
}