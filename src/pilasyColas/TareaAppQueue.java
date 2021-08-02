package pilasyColas;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class TareaAppQueue {

	public static void main(String[] args) {
		// Cola con LinkedList
		LinkedList<Integer> cola = new LinkedList<Integer>();
		// Agregando datos a la cola
		cola.add(1);
		cola.add(2);
		cola.add(3);
		cola.add(4);
		cola.add(5);
		cola.add(5);
		cola.add(3);
		max(cola);
		min(cola);
		duplicated(cola);
		sum(cola);
		sumPairs(cola);
	}
	
	// Funcion para mostrar el mayor elemento de una cola
	public static void max(LinkedList<Integer> cola) {
		// Mostrar el elemento mayor de la cola
		System.out.println("Valor máximo de la cola: " + Collections.max(cola));
	}
	
	// Funcion para mostrar el menor elemento de una cola
	public static void min(LinkedList<Integer> cola) {
		// Mostrar el elemento menor de la cola
		System.out.println("Valor mínimo de la cola: " + Collections.min(cola));
	}
	
	@SuppressWarnings("unchecked")
	public static void duplicated(LinkedList<Integer> cola) {
		@SuppressWarnings("rawtypes")
		HashSet unique=new HashSet();
		System.out.print("Valores repetidos: ");
		 for (Integer s:cola){
			// java.util.Set only unique object so if object will not bee add in Set it will return false so can consider it as Duplicate
	         if(!unique.add(s)){   
	             System.out.print(s + " ");
	         }
	     }
		 System.out.println();
	}
	
	// Funcion para sumar los elementos pares de una cola
	public static void sumPairs(LinkedList<Integer> cola) {
		int sum = 0;
		for(Integer s: cola) {
			if(s%2==0) {
				sum+=s;
			}
		}
		System.out.println("La suma de los valores pares de la cola es: " + sum);
	}
	
	// Funcion para sumar los elementos de una cola
		public static void sum(LinkedList<Integer> cola) {
			int sum = 0;
			for(Integer s: cola) {
					sum+=s;
			}
			System.out.println("La suma de los valores de la cola es: " + sum);
		}
}
