/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Crea un programa que pida al usuario 20 valores enteros e introduzca los 10 primeros en un array y los 10 últimos en otro array.
Por último, comparará ambos arrays y le dirá al usuario si son iguales o no.
*/
package ejercicio17;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] valores = new int[20];

        System.out.println("Introduce 20 valores enteros:");
        for (int contador = 0; contador < 20; contador++) {
            System.out.print("Valor " + (contador + 1) + ": ");
            valores[contador] = teclado.nextInt();
        }
        
        for (int contador = 0; contador < 10; contador++) {
            array1[contador] = valores[contador];
        } for (int contador = 0; contador < 10; contador++) {
            array2[contador] = valores[contador + 10];
        }
        
        if (Arrays.equals(array1, array2)) {
            System.out.println("Los arrays son iguales.");
        } else {
            System.out.println("Los arrays son diferentes.");
        }
    }
}
