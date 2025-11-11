/* 
* Nombre: José Manuel López Montesinos 
* Curso: 1º DAW
* Descripción: Un supermercado quiere premiar a los clientes que mayor desembolso hacen en sus tiendas.
Para ello lleva un control de las compras que realiza cada cliente. Si éstas superan en total la
cantidad de 300 euros en un mes se les entrega un vale descuento de 50 euros.
*/
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nombre, apellidos;
		double importe1, importe2, importe3, importe4;
		
		System.out.println("Dime tu nombre: ");
		nombre = teclado.nextLine();
		
		System.out.println("Dime tus apellidos: ");
		apellidos = teclado.nextLine();
		
		System.out.println("Importe gastado en la primera compra: ");
		importe1 = teclado.nextDouble();
		
		System.out.println("Importe gastado en la segunda compra: ");
		importe2 = teclado.nextDouble();
		
		System.out.println("Importe gastado en la tercera compra: ");
		importe3 = teclado.nextDouble();
		
		System.out.println("Importe gastado en la cuarta compra: ");
		importe4 = teclado.nextDouble();
		
		double sumaImportes;
		sumaImportes = importe1 + importe2 + importe3 + importe4;
		
		double mediaImporte;
		mediaImporte = (importe1 + importe2 + importe3 + importe4 / 4);
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Importe gastado 1: " + importe1);
		System.out.println("Importe gastado 2: " + importe2);
		System.out.println("Importe gastado 3: " + importe3);
		System.out.println("Importe gastado 4: " + importe4);
		System.out.println("Importe medio: " + mediaImporte);
		
		if (sumaImportes >= 300) {
			System.out.println("Sus compras de este mes han alcanzado los 300 euros. Por su fidelidad con la empresa, dispone de un bono de 50 euros canjeable en su próxima compra.");
		} else {
			System.out.println("Lo sentimos pero sus compras no han alcanzado los 300 euros este mes, no dispone de ningún descuento.");
		}
		
	}

}
