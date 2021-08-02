package pilasyColas;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AppProducto {
	
	public static void main(String [] args) throws IOException {
		// Agregar los productos por teclado y luego insertar en una pila
		// Antes de insertarlos realizar una condición
		// Si el stock tiene cierta cantidad se muestra sino no
		
		Stack<Producto> proPila = new ArrayStack<Producto>(); // Declarada la pila
		// Variable del producto
		Producto pro;
		
		// Ingresar datos por teclado
		// BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Ingrese la cantidad de datos a ingresar:");
		int N = reader.nextInt();
		
		for(int i = 0; i<N; i++) {
			// Insertar los datos
			System.out.print("Insertar el producto, codigo y stock");
			pro = new Producto(reader.next(), reader.nextInt(), reader.nextInt());
			// Insertar los objetos pro a la pila
			proPila.push(pro);
		}
		
		while(!proPila.isEmpty()) {
			// Mostrar los datos de la pila
			pro = proPila.pop();
			int stock = pro.getStock();
			if(stock<10) {
				pro.mostrar();
			}else {
				System.out.println("Stock demasiado bajo");
			}
		}
	}
	
}
