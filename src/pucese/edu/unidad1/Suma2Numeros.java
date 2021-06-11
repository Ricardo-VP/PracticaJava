package pucese.edu.unidad1;

import java.util.Scanner;

public class Suma2Numeros {

	public static void main(String[] args) {
		// Sumar dos números
		
		// Objeto para ingreso de datos
		Scanner entrada = new Scanner (System.in);
		
		// Variables
		int n1;
		int n2;
		int suma;
		
		/*
		 
		
		// Pedir los datos n1
		System.out.println("Ingrese el n1: ");
		// Leer datos n1
		n1 = entrada.nextInt();
		// Pedir los datos n2
		System.out.println("Ingrese el n2: ");
		// Leer datos n2
		n2 = entrada.nextInt();
		
		// Procesar los datos
		suma = n1 + n2;
		
		// Imprimir la suma
		System.out.printf("La suma es: %d \n", suma);
		 */
		
		// Formatos
		double n11 = 1.23036;
		
		// Imprimir la variable n11 con formato
		System.out.printf("%.3f", n11);
		System.out.println(); // Salto de linea
		
		// Imprimir la variable n11 con 3 decimales y un signo en positivo
		System.out.printf("%+.3f", n11);
		

	}

}
