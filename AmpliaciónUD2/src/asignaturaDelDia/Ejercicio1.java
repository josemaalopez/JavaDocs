package asignaturaDelDia;

import java.util.Scanner;

/**
 * Ejercicio 1:
 * Pide un día de la semana y dice qué asignatura toca a primera hora.
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un día de la semana (ej. Lunes): ");
        String dia = teclado.nextLine();

        // Usamos .toLowerCase() para no distinguir entre mayúsculas y minúsculas
        switch (dia.toLowerCase()) {
            case "lunes":
                System.out.println("A primera hora toca: Programación");
                break;
            case "martes":
                System.out.println("A primera hora toca: Sistemas Informáticos");
                break;
            case "miércoles":
            case "miercoles": // Aceptamos también sin tilde
                System.out.println("A primera hora toca: Programación");
                break;
            case "jueves":
                System.out.println("A primera hora toca: Bases de Datos");
                break;
            case "viernes":
                System.out.println("A primera hora toca: Lenguajes de Marcas");
                break;
            case "sábado":
            case "sabado":
            case "domingo":
                System.out.println("¡Es fin de semana! No hay clase.");
                break;
            default:
                System.out.println("Día no válido.");
                break;
        }
    }
}