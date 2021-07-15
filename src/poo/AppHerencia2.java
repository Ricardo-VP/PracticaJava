package poo;

public class AppHerencia2 {
	public static void main(String [] args) {
	// Crear dos objetos y en cada uno vamos a agregar un array de objetos
	// Ultimo, vamos a mostrar la informacion
	
	// Objeto 1
	Persona p = new Persona("Juan", "Calle");
	// Objeto 2
	Ciudadano c = new Ciudadano("Pablo", "Suarez", "038994994");
	// Objeto 3
	Ciudadano j = new Ciudadano("Jaime", "Sayago", "651616161");
	
	// Array de objeto de tipo persona
	// Crear un array del tipo de clase a generar
	Persona [] arrayPersona = new Persona[3];
	arrayPersona[0] = p;
	arrayPersona[1] = c;
	arrayPersona[2] = j;
	
	// Pilas, colas, listas
	// Collections hashmap, obj nativos, arraylist
	// Arboles y grafos
	
	lectorArrayPersona(arrayPersona);
	
	}
	
	public static void lectorArrayPersona(Persona [] array) {
		for(int i = 0; i<array.length;i++) {
			System.out.println("Identificando: " + array[i].identificacion());
		}
	}
	
}
