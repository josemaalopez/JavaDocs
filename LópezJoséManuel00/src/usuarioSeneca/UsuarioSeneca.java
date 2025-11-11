package usuarioSeneca;

import java.util.Scanner;

import java.util.Random;

public class UsuarioSeneca {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Introduce tu nombre (sin acentos):");
        String nombre = teclado.nextLine().trim();

        System.out.println("Introduce tu primer apellido (sin acentos):");
        String apellido1 = teclado.nextLine().trim();

        System.out.println("Introduce tu segundo apellido:");
        String apellido2 = teclado.nextLine().trim();

        // Convertimos a arrays de caracteres
        char[] nombreArray = nombre.toLowerCase().toCharArray();
        char[] ape1Array = apellido1.toLowerCase().toCharArray();
        char[] ape2Array = apellido2.toLowerCase().toCharArray();

        // Construimos el usuario
        StringBuilder usuario = new StringBuilder();

        // 1. Inicial del nombre
        usuario.append(nombreArray[0]);

        // 2. Primeras 3 letras del primer apellido
        for (int contador = 0; contador < 3 && contador < ape1Array.length; contador++) {
            usuario.append(ape1Array[contador]);
        }

        // 3. Primeras 3 letras del segundo apellido
        for (int contador = 0; contador < 3 && contador < ape2Array.length; contador++) {
            usuario.append(ape2Array[contador]);
        }

        // 4. 3 dígitos aleatorios
        for (int contador = 0; contador < 3; contador++) {
            usuario.append(rand.nextInt(10)); // 0 a 9
        }

        System.out.println("Usuario generado: " + usuario.toString());
    }
}


