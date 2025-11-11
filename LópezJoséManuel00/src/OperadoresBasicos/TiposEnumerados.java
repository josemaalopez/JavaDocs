package OperadoresBasicos;

public class TiposEnumerados {
    
    public static void main(String[] args) {
    	enum Estacion {PRIMAVERA, VERANO, OTOÑO, INVIERNO};
    	Estacion estacionActual = Estacion.OTOÑO;
        Estacion estacionSiguiente = Estacion.INVIERNO;
        
        System.out.println("Estamos en " + estacionActual);
        System.out.print("y luego estaremos en " + estacionSiguiente);        
    } 
} 
