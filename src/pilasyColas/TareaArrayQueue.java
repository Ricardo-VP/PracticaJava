package pilasyColas;

public class TareaArrayQueue<E> implements TareaQueue<E> {
	// Variables
		private E[] data; // Datos que se guardan
		private int f=0; // Indice
		private int sz=0; // Numero de elementos
		public static final int CAPACITY = 1000;
		
		public TareaArrayQueue() {
			this(CAPACITY); // Tamaño por defecto
		}
		
		@SuppressWarnings("unchecked")
		public TareaArrayQueue(int capacity) {
			data = (E[]) new Object[capacity]; // tamaño declarado por el usuario 
		}

		@Override
		public int size() {
			return sz;
		}

		@Override
		public boolean isEmpty() {
			return (sz==0);
		}

		@Override
		public void enqueue(E e) {
			if(sz == data.length) throw new IllegalStateException("cola esta llena");
			int avail = (f + sz) % data.length;
			data[avail] = e;
			sz++;
		}
		
		
		// Retornar el primer valor
		public E first() {
			if(isEmpty()) return null;
			return data[f];
		}
		
		// Retornar el valor y remueve el elemento
		public E dequeue() {
			if(isEmpty()) return null;
			E res = data[f]; // Instancia un objeto en una variable res
			data[f] = null; // referencia el objeto al collector de garbage
			f=(f+1)%data.length; // Reobtengo el indice del tamaño
			sz--;
			return res;
		}
		
		
		
}
