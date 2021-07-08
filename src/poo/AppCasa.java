package poo;

public class AppCasa {

	public static void main(String[] args) {
		// Mensaje con el total de objetos instanciados
		System.out.println("En estos momentos hay instanciadas " + Casa.devolverNumeroViviendas() + " viviendas");
		
		// Declarar objetos
		Casa casa1, casa2;
		Casa casa3;
		Casa casa4;
		
		// Instanciar el objeto
		casa1 = new Casa();
		System.out.println("En estos momentos hay instanciadas " + Casa.devolverNumeroViviendas() + " viviendas");
		
		// Instanciar otro objeto
		casa2 = new Casa("LUIS GARCIA", 95);
		System.out.println("En estos momentos hay instancias " + Casa.devolverNumeroViviendas() + " viviendas");
		
		// Instanciar otro objeto
		casa3 = new Casa("PABLO CALLE", 95, 100);
		
		// Asignar valores a los atributos
		casa1.establecerPropietario("ALICIA MARTIN");
		casa1.establecerSuperficie(60);
		
		// Visualizar la informacion de los objetos
		System.out.println("CASA 1 : ");
		System.out.println("propietario: " + casa1.devolverPropietario());
		System.out.println("superficiePlanta1: " + casa1.devolverSuperficiePlanta1());
		
		System.out.println("CASA 2 : ");
		System.out.println("propietario: " + casa2.devolverPropietario());
		System.out.println("superficiePlanta1: " + casa2.devolverSuperficiePlanta1());
		
		System.out.println("CASA 3 : ");
		System.out.println("propietario: " + casa3.devolverPropietario());
		System.out.println("superficie total: "+ casa3.devolverSuperficieTotal());
	}

}
