package arrays;

import java.util.Scanner;

public class ArraysEvaluacionSegundoParcial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int filas = 5;
		int columnas = 5;
		double[][] A = new double[filas][columnas]; //Se crea una matriz de 5 filas y 5 columnas
		double suma = 0;

        //Se introducen por teclado los valores de la matriz
        System.out.println("Lectura de elementos de la matriz: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("A[" + i + "][" + j + "]= ");
                A[i][j] = sc.nextDouble();
            }
        }

        //Mostrar por pantalla los valores que contiene la matriz
        System.out.println("valores introducidos:");
        System.out.println("        0	 1	 2	 3	 4	    Suma");
        for (int i = 0; i < A.length; i++) { 
        	System.out.print(i);
        	System.out.print("  [");
        	suma = 0;
            for (int j = 0; j < A[i].length; j++) {
            	System.out.print("	");
            	if(A[i][j]>=0) {
            		System.out.print("+");
            	}
                System.out.print(A[i][j]);
                suma= suma + A[i][j];
            }
            System.out.print("]	 ");
            System.out.print("-> "+suma);
            System.out.println();
        }
        
        sc.close();

	}

}
