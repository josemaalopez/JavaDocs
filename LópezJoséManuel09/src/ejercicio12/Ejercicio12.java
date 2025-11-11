/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con distintas opciones:
a) Mostrar valores; b) Introducir valor; c) Salir.
*/
package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] array = new int[10]; // Array de 10 enteros
        char opcion;

        do {
        	System.out.println("-----------------------");
        	System.out.println("| Menú:               |");
            System.out.println("| a) Mostrar valores  |");
            System.out.println("| b) Introducir valor |");
            System.out.println("| c) Salir            |");
            System.out.println("-----------------------"); // ?
            System.out.println(""); // Separo el menú de la opción a elegir
            System.out.print("Elige una opción: ");
            opcion = teclado.next().charAt(0);

            if (opcion == 'a' || opcion == 'A') {
                for (int contador = 0; contador < array.length; contador++) {
                    System.out.println("Posición " + contador + ": " + array[contador]);
                }
            } else if (opcion == 'b' || opcion == 'B') {
                System.out.print("Introduce la posición (0-9): ");
                int posicion = teclado.nextInt();
                System.out.print("Introduce el valor: ");
                int valor = teclado.nextInt();
                array[posicion] = valor;
            }
        } while (opcion != 'c' && opcion != 'C');

        System.out.println("El programa ha terminado.");
    }
}
