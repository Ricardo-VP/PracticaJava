package pucese.edu.unidad1;

import java.util.Scanner;

public class Tarea1RicardoVaca2 {

	public static void main(String[] args) {
		/* TAREA INDIVIDUDAL TIPOS DE DATOS PARTE 2
		 * REALIZAR LOS EJERCICIOS DEL 1 AL 23 SOBRE TYPES OF DATA
		*/
		
		// 6. Explain how to use Quadratic.java to find the square root of a number
		// R: Para encontrar la raiz cuadrada de c, se encuentran las raices de x^2 + 0x - c.
		
		
		/* 7:  A physics student gets unexpected results when using the code
		 * 	   double force = G * mass1 * mass2 / r * r; 
		 *     to compute values according to the formula F = Gm1m2 / r^2. Explain the problem and correct the code.
		 *  R: Primero se esta efectuando la division para r, en vez de dividirse para r*r, para esto hay que usar parentensis:
		 *  double force = G * mass1 * mass2 / (r * r);
		*/ 
		
		
		// 8 .Write a program that takes two integer command-line arguments x and y and prints 
		// the Euclidean distance from the point (x, y) to the origin (0, 0).
		
		// Se declara las coordenadas
        int x = 5;
        int y = 4;
        // Se calcula la distancia desde (0,0)
        double dist = Math.sqrt(x*x + y*y);
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
        
        
        // 9. Write a program SumOfTwoDice.java that prints the sum of two random integers between 1 and 6 (such as you might get when rolling dice).
        int lados = 6;
        int a = 1 + (int) (Math.random() * lados);
        int b = 1 + (int) (Math.random() * lados);
        int sum = a + b;
        System.out.println(sum);
        
        
        // 10. Write a program that takes a double command-line argument t (in degrees) and prints the value of sin(2t) + sin(3t).
        double grados = 12.59;
        double radianes = Math.toRadians(grados);
        double suma = Math.sin(2 * radianes) + Math.sin(3 * radianes);
        System.out.println(suma);
        
        
        // 11. Write a program  that takes two int values m and d from the command line and prints true 
        // if day d of month m is between March 20 (m = 3, d =20) and June 20 (m = 6, d = 20), false otherwise.
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese numero del mes: ");
        int mes = entrada.nextInt();
        System.out.println("Ingrese numero del día: ");
        int dia = entrada.nextInt();
        boolean esPrimavera =  (mes == 3 && dia >= 20 && dia <= 31) || (mes == 4 && dia >=  1 && dia <= 30) || (mes == 5 && dia >=  1 && dia <= 31)
                         || (mes == 6 && dia >=  1 && dia <= 20);
        
        System.out.println(esPrimavera);
        
        entrada.close();
	}

}
