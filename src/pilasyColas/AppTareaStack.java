package pilasyColas;

import java.util.Scanner;

public class AppTareaStack {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int respuesta;
		System.out.println("Eliga el programa: ");
		System.out.println("1. Programa que permite insertar 5 palabras por teclado en una pila y posteriormente visualiza los mismos");
		System.out.println("2. Programa que permite insertar N números enteros por teclado en una pila y posteriormente visualiza los mismos");
		System.out.println("3. Programa que permite insertar N carácteres por teclado en una pila y posteriormente visualiza los mismos");
		respuesta = entrada.nextInt();
		switch(respuesta) {
			case 1:
				programa1();
				break;
			case 2:
				programa2();
				break;
			case 3:
				programa3();
				break;
			default: 
				System.out.println("Número ingresado incorrecto");
		}
		entrada.close();
	}
	
	public static void programa1() {
		Scanner entrada = new Scanner(System.in);
		String palabra;
		ArrayTareaStack<String> pila = new ArrayTareaStack<String>();
		for(int i = 1; i <= 5; i++) {
			System.out.println("String " + i + ":");
			palabra = entrada.nextLine();
			pila.push(palabra);
		}
		while(!pila.isEmpty()) {
			System.out.println(pila.pop());
		}
		entrada.close();
	}
	
	public static void programa2() {
		int n, numero;
		Scanner entrada = new Scanner(System.in);
		ArrayTareaStack<Integer> pila = new ArrayTareaStack<Integer>();
		System.out.println("Cuantos numeros desea ingresar?");
		n = entrada.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("Número " + i + ":");
			numero = entrada.nextInt();
			pila.push(numero);
		}
		while(!pila.isEmpty()) {
			System.out.println(pila.pop());
		}
		entrada.close();
	}
	
	public static void programa3() {
		int n;
		char caracter;
		Scanner entrada = new Scanner(System.in);
		ArrayTareaStack<Character> pila = new ArrayTareaStack<Character>();
		System.out.println("Cuantos caracteres desea ingresar?");
		n = entrada.nextInt();
		System.out.println("**SOLO SE GUARDARÁ 1 CARACTER**");
		for(int i = 1; i <= n; i++) {
			System.out.println("Caracter " + i + ":");
			caracter = entrada.next().charAt(0);
			pila.push(caracter);
		}
		while(!pila.isEmpty()) {
			System.out.println(pila.pop());
		}
		entrada.close();
	}

}
