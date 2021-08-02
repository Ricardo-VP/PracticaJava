package pilasyColas;

public interface TareaQueue<E> {
	// Tama�o
	int size();
		
	// Si esta vacia
	boolean isEmpty();
		
	// Insertar elemento
	void enqueue(E e);
		
	// Retorne el primer valor
	E first();
		
	// Remover la queue
	E dequeue();
}
