package poo;

public class Vehiculo {
	// Variables
	public int velocidad;
	public int ruedas;
	
	// Metodos
	public void parar() {
		velocidad = 0;
	}
	
	public void acelerar(int km) {
		velocidad+= km; 
	}
	
}
