package pilasyColas;

import java.util.Scanner;

public class TareaAppStack {
	public final static int n = 7;
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		ArrayTareaStack<Integer> pila1 = new ArrayTareaStack<Integer>();
		
		// Llenando la pila 1
		System.out.println("Llene la pila 1");
		for(int i = 1; i<=n; i++) {
			System.out.print("Elemento(pila1) " + i + ":");
			int num = read.nextInt();
			pila1.push(num);
		}
		
		// Llenando la pila 2
		ArrayTareaStack<Integer> pila2 = new ArrayTareaStack<Integer>();
		System.out.println("Llene la pila 2");
		for(int i = 1; i<=n; i++) {
			System.out.print("Elemento(pila2) " + i + ":");
			int num = read.nextInt();
			pila2.push(num);
		}
		read.close();
		
		// Recorriendo la pila 1 y llenando un array con los valores de la pila1
		int arr[] = new int[7];
		int i = 0;
		while(pila1.isEmpty() == false) {
			int a = pila1.pop();
			arr[i] = a;		
			i++;
		}
		
		// Recorriendo la pila 2 y comparando si existe un valor de la pila igual a un valor del array
		while(pila2.isEmpty() == false) {
			int b = pila2.pop();
			for(int j = 0; j<arr.length; j++) {
				if(b == arr[j]) {
					System.out.println("El número " + b + " se encuentra en las dos pilas");
				}
			}
		}
		
	}
}
