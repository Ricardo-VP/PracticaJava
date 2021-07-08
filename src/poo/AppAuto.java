package poo;

public class AppAuto {

	public static void main(String[] args) {
		// instanciar un objeto de la clase auto
		Auto aveo;
		// inicializar el objeto
		aveo = new Auto();
		// obtener las variables de la clase Auto
		System.out.println("este coche tiene el peso: " + aveo.peso);
		// obtener todas las propiedades
		aveo.imprimir();
	}

}
