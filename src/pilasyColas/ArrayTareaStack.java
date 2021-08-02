package pilasyColas;

public class ArrayTareaStack<E> implements TareaStack<E> {
		// Tamaño de la pila
		public static final int CAPACITY = 1000;
		
		// Declarar mi array genérico
		public E[] data;
		
		// Declarar el valor del indice de elementos de mi pila
		private int t=-1;
		
		// Constructor uno vacio y otro con los datos por defecto 1000
		public ArrayTareaStack() {
			this(CAPACITY);
		}
		
		@SuppressWarnings("unchecked")
		public ArrayTareaStack(int capacity) {
			data = ((E[]) new Object[capacity]);
		}

		@Override
		public int size() {
			return (t+1);
		}

		// Si está vacío
		@Override
		public boolean isEmpty() {
			return (t == -1);
		}

		// Insertar datos
		@Override
		public void push(E e) {
			//1. Verificar si tiene un tamaño
			if(size() == data.length) throw new IllegalStateException("La pila está llena");
			// Si no está llena agrego el dato
			data[++t]=e;
		}

		// Obtener el dato y se borra de la pila
		@Override
		public E pop() {
			if(isEmpty()) return null;
			// Crear objeto temporal y agregarle
			E obj = data[t];
			data[t] = null; // Borra el dato
			t--; // Disminuye el espacio
			return obj;
			
		}
		
		// Envia los datos sin borrarlos
		@Override
		public E top() {
			if(isEmpty()) return null;
			return data[t];
		}
}
