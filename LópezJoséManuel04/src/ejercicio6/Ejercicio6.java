/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Este ejercicio supone una variación del ejercicio anterior. Una vez solicitados los datos al
usuario, y almacenada en la correspondiente variable la nota obtenida se harán las siguientes
comprobaciones
*/
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			
			String nombre, apellidos, cicloFormativo;
			int nota;
			
			System.out.println("Dime tu nombre: ");
			nombre = teclado.nextLine();
			
			System.out.println("Dime tus apellidos: ");
			apellidos = teclado.nextLine();
			
			System.out.println("Dime tu ciclo formativo: ");
			cicloFormativo = teclado.nextLine();
			
			System.out.println("Dime tu nota académica (en entero): ");
			nota = teclado.nextInt();
			
			String resNota = "";
			
			if (nota < 0 || nota > 10) {
				System.out.println("La nota académica indicada es incorrecta.");
				
			} else {
				
			if (nota >= 0 && nota < 5) {
				resNota = "Insuficiente";
			}
			if (nota >= 5 && nota < 6) {
				resNota = "Aprobado";
			}
			if (nota >= 6 && nota < 7) {
				resNota = "Bien";
			}
			if (nota >= 7 && nota < 9) {
				resNota = "Notable";
			}
			if (nota >= 9 && nota < 10) {
				resNota = "Sobresaliente";
			}
			if (nota == 10) {
				resNota = "Matrícula de Honor";
			}
			
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: "+ apellidos);
			System.out.println("Ciclo Formativo: " + cicloFormativo);
			System.out.println("Nota académica: " + nota + " (" + resNota + ")");
			
		}

	}

}