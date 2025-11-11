package entradaDatos;

import java.util.Scanner;

public class PeticionDeDatos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int edadAlumno;
		String nombreAlumno;
		Double pesoAlumno;
		
		System.out.println("Dame tu edad: ");
		edadAlumno = teclado.nextInt();
		
		teclado.nextLine(); // ¡¡IMPORTANTE!! Después de pedir valor numérico y antes de pedir una cadena de caracteres hay que poner este comando
		System.out.println("Dame tu nombre: ");
		nombreAlumno = teclado.nextLine();
		
		System.out.println("y por último dame tu peso: ");
		pesoAlumno = teclado.nextDouble();
		
		System.out.println("Tu edad es " + edadAlumno + ", tu nombre es " + nombreAlumno + " y tu peso es " + pesoAlumno);
		
	}

}
