package poo;

public class Persona {
	
	protected String nombre;
	protected String apellido;
	
	// Constructor
	
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	// Metodos
	
	public String nombreCompleto() {
		return this.apellido + ", " + this.nombre;
	}
	
	public String identificacion() {
		return this.nombreCompleto();
	}
	
}
