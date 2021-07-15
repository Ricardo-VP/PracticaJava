package poo;


public class Alumno extends Persona2{
	protected String curso;
	
	public Alumno(String cedula, String nombre, String fechaNacimiento, String curso) {
		super(cedula, nombre, fechaNacimiento);
		this.curso = curso;
	}
	
	// Metodo redefinido para imprimir datos
	public String datos() {
		return super.datos() + ", " + this.curso;
	}
	
	// Encapsulando
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
