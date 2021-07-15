package poo;

public class AppPolimorfismo {

	public static void main(String[] args) {
		// Instanciar un objeto
		Matematicas m = new Matematicas();
		System.out.println(m.suma(2,1));
		System.out.println(m.suma(2,1,6));
		
		double [] array = new double[4];
		array[0] = 55.6;
		array[1] = 45.6;
		array[2] = 65.2;
		array[3] = 85.6;
		
		System.out.println(m.suma(array));

	}

}
