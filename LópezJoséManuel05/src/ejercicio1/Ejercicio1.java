/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Realizar un programa en Java que ayudará a un equipo de Recursos Humanos a realizar una serie de entrevistas al usuario
*/
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String nombre, apellidos;
        int edad;
        double salarioDeseado;
        
        System.out.println("Introduzca su nombre: ");
        nombre = teclado.nextLine();
        
        System.out.println("Introduzca sus apellidos: ");
        apellidos = teclado.nextLine();
        
        System.out.println("Introduzca edad: ");
        edad = teclado.nextInt();
        
        System.out.println("Salario deseado (en euros): ");
        salarioDeseado = teclado.nextDouble();
        
        if (salarioDeseado > 30000 || edad > 45) {
            System.out.println("Lo sentimos, pero no cumple nuestro perfil.");
        } else {
            int anyosExp, proyectosAnt;
            
            System.out.println("¿Cuántos años de experiencia tienes en el sector?");
            anyosExp = teclado.nextInt();
            
            System.out.println("¿Cuántos proyectos has realizado anteriormente?");
            proyectosAnt = teclado.nextInt();
            
            if (anyosExp > 2 && proyectosAnt > 3) {
                System.out.println("Enhorabuena. Ha sido contratado.");
            } else {
                System.out.println("Lo sentimos, pero no cumple nuestro perfil.");
            }
        }
       
    }
}
