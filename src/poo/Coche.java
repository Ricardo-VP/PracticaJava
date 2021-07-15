package poo;

public class Coche extends Vehiculo{
	
	// Variables
	public int ruedas = 4; // Redefinición
	public int gasolina; // propiedad solo del coche
	
	// Constructor
	public Coche(int padre, int gasolina) {
		super(); // Cargue a la clase hijo la herencia
		this.gasolina = gasolina;
	}
	
	// Metodo de coche
	public void tanquear(int litros) {
		gasolina+=litros;
	}
	
	// Encapsular las variables
	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public int getGasolina() {
		return gasolina;
	}

	public void setGasolina(int gasolina) {
		this.gasolina = gasolina;
	}
	

	
}
