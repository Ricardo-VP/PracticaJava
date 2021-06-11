package pucese.edu.unidad1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Funciones {

	public static void main(String[] args) {
		/*
		 * SINTAXIS FUNCIONES
		 * TIPO_FUNCION (VOID) NOMBRE_FUNCION (TIPO Y NOMBRE DE ARGUMENTOS)
		 * {
		 * SENTENCIAS
		 * }
		 */
		
		// Suma (funcion) y con ingreso de datos (funcion) desde consola
		
		System.out.println("Suma: " + suma(15, 20));
		
		// Ingreso de datos
		
		String texto = leerTexto("Introduce un mensaje: ");
		System.out.println("texto 1: " + texto);
		String texto2 = leerTexto("Introduce un mensaje 2: ");
		System.out.println("texto 2: " + texto2);
	}
	
	public static int suma(int a,int b) {
		return a + b;
	}
	
	public static String leerTexto(String mensaje) {
		String texto;
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.print(mensaje);
			texto = in.readLine();
		} catch (Exception e) {
			texto = "error";
		}
		return texto;
	}

}
