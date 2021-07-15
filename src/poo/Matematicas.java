package poo;

public class Matematicas {
	// Primer metodo
	public double suma(double x, double y) {
		return x+y;
	}
	
	public double suma(double x, double y, double z) {
		return x+y+z;
	}
	
	public double suma(double [] array) {
		double total = 0;
		for(int i = 0; i<array.length; i++) {
			total+=array[i];
		}
		return total;
	}
}
