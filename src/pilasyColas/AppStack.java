package pilasyColas;

import java.util.Arrays;

import pooEvaluacionSegundoParcial.Persona;

public class AppStack {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// repasen las listas enlazadas del libro de goodrich data structures and algorithms
		
				//ejemplo de una stack integer
				
				//implementar objeto  stack tipo integer
				Stack<Integer> s1 = new ArrayStack<>();
				s1.push(60);
				s1.push(90);
				s1.push(100);
				//leer la pila
				//estructura de iteracion while
				while(! s1.isEmpty()) //mientras no este vacia
					//otra forma while(s1.isEmpty() == false)
					
				{
					//codificacion
					System.out.println(s1.pop());
				}
				
				//object stack whit the java library
				@SuppressWarnings("rawtypes")
				java.util.Stack pila = new java.util.Stack();
				pila.push(65);
				pila.push(125);
				pila.push("stack de libreria java");
				
				//leer pila 
				while(pila.empty() == false) {
					System.out.println(pila.pop());
				}
				
				//stacl o pila con objetos por ejemplo persona
				
				Stack<Persona> pilaPersona = new ArrayStack<Persona>();
				//instansiar 3 objetos para luego ingresarlos a la pila
				Persona p1 = new Persona("0850594573","3A",35,"A");
				Persona p2 = new Persona("0821113152","1A",19,"B");
				Persona p3 = new Persona("0215161649","4A",54,"C");
				
				//afregar los objetos a la pila
				pilaPersona.push(p1);
				pilaPersona.push(p2);
				pilaPersona.push(p3);
				
				//mostrar datos
				while(!pilaPersona.isEmpty()) {
					System.out.println(pilaPersona.pop().datosCompletos());
				}
				
				// Ejemplo reverse a traves de una stack
				Integer[] a = {4, 8, 15, 16, 23, 42};
				String[] s = {"Jack", "Kate", "Hurley", "Jin", "Michael"};
				System.out.println("a = " + Arrays.toString(a));
				System.out.println("a = " + Arrays.toString(s));
				System.out.println("Reverse..");
				reverse(a);
				reverse(s);
				System.out.println("a = " + Arrays.toString(a));
				System.out.println("a = " + Arrays.toString(s));
			}
	// Funcion reverse utilizando una pila
	public static <E> void reverse(E [] a) {
		Stack<E> reverse = new ArrayStack<>(a.length);
		// Recorrer el array 
		for(int i = 0; i<a.length; i++) {
			reverse.push(a[i]);
			}
		// Leer el array
			for(int i = 0; i<a.length; i++) {
				a[i] = reverse.pop();	
			}
		
	}
}



