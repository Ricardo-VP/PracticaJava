package pooEvaluacionSegundoParcial;

public class Persona {
	protected String cedula;
	protected String nombre;
	protected int edad;
	protected String curso;
	
	// Constructor
	
	public Persona(String cedula, String nombre, int edad, String curso) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.edad = edad;
		this.curso = curso;
	}
	
	// Metodo
	
	public String datosCompletos() {
		return this.cedula + " |" + this.nombre + " |" + this.edad + " |" + this.curso;
	}
	
	// Getters y setters

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

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
