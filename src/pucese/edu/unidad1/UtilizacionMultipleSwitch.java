package pucese.edu.unidad1;

public class UtilizacionMultipleSwitch {

	public static void main(String[] args) {
		// Switch se utiliza cuando existan varias condiciones 
		// u opciones para una condicion
		
		// Ejercicio
		// Seleccionar un día de la semana de acuerdo a un número
		
		char diaSemana = '4'; // Declaramos variable para dia de la semana
		
		switch(diaSemana) {
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miercoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sabado");
				break;
			case 7:
				System.out.println("Domingo");
				break;			
				
		}
	}

}
