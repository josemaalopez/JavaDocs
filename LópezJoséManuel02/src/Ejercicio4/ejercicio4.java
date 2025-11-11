package Ejercicio4;

public class ejercicio4 {

	public static void main(String[] args) {
		enum Talla {PEQUEÑA, MEDIANA, GRANDE, EXTRAGRANDE}
		    
		Talla talla1 = Talla.PEQUEÑA;
		Talla talla2 = Talla.MEDIANA;
		Talla talla3 = Talla.GRANDE;
		Talla talla4 = Talla.EXTRAGRANDE;

		System.out.println("Talla 1: " + talla1 + ". Esta es una talla pequeña");
		System.out.println("Talla 2: " + talla2 + ". Esta es una talla mediana");
		System.out.println("Talla 3: " + talla3 + ". Esta es una talla grande");  
		System.out.println("Talla 4: " + talla4 + ". Esta es una talla extragrande");
		
	}

}
