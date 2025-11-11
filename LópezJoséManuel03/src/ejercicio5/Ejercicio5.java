package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	
	    public static void main(String[] args) {
	        Scanner teclado = new Scanner(System.in);

	        System.out.print("Introduce el primer número: ");
	        double num1 = teclado.nextDouble();

	        System.out.print("Introduce el segundo número: ");
	        double num2 = teclado.nextDouble();

	        double menor = Math.min(num1, num2);
	        System.out.println("El número menor es: " + menor);

	        double potenciaNum = Math.pow(num1, num2);
	        System.out.println(num1 + " elevado a " + num2 + " es: " + potenciaNum);

	        double raiz = Math.sqrt(num1);
	        System.out.println("La raíz cuadrada de " + num1 + " es: " + raiz);

	        double numAleatorio = Math.random() * num2;
	        System.out.println("Valor aleatorio hasta " + num2 + ": " + numAleatorio);

	    }
}