package pilasyColas;

public class Producto {
	private String nombre;
	private int codigo;
	private int stock; 
	
	
	//constructor
	Producto(String n, int c, int s){
		nombre = n;
		codigo = c;
		stock = s;
	}
	
	//metodo para enviar el stock
	int getStock() {
		return stock;
	}
	//mostrar los datos
	void mostrar() {
		System.out.println(nombre + ", " + codigo + ", " + stock);
	}
}
