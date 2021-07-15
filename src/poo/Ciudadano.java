package poo;

public class Ciudadano extends Persona{
	// Variable
	protected String documento;
	
	// Constructor
	public Ciudadano(String nombre, String apellido, String documento) {
		super(nombre, apellido);
		this.documento = documento;
	}
	
	// Metodo redefinido
	public String identificacion() {
		return super.identificacion() + ", documento: " + this.documento;
	}
}
