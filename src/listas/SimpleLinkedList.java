package listas;

// CLASE PADRE
public class SimpleLinkedList <E> {

	//CLASE INTERNA O CLASE HIJO DENTRO DE LA CLASE PADRE
		public static class Node<E>{
			private E element; //elemento que se gurada en el nodo
			private Node<E> next; //referencia al siguiente nodo
			//constructor
			
			public Node(E e, Node<E> n) {
				element = e;
				next = n;
			}
			
			//getters and setters o encapsulacion
			public E getElement() {
				return element;
			}
			public void setNext(Node<E> n) {
				next = n;
			}
			public Node<E> getNext(){
				return next;
			}
			
			
		}//fin clase interna
		
		//instanciar objetos y metodos de la clase simplelinkdlist
		
		//head o cabeza del nodo de la lista
		private Node<E> head = null;
		private Node<E> tail = null;
		
		//numero de nodos de la lista
		private int size = 0; //EDD Dinamica!!
		
		//constructor 
		public SimpleLinkedList() {

		}
		
		
		//metodos para la lista enlazada
		//tamaño
		
		public int size() {
			return size();
		}
		//si esta vacia
		public boolean isEmpty() {
			return size == 0;
		}
		//retornar el primer elemento
		public E first() {
			if(isEmpty()) return null;
			return head.getElement();
				
			
		}
		
		//retornar el ultimo elemento
		public E last() {
			if(isEmpty()) return null;
			return tail.getElement();
				
			
		}
		
		//agregar datos al inicio de la lista
		public void addFirst(E e) {
			head = new Node<>(e,head); //e = elemento y head = referencia
			if(size == 0)
				tail = head;
			size++;
			
		}
		// agregar datos al fin de la lista
		public void addLast(E e) {
			Node<E> newest = new Node<>(e,null);
			if(isEmpty())
				head = newest;
			else
			tail.setNext(newest);
			tail = newest;
			size++;
		}
		//remover
		public E removeFirst() {
			if(isEmpty()) return null;
			//n1--n2--n3
			E e1 = head.getElement(); //obtengo el valor del primer elemeto n1
			head = head.getNext(); //apunto o referencio al siguiente n2
			size --;
			if(size == 0)
				tail = null;
			return  e1;
		}
		
		//obtener
		public E  getElementObject (int index) {
			int c = 0;
			//n1--n2--n3
			Node<E> tmp = head; //me ubico en la cabeza = n1
			while(c < index ) {
				tmp = tmp.getNext();//recorre cada elemento de la lista
				c++;
			}
			return tmp.getElement();
		}
		
		//mostrar todos
		public void getAll() {
			Node <E> tmp = head; //me ubico en la cabeza de la lista
			//recorrer
			while(tmp != null) {
				System.out.println(tmp.getElement().toString());
				tmp = tmp.getNext();
			}
		}
		
		//promedio
		public double promedio() {
			@SuppressWarnings("unchecked")
			Node <Estudiante> tmp = (Node<Estudiante>) head; // Se usa Node tipo Estudiante
			double suma=0, promedio=0;
			//recorrer
			while(tmp != null) {
				suma += tmp.getElement().getEdad();
				tmp = tmp.getNext();
			}
			promedio=suma/size;
			return promedio;
		}
		
		//mayor
		public int obtenerMayor() {
			@SuppressWarnings("unchecked")
			Node<Estudiante> tmp = (Node<Estudiante>) head; // Se usa Node tipo Estudiante
			int mayor=0;
			while(tmp != null) {
				if(tmp.getElement().getEdad()>mayor) {
					mayor=tmp.getElement().getEdad();
				}
				tmp = tmp.getNext();
			}
			return mayor;
		}
		
		//mayores de 20 años
		public int mayores() {
			@SuppressWarnings("unchecked")
			Node<Estudiante> tmp = (Node<Estudiante>) head; // Se usa Node tipo Estudiante
			int cont=0;
			while(tmp != null) {
				if(tmp.getElement().getEdad()>20) {
					cont++;
				}
				tmp = tmp.getNext();
			}
			return cont;
		}
		
		//mostrar todos los estudiantes
		public void getAllEstudiantes() {
			@SuppressWarnings("unchecked")
			Node <Estudiante> tmp = (Node<Estudiante>) head; //me ubico en la cabeza de la lista
			//recorrer
			while(tmp != null) {
				System.out.println(tmp.getElement().mostrar());
				tmp = tmp.getNext();
			}
		}
} // FIN CLASE PADRE
