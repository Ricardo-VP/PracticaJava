package pucese.edu.unidad1;

import java.util.Random;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// Ejemplos de operadores lógicos
		
		// Generar un número ramdomico
		Random aleatorio = new Random();
		
		// Asignando el valor aleatorio a la variable
		double i = aleatorio.nextInt() % 100;
		int j = aleatorio.nextInt() % 100;
		
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		// Mayor que
		System.out.println("i>j es: " + (i>j));
		System.out.println("i<j es: " + (i<j));
		// Mayor o igual que
		System.out.println("i>=j es: " + (i>=j));
		System.out.println("i<=j es: " + (i<=j));
		// Igual o no es igual
		System.out.println("i=j es: " + (i==j));
		System.out.println("i!=j es: " + (i!=j));
		// And
		System.out.println("i<10 && j<10 es: " + ((i<10)&&(j<10)));
		// Or
		System.out.println("i<10 || j<10 es: " + ((i<10)||(j<10)));
		
		// Conjunto de funciones para matematicas
		
		// Potencia
		System.out.println("Potencia: " + Math.pow(i, j));
		// Raiz cuadrada
		System.out.println("Raiz cuadrada: " + Math.sqrt(i));
		// Logaritmo
		System.out.println("Logaritmo decimal: " + Math.log10(i));
		// Valor absoluto
		System.out.println("Valor absoluto: " + Math.abs(i));
		// Redondeo 
		System.out.println("Redondeo al entero menor más proximo: " + Math.floor(i));
		// Maximo
		System.out.println("Maximo: " + Math.max(i,j));
		System.out.println("Minimo: " + Math.min(i,j));
		// Pi
		System.out.println("PI: " + Math.PI);
	}

}
