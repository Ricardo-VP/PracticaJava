package pucese.edu.unidad1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AppDoWhile {

	public static void main(String[] args) {
		/*
		 * formato
		 * do{
		 * 	instruccion
		 * }while(expresion a evaluar)
		 */
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String cadenaRepeticion, cadenaAConvertir;
		int numero;
		int contador = 0;
		int acumulador = 0;
		
		// trabajar con manejo de excepciones
		try {
			
			do {
				System.out.print("Introducir un numero: ");
				cadenaAConvertir = bufferedReader.readLine();
				numero = Integer.parseInt(cadenaAConvertir);
				contador++;
				acumulador+=numero;
				System.out.print("Introducir otro numero (S/N): ");
				cadenaRepeticion = bufferedReader.readLine();
			} while ((cadenaRepeticion.charAt(0) == 'S') || cadenaRepeticion.charAt(0) == 's' && ((contador+1) <=5));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
