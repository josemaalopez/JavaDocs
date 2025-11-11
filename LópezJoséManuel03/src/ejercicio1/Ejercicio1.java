/*
 * Descripción: Práctica 3 - Ejercicio 1
 * Autor:José Manuel López Montesinos
 * Fecha: 26/09/25
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		String apellidos;
		int fechaNacimiento;
		double salarioBruto;
		int anyosEmpresa;
		
		System.out.println("Dime tu nombre: ");
		nombre = teclado.nextLine();
		
		System.out.println("Dime tus apellidos: ");
		apellidos = teclado.nextLine();
		
		System.out.println("Dime tu fecha de nacimiento: ");
		fechaNacimiento = teclado.nextInt();
		
		System.out.println("Dime tu salario bruto (se permiten decimales): ");
		salarioBruto = teclado.nextDouble();
		
		System.out.println("Dime cuántos años llevas en la empresa: ");
		anyosEmpresa = teclado.nextInt();
		
		double IRPF = 0.15;
        double retencionIRPF = salarioBruto * IRPF;
        double salarioNeto = salarioBruto - retencionIRPF;
        
        double porcentajeIncremento = anyosEmpresa * 0.02;
        double aumentoSalario = salarioBruto * porcentajeIncremento;
        double salarioTotal = salarioBruto + aumentoSalario;
        
        
        System.out.println("Estimad@ " + nombre + " " + apellidos + ", su salario es " + salarioBruto + "€, teniendo en cuenta un IRPF del 15% su salario neto sería " + salarioNeto + "€.");
        System.out.println("Debido a sus " + anyosEmpresa + " años trabajando en la empresa su salario se incrementará en un 2% por cada año. El aumento es de " + aumentoSalario + "€ y el salario total es " + salarioTotal + "€");


	}

}
