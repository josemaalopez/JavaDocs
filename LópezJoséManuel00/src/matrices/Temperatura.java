/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Temperatura
*/
package matrices;

public class Temperatura {

	public static void main(String[] args) {
		final int TOTAL_MESES = 12;
		final int TOTAL_DIAS = 30;
		
		int tempMaxima = 0;
		
		int diaMasCalor = 0, tempMasAlta, diaTemp10;
		int[][] temperatura; // Declaración de un array bidimensional
		temperatura = new int[TOTAL_MESES][TOTAL_DIAS];

		for (int mes = 0; mes < temperatura.length; mes++) {		// Inicialización
			for (int dia = 0; dia < temperatura[mes].length; dia = dia + 1) {
				temperatura[mes][dia] = (int) (Math.random() * 40);
			}
		}
		
		for (int mes = 0; mes<temperatura.length; mes++) {
			for (int dia = 0; dia < temperatura[mes].length; dia = dia + 1) {
				System.out.print(temperatura[mes][dia] + "\t");
			}
			System.out.println();
		}
		
		for ( int mes = 0; mes < temperatura.length; mes++) {
				tempMasAlta = temperatura[mes][0]; // Cada mes inicializo la temperatura más alta a la temperatura del primer día
				for (int dia = 0; dia < temperatura[mes].length; dia = dia + 1) { // Empiezo a comparar temperaturas a partir del segundo día
				if (tempMasAlta < temperatura[mes][dia]) {
					tempMasAlta = temperatura[mes][dia];
					diaMasCalor = dia;
			}
		}
				System.out.println("El día " + diaMasCalor + " hubo " + tempMasAlta);
	}
			// Para cada mes, mostrar el primer día con temperatura < 10 grados
		for (int mes = 0; mes < temperatura.length; mes++) {
			diaTemp10 = 0;
			do {
				diaTemp10++;
			} while (temperatura[mes][diaTemp10]>10);
			System.out.println("Para el mes " + (mes + 1) + " el primer día con menos de 10 grados es: " + (diaTemp10 + 1)); 
			// Agregamos "+1" despues de cada variable para que empiece en el 1 y no en el 0 (tanto a contar el mes como el día)
		
			}
		}
}
