package figuras;

import java.util.Scanner;

public class tareaFigurasComplejas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int res, respuesta;
		do {
		System.out.println("¿Que figura desea visualizar?");
		System.out.println("1 | 2 | 3 | 4 | 5");
		res = entrada.nextInt();
		switch(res) {
			case 1:
				// Figura 1
				figura1();
				break;
			case 2:
				// Figura 2
				figura2();
				break;
			case 3:
				// Figura 3 
				figura3();
				break;
			case 4:
				// Figura 4
				figura4();
				break;
			case 5:
				// Figura 5
				figura5();
				break;
			default:
				System.out.println("Numero incorrecto");
		}
		System.out.println("¿Desea volver? 1. Si | 2. No");
		respuesta = entrada.nextInt();
		}while(respuesta==1);
	}
	
	// FIGURA 1 - funciones
	public static void iguales() {
		for(int i = 1; i<=4; i++) {
			System.out.print("=");
		}
		System.out.print("+");
		for(int i = 1; i<=4; i++) {
			System.out.print("=");
		}
		System.out.println("");
	}
	public static void mitad() {
		for(int i = 1; i<=3; i++) {
			System.out.print("#");
			for(int j = 1; j<=3; j++) {
				System.out.print(" ");
			}
			System.out.print("|");
			for(int j = 1; j<=3; j++) {
				System.out.print(" ");
			}
			System.out.print("#");
			System.out.println("");
		}
	}
	
	public static void figura1() {
		iguales();
		mitad();
		iguales();
		mitad();
		iguales();
	}
	
	// Figura 2
	
	public static void figura2() {
		for(int i = 1; i<=6; i++) {
			for(int k = 1; k<=5; k++) {
				System.out.print("*");
			}
			for(int j = 1; j<=i*3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// Figura 3
	public static void figura3() {
		for(int i = 0; i<=8; i++) {
			for(int j = 1; j<= i+1; j++) {
				System.out.print("*");
			}
			for(int k = 1; k<= i*-2+16; k++) {
					System.out.print(" ");
			}
			for(int j = 1; j<= i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// Figura 4
	public static void figura4() {
		for(int i = 0; i<=3; i++) {
			for(int k = 1; k<= i*2; k++) {
				System.out.print("\\");
			}
			for(int j = i; j<=i*-1+6; j++) {
				System.out.print("!");
			}
			for(int j = i; j<=i*-1+6; j++) {
				System.out.print("!");
			}
			for(int k = 1; k<= i*2; k++) {
				System.out.print("/");
			}
			System.out.println();
		}
	}
	
	// Figura 5
	public static void figura5() {
		for(int i = 0; i<=6; i++) {
			for(int k = 1; k<= i*2; k++) {
				System.out.print("\\");
			}
			for(int j = i; j<=i*-1+12; j++) {
				System.out.print("!");
			}
			for(int j = i; j<=i*-1+12; j++) {
				System.out.print("!");
			}
			for(int k = 1; k<= i*2; k++) {
				System.out.print("/");
			}
			System.out.println();
		}
	}
	

}
