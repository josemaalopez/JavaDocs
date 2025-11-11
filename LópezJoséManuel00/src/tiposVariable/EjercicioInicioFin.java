package tiposVariable;

import java.util.Scanner;

public class EjercicioInicioFin {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		int num1 = teclado.nextInt();
		
		System.out.println("Dime otro número: ");
		int num2 = teclado.nextInt();
		
		
		int contador = num1;
		if (num1 <= num2) {
			System.out.println("Secuencia de números desde " + num1 + " hasta " + num2);
		while (num1 > num2) {
			System.out.print("" + contador + " ");
			 contador = contador + 1;
		}
		} else {
	    System.out.print("El primer valor que me has dado es mayor que el segundo, por lo que no te puedo mostrar los números comprendidos entre ambos");
	}
	}

}
