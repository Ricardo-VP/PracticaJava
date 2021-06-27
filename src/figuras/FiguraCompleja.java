package figuras;

public class FiguraCompleja {
	public static final int Max_value = 4;
	public static final int Max_valuef = 16;
	public static void main(String[] args) {
		// 4 fors
		// Metodos estaticos
		
		figuraSuperior();
		figura();
		figuraDos();
		figuraSuperior();

	}
	
	// Figura 
	public static void figura() {
		for (int line = 1; line <= Max_value; line++) {
			// Imprmir los lados | 
			System.out.print("|");
			// Espacios en blanco
			for(int space = 1; space<=(line*-2+8); space++) {
				System.out.print(" ");
			}
			// Imprimir los <>
			System.out.print("<>");
			// Imprimir los puntos .
			for(int dot = 1; dot<=line*4-4; dot++) {
				System.out.print(".");
			}
			// Imprimir los <>
			System.out.print("<>");
			// Imprimir los espacios en blanco
			for(int space = 1; space<=(line*-2+8); space++) {
				System.out.print(" ");
			}
			System.out.println("|");
		}
	}
	
	public static void figuraDos() {
		for (int line = Max_value; line >= 1; line--) {
			// Imprmir los lados | 
			System.out.print("|");
			// Espacios en blanco
			for(int space = 1; space<=(line*-2+8); space++) {
				System.out.print(" ");
			}
			// Imprimir los <>
			System.out.print("<>");
			// Imprimir los puntos .
			for(int dot = 1; dot<=line*4-4; dot++) {
				System.out.print(".");
			}
			// Imprimir los <>
			System.out.print("<>");
			// Imprimir los espacios en blanco
			for(int space = 1; space<=(line*-2+8); space++) {
				System.out.print(" ");
			}
			System.out.println("|");
		}
	}
	
	// Parte superior
	public static void figuraSuperior() {
		System.out.print("#");
		for(int i = 1; i<=Max_valuef; i++) {
			System.out.print("=");
		}
		System.out.println("#");
	}
}
