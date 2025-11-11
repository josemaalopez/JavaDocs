package desgloseDeBilletes;

import java.util.Scanner;

/**
 * Ejercicio 15:
 * Pide una cantidad de euros (múltiplo de 5) y la desglosa
 * en el mínimo número de billetes (500, 200, 100, 50, 20, 10, 5).
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una cantidad de euros (múltiplo de 5): ");
        int cantidad = teclado.nextInt();

        if (cantidad % 5 != 0) {
            System.out.println("La cantidad no es múltiplo de 5.");
        } else {
            System.out.println("Desglose de billetes para " + cantidad + "€:");
            
            // Vamos "consumiendo" la cantidad con los billetes más grandes
            
            // Billetes de 500
            int billetes500 = cantidad / 500;
            cantidad = cantidad % 500; // cantidad = cantidad - (billetes500 * 500);

            // Billetes de 200
            int billetes200 = cantidad / 200;
            cantidad = cantidad % 200;

            // Billetes de 100
            int billetes100 = cantidad / 100;
            cantidad = cantidad % 100;

            // Billetes de 50
            int billetes50 = cantidad / 50;
            cantidad = cantidad % 50;
            
            // Billetes de 20
            int billetes20 = cantidad / 20;
            cantidad = cantidad % 20;

            // Billetes de 10
            int billetes10 = cantidad / 10;
            cantidad = cantidad % 10;
            
            // Billetes de 5
            int billetes5 = cantidad / 5;
            // cantidad = cantidad % 5; // Aquí 'cantidad' ya debería ser 0

            // Mostramos solo los billetes que se usan (si el contador > 0)
            if (billetes500 > 0) System.out.println(billetes500 + " billete(s) de 500€");
            if (billetes200 > 0) System.out.println(billetes200 + " billete(s) de 200€");
            if (billetes100 > 0) System.out.println(billetes100 + " billete(s) de 100€");
            if (billetes50 > 0) System.out.println(billetes50 + " billete(s) de 50€");
            if (billetes20 > 0) System.out.println(billetes20 + " billete(s) de 20€");
            if (billetes10 > 0) System.out.println(billetes10 + " billete(s) de 10€");
            if (billetes5 > 0) System.out.println(billetes5 + " billete(s) de 5€");
        }
    }
}