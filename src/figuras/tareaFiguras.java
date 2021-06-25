package figuras;

import java.util.Scanner;

public class tareaFiguras {

	public static void main(String[] args) {
		
		int res, respuesta;
		Scanner entrada = new Scanner(System.in);
		do {
	       
			System.out.println("Elige que figura desea visualizar");
			System.out.println("1. Triangulo | 2. Rectangulo | 3. Cuadrado solo bordes | 4. Rectangulo solo bordes | 5. Triangulo solo bordes");
			res = entrada.nextInt();
			switch(res) {
				case 1:
					triangulo();
					break;
				case 2:
					rectangulo();
					break;
				case 3:
					cuadradoBordes();
					break;
				case 4:
					rectanguloBordes();
					break;
				case 5:
					trianguloBordes();
					break;
				default:
					System.out.println("El número ingresado es incorrecto");
					}
			System.out.println("Volver? 1. SI | 2. NO");
			respuesta = entrada.nextInt();
		}while(respuesta==1);
		
		}
	public static void triangulo() {
		// TRIANGULO
		for (int i = 1; i<=6; i++) {
			for (int j =1; j<=6-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void rectangulo() {
		// RECTANGULO
		for(int j = 1;j<=5;j++) {
			for (int i = 1; i<=20; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void cuadradoBordes() {
		// Un cuadrado solo los bordes
				//Linea superior
		 	for(int i = 0; i < 12; i++) {
		            System.out.print("*");
		        }
		        System.out.println();
		        //Parte del medio
				for(int j = 1;j<=4;j++) {
					System.out.print("*");
					for (int i = 1; i<=10; i++) {
						System.out.print(" ");
					}
					System.out.print("*");
					System.out.println();
				}
					//Linea inferior
				for(int j = 0; j < 12; j++) {
		            System.out.print("*");
		        }
				System.out.println();
	}
	
	public static void rectanguloBordes() {
		// Un rectangulo solo bordes
					// Linea superior
				for(int i = 0; i < 18; i++) {
		            System.out.print("*");
		        }
		        System.out.println();
		        	// Parte del medio
				for(int j = 1;j<=4;j++) {
					System.out.print("*");
					for (int i = 1; i<=16; i++) {
						System.out.print(" ");
					}
					System.out.print("*");
					System.out.println();
				}
					// Linea inferior
				for(int j = 0; j < 18; j++) {
		            System.out.print("*");
		        }
				System.out.println();
	}
	
	public static void trianguloBordes() {
		// Un triangulo solo bordes
				for (int x = 1; x<=5; x++) {
					System.out.print(" ");
				}
				System.out.print(" *");
				System.out.println();
				for (int i = 2; i<=6; i++) {
				for (int j =0; j<=6-i; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for (int k = 4; k<=i+1; k++) {
					System.out.print("  ");
				}
				System.out.print(" *");
				System.out.println();
				}
				
				for(int x = 1; x<=13; x++) {
					System.out.print("*");
				}
				System.out.println();
	}

}
	
