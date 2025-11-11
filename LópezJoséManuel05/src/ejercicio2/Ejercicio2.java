/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: El siguiente programa será una mejora del anterior. Aprovecharemos el código realizado anteriormente, pero añadiremos una nueva comprobación.
*/
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String nombre, apellidos;
        int edad;
        double salario;
        
        System.out.println("Introduzca su nombre: ");
        nombre = teclado.nextLine();
        
        System.out.println("Introduzca sus apellidos: ");
        apellidos = teclado.nextLine();
        
        System.out.println("Introduzca edad: ");
        edad = teclado.nextInt();
        
        System.out.println("Salario deseado (en euros): ");
        salario = teclado.nextDouble();
        
        if (salario > 30000 || edad > 45) {
            System.out.println("Lo sentimos, pero no cumple nuestro perfil.");
        } else {
            int anyosExp, proyectosAnt;
            
            System.out.println("¿Cuántos años de experiencia tienes en el sector?");
            anyosExp = teclado.nextInt();
            
            System.out.println("¿Cuántos proyectos has realizado anteriormente?");
            proyectosAnt = teclado.nextInt();
            
            if (anyosExp < 2 && proyectosAnt < 3) {
            	System.out.println("Lo sentimos, pero no cumple nuestro perfil.");
            } else {
                System.out.println("Enhorabuena. Ha sido contratado.");
            if (anyosExp > 5 && proyectosAnt > 5) {
            	salario = 30000;
                System.out.println("Por haber cumplido todos los requisitos, tener más de 5 años de experiencia y haber trabajado en más de 5 proyectos, su salario anual será de 30.000 euros.");
            } else {
            	salario = 25000;
            	System.out.println("Su salario anual será de 25.000 euros");
            }
            
            }
        }
	}
}