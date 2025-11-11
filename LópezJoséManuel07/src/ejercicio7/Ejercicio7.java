/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Realizar un juego para adivinar un número entero. Para ello el programa calculará un
número aleatorio N entre 0 y 50. Luego el programa irá pidiendo números indicando
“mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina
cuando el usuario acierta.
*/
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double numAleatorio = (int) (Math.random() * 50);

        int intento = 0;

        System.out.println("Adivina el número entre 0 y 50");

        while (intento != numAleatorio) {
            System.out.print("Introduce tu número: ");
            intento = teclado.nextInt();

            if (intento < numAleatorio) {
                System.out.println("El número es mayor");
            } else if (intento > numAleatorio) {
                System.out.println("El número es menor");
            } else {
                System.out.println("Has acertado! El número era " + numAleatorio);
            }
        }
    }
}