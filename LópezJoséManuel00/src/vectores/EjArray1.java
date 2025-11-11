package vectores;

import java.util.Scanner;

public class EjArray1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final int TAMANYO = 30;
		
		int[] numeros; // Declaramos array de enteros
		numeros = new int [TAMANYO]; // Instanciamos el array
		
		for (int posicion = 0; posicion < TAMANYO; posicion++) {
			numeros [posicion] = (int) (Math.random() * 50); // Inicializamos a cero todas las posiciones
		}
		
		for (int posicion = 0; posicion < TAMANYO; posicion++) {
			System.out.println("El valor de la posición " + posicion + " es: " + numeros[posicion]);
		}
	}

}