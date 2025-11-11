package OperadoresBasicos;

import java.util.Scanner;

public class EjOperadoresBasicos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int dato1;
		double dato2;
		
		System.out.print("Dame un número de tipo entero: ");
		dato1 = teclado.nextInt();
		
		System.out.print("y dame un número de tipo doble: ");
		dato2 = teclado.nextDouble();
		
		double suma;
		suma = dato1+dato2;
		System.out.println("La suma es: " + suma);
		
		double resta;
		resta = dato1-dato2;
		System.out.println("La resta es: " + resta);
		
		double mult; // Multiplicación.
		mult = dato1*dato2;
		System.out.println("La multiplicación es: " + mult);
		
		double div; // División.
		div = dato1/dato2;
		System.out.println("La división es: " + div); // Al hacer la división nos dará error si no convertimos el dato 2 y todas las variables en double.
		
		double resto;
		resto = dato1%dato2;
		System.out.println("El módulo de la división es: " + resto);
		
	
		
		
		
	}

}
