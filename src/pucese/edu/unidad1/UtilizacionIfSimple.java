package pucese.edu.unidad1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UtilizacionIfSimple {

	public static void main(String[] args) {
		// A partir de la tarea entregada del alumno ver si aprueba o no
		
		byte nota = 0;
		String tareaEntregada = "";
		 
		BufferedReader bufferdReader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Introduzca una nota: ");
			nota = (byte)Integer.parseInt(bufferdReader.readLine()); //conversion de string a byte
			System.out.println("Se ha entragado la tarea? S/N: ");
			tareaEntregada = bufferdReader.readLine();
			
			// Condicion: 
			// si la nota es mayor a 5 y si fue entregada esta aprobada
			// sino no esta aprobado
			
			if(nota > 5 && (tareaEntregada.charAt(0) == 'S' ||
				tareaEntregada.charAt(0) == 's')){
				System.out.println("Está aprobado");
			}else {
				System.out.println("Reprobado");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		


	}

}
