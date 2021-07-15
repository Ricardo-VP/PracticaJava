package poo;

public class AppHerencia {
	public static void main(String [] args) {
		// Instanciar objeto
		Coche coche = new Coche(3,15);
		
		coche.acelerar(80); // Metodo heradado de la superclase
		coche.tanquear(60); // Metodo heredado de la subclase
		
		coche.setRuedas(9); // Agregar un nuevo valor 
		System.out.println(coche.getRuedas());
	}
}
