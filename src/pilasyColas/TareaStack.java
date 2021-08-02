package pilasyColas;

// Aplicaciones gen�ricas
// <E> significa que la clase, interface o metodo es generico
public interface TareaStack<E> {
	
	// Una interfaz es una clase donde se tiene declarado metodos
	// Que no est�n implementados pero pueden ser utilizados por el programa
	
	// Metodos 1
	
	// Tama�o de la pila
	public int size();
	
	// Si esta vacia
	boolean isEmpty();
	
	// Inserta datos a la pila
	public void push(E e);
	
	// Remover
	public E pop();
	
	// Obtener el ultimo elemento de la pila
	public E top();
	
}
