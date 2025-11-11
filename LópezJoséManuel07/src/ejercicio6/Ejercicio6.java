/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
*/
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        int num1;
        
        System.out.print("Dime un número: ");
        num1 = teclado.nextInt();
        
        while (num1 >= 0) {
            int cuadrado = num1 * num1;
            System.out.println("Su cuadrado es: " + cuadrado);
            
            System.out.print("Dime otro número: ");
            num1 = teclado.nextInt();
        }
        System.out.println("Has introducido un número negativo, el programa ha terminado.");
    }
}
