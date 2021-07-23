package pooEvaluacionSegundoParcial;

public class Alumno extends Persona{
	protected String materia;
	protected double nota1;
	protected double nota2;
	protected double nota3;
	protected double promedio;
	
	// Constructor de clase heredada
	
	public Alumno(String cedula, String nombre, int edad, String curso, String materia, double nota1, double nota2, double nota3) {
		super(cedula, nombre, edad, curso);
		this.materia = materia;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.promedio = calcPromedio(nota1,nota2,nota3);
	}
	
	public String datos() {
		return super.datosCompletos() + " |" + this.materia + " | Notas: " + this.nota1 + " ," + this.nota2 + " ," + this.nota3 + " | promedio: " + this.promedio;
	}
	
	// Metodo para calcular promedio
	
	public double calcPromedio(double nota1, double nota2, double nota3) {
		return (nota1+nota2+nota3)/3;
	}

	// Getters y setters
	
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getPromedio() {
		return promedio;
	}

	
	
}
