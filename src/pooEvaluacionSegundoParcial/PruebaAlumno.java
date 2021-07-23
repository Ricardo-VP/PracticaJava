package pooEvaluacionSegundoParcial;

public class PruebaAlumno {

	public static void main(String[] args) {
		// 3 Objetos tipo alumno en una matriz
		Alumno a = new Alumno("012345", "Alumno1", 19, "Curso A", "Matematicas", 10.0, 10.0, 10.0);
		Alumno b = new Alumno("0123456", "Alumno2", 18, "Curso B", "Programacion", 9.0, 8.0, 9.0);
		Alumno c = new Alumno("01234567", "Alumno3", 20, "Curso C", "Fisica", 8.0, 8.0, 8.0);
		Alumno arrayAlumnos[] = new Alumno[3];
		arrayAlumnos[0] = a;
		arrayAlumnos[1] = b;
		arrayAlumnos[2] = c;
		lectorArrayAlumnos(arrayAlumnos);
	}
	public static void lectorArrayAlumnos(Alumno [] array) {
		for(int i = 0; i<array.length;i++) {
			System.out.println("Datos: " + array[i].datos());
		}
	}

}
