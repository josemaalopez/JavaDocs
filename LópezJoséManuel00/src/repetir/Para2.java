package repetir;

import java.util.Scanner;

public class Para2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numInicial, numFinal;
        
        System.out.print("Introduce el número inicial: ");
        numInicial = teclado.nextInt();
        
        System.out.print("Introduce el número final: ");
        numFinal = teclado.nextInt();
        
        //System.out.println("Los múltiplos de 10 desde el número " + numInicial + " hasta el número " + numFinal + " son: ");
        
        //for (int contador = numInicial; contador <= numFinal; contador = contador + 10) {
            //System.out.println(contador);
            
            for (int contador = numInicial; contador <= numFinal; contador ++) {
            System.out.println("Analizando el valor " + contador);
            if (contador % 5 == 0) {
            	System.out.println("   " + contador + " es múltiplo de 5 ");
            }
        
        }
    
    }
}
