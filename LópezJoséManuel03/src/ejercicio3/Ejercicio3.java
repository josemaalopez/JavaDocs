package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer número (num1): ");
        int num1 = teclado.nextInt();

        System.out.print("Introduce el segundo número (num2): ");
        int num2 = teclado.nextInt();

        System.out.println("Antes del intercambio: ");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int cambioNum = num1;
        num1 = num2;
        num2 = cambioNum;

        System.out.println("Después del intercambio se queda como: ");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

    }
}
