package pucese.edu.unidad1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int n1, n2;
		System.out.println("Ingrese a: ");
		n1 = entrada.nextInt();
		System.out.println("Ingrese n: ");
		n2 = entrada.nextInt();
		System.out.println(mod(n1,n2));
		entrada.close();
	}
	
	public static int mod(int a, int n) {
			int res = (int)Math.round(a%n);
			return res;
	}

}
