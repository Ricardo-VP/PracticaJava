package recursion;

public class Recursividad {

	public static void main(String[] args) {
		// factorial

		System.out.println(factorial(6));
		
		// potencia
		
		System.out.println(potencia(5,2));
		
		// suma de elementos de un array
		int [] data = {4,3,6,2,8};
		System.out.println(linearSuma(data,5));
	}
	
	// Funcion recursiva
	
	public static int factorial(int n) throws IllegalArgumentException {
		if (n < 0) {
			throw new IllegalArgumentException(); // Argumento no negativo
		}else if(n == 0){
			return 1; // caso base
		}else {
			return n * factorial(n-1); // caso recursivo
		}
	}
	
	// Funcion recursiva de potencia
	
	public static double potencia(double x, int c) {
		if(c == 0) {
			return 1; // caso base
		}else {
			return x * potencia(x,c-1); // caso recursivo
		}
	}
	
	// Funcion recursiva suma de arrays
	
	public static int linearSuma(int [] data, int n) {
		if(n == 0) {
			return 0;
		}else {
			return linearSuma(data, n-1) + data[n-1];
		}
	}
	
}
