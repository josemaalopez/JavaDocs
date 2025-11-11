package OperadoresBasicos;

import java.util.Scanner;

public class CambioUnidades {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	double metros, decimetros, centimetros, milimetros, pulgadas, pies, yardas;
	
	System.out.println("Introduzca la longitud en metros que desea transformar: ");
	metros = teclado.nextDouble();
	
	
	decimetros = metros * 10;
    centimetros = metros * 100;
    milimetros = metros * 1000;
    pulgadas = metros * 100 / 2.54;
    pies = pulgadas / 12;
    yardas = pies / 3;
    

    System.out.println("RESULTADO");
    System.out.println("---------");
    System.out.println();
    System.out.println("SISTEMA INTERNACIONAL");
    System.out.println("---------------------");
    System.out.println("La medida " + metros + " en metros son:");
    System.out.println(decimetros + " decímetros");
    System.out.println(centimetros + " centímetros");
    System.out.println(milimetros + " milímetros");
	
	
	
	
	System.out.println("Resultado: \n");
	System.out.println("SISTEMA INTERNACIONAL");
	
	
	}

}