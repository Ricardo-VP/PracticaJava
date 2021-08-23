package pilasyColas;

import java.util.Iterator;
import java.util.LinkedList;

public class AppQueue {

	public static void main(String[] args) {
		// Para implementar una cola
		// 1. Array genérico
		// 2. Libreria linkedlist
		
		// Cola con LinkedList
		LinkedList<String> cola = new LinkedList<String>();
		// Agregar datos
		cola.add("juan");
		cola.add("pedro");
		cola.add("jose");
		
		cola.addFirst("ricardo");
		cola.addLast("enrique");
		
		// Agregar dato en la posicion 3
		//cola.add(3, "carlitos");
		
		// Remover
		cola.remove(3);
	
		
		// Obtener los datos que se desea dato de la posicion 1
		//Object datoObtenido = cola.get(1);
		//System.out.println("Dato posicion 1: " + datoObtenido);
		
		// Agregar datos sobre los datos iniciales
		cola.add(2, "cambio por jorge");
		
		// Mostrar datos
		// Collections --> arraylist linkedlist map hashtables
		// Iterator --> recorrer un objeto sin saber o conocer su tamaño (recorre objetos dinámicos)
		Iterator<String> iterator = cola.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// Cola con array genérico
		// Crear objeto
		//Queue<Integer> s = new ArrayQueue<>();
		//s.enqueue(8);
		//s.enqueue(9);
		//s.enqueue(10);
		
		//System.out.println(s.first());
	}

}
