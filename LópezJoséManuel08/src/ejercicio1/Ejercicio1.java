/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Escribe un programa Java que muestre por pantalla los 20 primeros números naturales (1, 2, 3, …., 20).
*/
package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		System.out.println("Los primeros 20 números naturales son: ");
		
		for (int contador = 0; contador < 20;) {
			 
			contador = contador + 1 ;
			 System.out.print(contador + " ");
		
		}
	}

}
