package poo;

public class Racional {
	
	private int numerador;
	private int denominador;
	
	public Racional() {
		numerador = 0;
		denominador = 1;
	}
	
	// Metodos
	
	public int leerN() {
		return numerador;
	}
	
	public int leerD() {
		return denominador;
	}
	
	public void asignar(int a, int b) {
		this.numerador = a;
		this.denominador = b;
	}
}
