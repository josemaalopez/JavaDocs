package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double val1;
        System.out.println("Indica un valor: ");
        val1 = teclado.nextDouble();
        
        double resultadoCeil = Math.ceil(val1);
        double resultadoFloor = Math.floor(val1);
        long resultadoRound = Math.round(val1);
        
        System.out.println("RESULTADOS OBTENIDOS");
        System.out.println("Valor original: " + val1);
        
        System.out.println("Math.ceil: " + val1 + " = " + resultadoCeil);
        System.out.println("Explicación: Math.ceil() redondea hacia arriba al entero más cercano");
        
        System.out.println("Math.floor: " + val1 + " = " + resultadoFloor);
        System.out.println("Explicación: Math.floor() redondea hacia abajo al entero más cercano");
        
        System.out.println("Math.round: " + val1 + " = " + resultadoRound);
        System.out.println("Explicación: Math.round() redondea al entero más cercano");

        
        System.out.println("EJEMPLOS ADICIONALES");
        System.out.println("Para entender mejor las diferencias:");
        System.out.println("Si el valor fuera 4.3: ");
        System.out.println("ceil(4.3) = 5.0 (siempre hacia arriba)");
        System.out.println("floor(4.3) = 4.0 (siempre hacia abajo)");
        System.out.println("round(4.3) = 4 (redondea a 4)");
        
        System.out.println("Si el valor fuera 4.7:");
        System.out.println("ceil(4.7) = 5.0 (siempre hacia arriba)");
        System.out.println("floor(4.7) = 4.0 (siempre hacia abajo)");
        System.out.println("round(4.7) = 5 (redondea a 5)");
        
        System.out.println("Si el valor fuera -3.2:");
        System.out.println("ceil(-3.2) = -3.0 (hacia arriba en la recta numérica)");
        System.out.println("floor(-3.2) = -4.0 (hacia abajo en la recta numérica)");
        System.out.println("round(-3.2) = -3 (redondea a -3)");

	}

}
