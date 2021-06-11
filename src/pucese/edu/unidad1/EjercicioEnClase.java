package pucese.edu.unidad1;


import java.util.Scanner;

public class EjercicioEnClase {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		
		double gradosC;
		double gradosF;
		System.out.println("Ingrese los grados °C: ");
		gradosC = entrada.nextDouble();
		gradosF = ( (9*gradosC) / 5) + 32;
		
		System.out.println(gradosF + " F");
		System.out.println();
		
		
		// 2do ejercicio
		
		double radio;
		double longitudC;
		double areaC;
		
		System.out.println("Ingrese el valor del radio: ");
		radio = entrada.nextDouble();
		
		longitudC = 2*Math.PI*radio;
		areaC = (Math.PI)*Math.pow(radio, 2);
		
		System.out.printf("La longitud es igual a : %.2f", longitudC);
		System.out.println();
		System.out.printf("El area es igual a : %.2f" , areaC);

		
	}

}
