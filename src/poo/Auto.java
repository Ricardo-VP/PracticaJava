package poo;

public class Auto {

	// Propiedades = variables = caracteristicas
	// Cientos de variables
	
	public int ruedas;
	private int ancho;
	protected int peso;
	
	// Constructor
	// Es un metodo especial para inicializar objetos o variables 
	
	public Auto() {
		ruedas = 4;
		ancho = 5;
		peso = 2000;
	}
	
	// Comportamientos = metodos, procedimientos o funciones
	// Puedo crear muchos metodos
	
	public void imprimir() {
		System.out.println("ruedad : " + ruedas + " ancho : " + ancho + " peso: " + peso);
	}
	
}
