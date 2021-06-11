package pucese.edu.unidad1; // Ruta de la app

import java.util.Scanner;

public class PrimerPrograma {

	// Metodo que ejecuta la aplicaci�n de java
	public static void main(String[] args) {
		// Imprimir un mensaje de bienvenida
		System.out.println("Bienvenidos a la programaci�n en JAVA");
		
		// Utilizamos el metodo printf para mostrar datos con formato
		System.out.printf("%s\n %s\n %s %s", "Bienvenidos", "a la programaci�n en java", "es otra variable", "cuarta linea");
		
		// Entrada y salida de datos		
		Scanner input = new Scanner (System.in);
		
		// Enviar un mensaje de ingreso de datos
		System.out.println("\n Inserte el texto a continuaci�n");
		
		// Ingreso de datos
		String text = input.nextLine();
		
		// Imprimir el dato ingresado
		System.out.println(text);
		
		// Cerrar variable
		input.close();
		
	} // Fin del metodo main

} //Fin de la clase primerPrograma
