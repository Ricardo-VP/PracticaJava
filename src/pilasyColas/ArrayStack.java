package pilasyColas;

// Implementar ArrayStack generico <E>
public class ArrayStack<E> implements Stack<E> {
	
	// Tamaño de la pila
	public static final int CAPACITY = 1000;
	
	// Declarar mi array genérico
	public E[] data;
	
	// Declarar el valor del indice de elementos de mi pila
	private int t=-1;
	
	// Constructor uno vacio y otro con los datos por defecto 1000
	public ArrayStack() {
		this(CAPACITY);
	}
	
	@SuppressWarnings("unchecked")
	public ArrayStack(int capacity) {
		data = ((E[]) new Object[capacity]);
	}

	@Override
	public int size() {
		return (t+1);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void push(E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E top() {
		// TODO Auto-generated method stub
		return null;
	}

}
