package letraNif;

import java.util.Scanner;

public class LetraDni {
    public static void main(String[] args) {
        // Objeto de la clase Scanner para introducir dni por teclado y dos variables de tipo int que almacenan el dni y el resto del resultado de la división
        Scanner teclado = new Scanner(System.in);
        int dni;
        int resto;
        
        // Se pide que se introduzca el número Dni, se almacena en la variable dni y se realiza la operación para calcular el resto
        System.out.println("Escriba su número DNI: ");
        dni = teclado.nextInt();
        resto = dni%23;
        
        // Se crea un condicional switch y según el resultado muestra una letra por pantalla.
        switch(resto) {
            case 0:
                System.out.println("La letra del DNI " + dni + " es " +
                        "T.");
                break;
            case 1:
                System.out.println("La letra del DNI " + dni + " es " +
                        "R.");
                break;
            case 2:
                System.out.println("La letra del DNI " + dni + " es " +
                        "W.");
                break;
            case 3:
                System.out.println("La letra del DNI " + dni + " es " +
                        "A.");
                break;
            case 4:
                System.out.println("La letra del DNI " + dni + " es " +
                        "G.");
                break;
            case 5:
                System.out.println("La letra del DNI " + dni + " es " +
                        "M.");
                break;
            case 6:
                System.out.println("La letra del DNI " + dni + " es " +
                        "Y.");
                break;
            case 7:
                System.out.println("La letra del DNI " + dni + " es " +
                        "F.");
                break;
            case 8:
                System.out.println("La letra del DNI " + dni + " es " +
                        "P.");
                break;
            case 9:
                System.out.println("La letra del DNI " + dni + " es " +
                        "D.");
                break;
            case 10:
                System.out.println("La letra del DNI " + dni + " es " +
                        "X.");
                break;
            case 11:
                System.out.println("La letra del DNI " + dni + " es " +
                        "B.");
                break;
            case 12:
                System.out.println("La letra del DNI " + dni + " es " +
                        "N.");
                break;
            case 13:
                System.out.println("La letra del DNI " + dni + " es " +
                        "J.");
                break;
            case 14:
                System.out.println("La letra del DNI " + dni + " es " +
                        "Z.");
                break;
            case 15:
                System.out.println("La letra del DNI " + dni + " es " +
                        "S.");
                break;
            case 16:
                System.out.println("La letra del DNI " + dni + " es " +
                        "Q.");
                break;
            case 17:
                System.out.println("La letra del DNI " + dni + " es " +
                        "V.");
                break;
            case 18:
                System.out.println("La letra del DNI " + dni + " es " +
                        "H.");
                break;
            case 19:
                System.out.println("La letra del DNI " + dni + " es " +
                        "L.");
                break;
            case 20:
                System.out.println("La letra del DNI " + dni + " es " +
                        "C.");
                break;
            case 21:
                System.out.println("La letra del DNI " + dni + " es " +
                        "K.");
                break;
            case 22:
                System.out.println("La letra del DNI " + dni + " es " +
                        "E.");
                break;
        }
        teclado.close();
    }
}