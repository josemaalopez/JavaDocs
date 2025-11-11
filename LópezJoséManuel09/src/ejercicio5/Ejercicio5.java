/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Crea un programa que pida veinte números reales por teclado, los almacene en un array y
luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.
*/
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

	    double[] numeros = new double[20];
	    double suma = 0;
	    int contador = 0;

	    while (contador < 20) {
	    System.out.print("Dime un numero: ");
	    numeros[contador] = teclado.nextDouble();
	    suma = suma + numeros[contador];
	    contador = contador + 1;
	    }
	    
	    double media = suma / 20;

	    System.out.println("La media es: " + media);
	}
}