package poo;

public class AppHerencia3 {

	public static void main(String[] args) {
		// Objeto 1 
		Persona2 p = new Persona2("012345", "A", "23-02-2002");	
		//System.out.println(p.calcularEdad(p.fechaNacimiento));
		System.out.println(p.datos());
		// Objeto 2
		Alumno a = new Alumno("014265", "B", "23-02-2003","Curso 1");
		//System.out.println(a.calcularEdad(a.fechaNacimiento));
		System.out.println(a.datos());
	}

}
