package OperadoresBasicos;

import java.util.Scanner;

public class ejercicioNotaExamen {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double notaExamen;
		
		System.out.println("Dime la nota de tu examen:");
		notaExamen = teclado.nextDouble();
		
		if (notaExamen >= 0.0 && notaExamen<= 10.00) // la nota es válida
		
		if (notaExamen >= 5.00) {
		System.out.println("Has aprobado");
		} else {
		System.out.println("Has suspendido");
		
		} else { // La nota no es válida
			System.out.println("Nota no válida, revisa tu entrada.");
		}
	}

}