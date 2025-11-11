package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double euros;
		double pesetas;
		
		System.out.println("💲 Convertidor pesetas a euros 💲");
	
		
		System.out.println("Introduce el número de pesetas que quieres convetir a euros: ");
		pesetas = teclado.nextDouble();
		
		double eurosConvertidos = pesetas / 166.386;
		System.out.println(pesetas + " pesetas son " + eurosConvertidos + "€.");
		
		
		System.out.println("Introduce el número de euros que quieres convetir a pesetas: ");
		euros = teclado.nextDouble();
		
		double pesetasConvertidas = euros * 166.386;
		System.out.println(euros + "€ son " + pesetasConvertidas + " pesetas.");
		
	}

}