package OperadoresBasicos;

import java.util.Scanner;

public class condicionalmixto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Introduce un número:");
		numero = teclado.nextInt();
		
		if (numero > 0) { // el número es positivo
			System.out.println("Positivo");
			if (numero > 50) {
				System.out.println("Mayor de 50");
		} else { // no es positivo pero puede ser cero o negativo
		if (numero == 0) {
			System.out.println("Cero");
		} else {
		if (numero < 0) {
			System.out.println("Negativo");
		}
		
		}
	}
}
}
}