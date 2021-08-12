package listas;

public class Estudiante {
	private String cedula;
	private String nombre;
	private int edad;
	
	// Constructor
	public Estudiante(String cedula, String nombre, int edad) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String mostrar() {
		return this.cedula + " | " + this.nombre + " | " + this.edad;
	}
	
	// Getters and setters

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
