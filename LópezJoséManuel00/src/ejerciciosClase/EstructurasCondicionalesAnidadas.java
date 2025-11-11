package ejerciciosClase;

import java.util.Scanner;

public class EstructurasCondicionalesAnidadas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numPreguntasAcertadas;
		int numPreguntasFalladas;
		
		System.out.println("¿Cuántas preguntas has acertado?");
		numPreguntasAcertadas = teclado.nextInt();
		
		System.out.println("¿Cuántas preguntas has fallado?");
		numPreguntasFalladas = teclado.nextInt();
		
		if (numPreguntasAcertadas + numPreguntasFalladas >20) {
			System.out.println("Datos incorrectos");
		} else {
			double notaFinal = numPreguntasAcertadas / 2.0 - numPreguntasFalladas / 4.0;
			System.out.println("Nota final: " + notaFinal);
		}
		
	}

}