package pucese.edu.unidad1;

public class AppWhile {

	public static void main(String[] args) {
		// Un bucle repetitivo para conocer si un numero es par o impar y sumarlos
		
		// Variables
		int contarPares = 0;
		int acumuladorPares = 0;
		int contadorImpares = 0;
		int acumuladorImpares = 0;
		
		int i = 1; // contador
		
		while(i<50) { // condicion
			// ejecuta el bloque de instruccion 
			// conocer si es par o impar a traves del comando mod = sobrante de la division 
			if(i%2==0) {
				contarPares++; // contando uno por uno
				acumuladorPares+= i; // sumando el valor de i a la variable
			}else {
				contadorImpares++;
				acumuladorImpares+=i;
			}
			// aumentar el contador del while
			i++;
		}
		System.out.println("Numero de pares contados: "+ contarPares);
		System.out.println("Suma de pares: " + acumuladorPares);
		System.out.println("Numero de impares contados: "+ contadorImpares);
		System.out.println("Suma de impares: " + acumuladorImpares);

	}

}
