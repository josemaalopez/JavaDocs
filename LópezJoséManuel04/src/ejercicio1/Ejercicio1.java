/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Realizar un programa en Java que solicite al usuario dos números, num1 y num2.
- Comprobar si num1 es mayor que num2, si es al revés o si son iguales.
- Mostrar por pantalla al usuario un mensaje informando del resultado.
*/
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2;
        System.out.println("Introduce 2 números: ");
        num1 = teclado.nextInt();
        System.out.println("y ");
        num2 = teclado.nextInt();

        if (num1 > num2) {
            System.out.println("El primer número (" + num1 + ") es mayor que el segundo (" + num2 + ")");
        } else if (num1 < num2) {
            System.out.println("El primer número (" + num1 + ") es menor que el segundo (" + num2 + ")");
        } else {
            System.out.println("El primer número (" + num1 + ") es igual que el segundo (" + num2 + ")");
        }
    }
}