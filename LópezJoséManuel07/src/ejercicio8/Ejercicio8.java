/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Aplicación de senderismo
*/
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombre, apellidos;
        int edad;
        
        double distancia, sumaDistancia = 0, distanciaMasLarga = 0;
        String ciudad = "", ciudadMasLarga = "";
        
        System.out.print("Introduzca su nombre: ");
        nombre = teclado.nextLine();

        System.out.print("Introduzca sus apellidos: ");
        apellidos = teclado.nextLine();

        do {
            System.out.print("Introduzca su edad: ");
            edad = teclado.nextInt();
            if (edad <= 17 || edad >= 45) {
                System.out.println("Esa edad no es correcta");
            }
        } while (edad <= 17 || edad >= 45);

        System.out.print("Introduzca el número de rutas que ha realizado: ");
        int numRutas = teclado.nextInt();

        System.out.print("Introduzca la distancia de la última ruta realizada: ");
        double distUltRuta = teclado.nextDouble();

        System.out.println("Introduzca los datos de las 5 caminatas");

        int contador = 1;
        while (contador <= 5) {
            System.out.println("Caminata " + contador + ":");

            System.out.print("Distancia (en km): ");
            distancia = teclado.nextDouble();
            teclado.nextLine();

            System.out.print("Número de participantes: ");
            int numParticipantes = teclado.nextInt();
            teclado.nextLine();

            System.out.print("Ciudad: ");
            ciudad = teclado.nextLine();

            sumaDistancia = sumaDistancia + distancia;

            if (distancia > distanciaMasLarga) {
                distanciaMasLarga = distancia;
                ciudadMasLarga = ciudad;
            }

            contador = contador + 1;
        }

        double distanciaMedia = sumaDistancia / 5;
        
        System.out.println("---------------------------------------------------------");
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("Número de rutas realizadas: " + numRutas);
        System.out.println("Distancia media (5 últimas rutas): " + distanciaMedia + " km");
        System.out.println("Distancia más larga de las últimas 5 rutas: " + distanciaMasLarga + " km");
        System.out.println("Ciudad de la ruta más larga: " + ciudadMasLarga);
        System.out.println("---------------------------------------------------------");
    }
}
