package poo;

public class Casa {
	
	String nombrePropietario;
	int superficiePlanta1;
	int superficiePlanta2;
	static int numeroViviendas = 0;
	
	// Mensaje
	static {
		System.out.println("Es una prueba de ejecución de bloque static");
	}
	
	// Constructor vacío
	//Casa(){
	//}
	
	// Constructor de inicio
	Casa(){
		nombrePropietario = "";
		superficiePlanta1 = 0;
		superficiePlanta2 = 0;
		numeroViviendas++;
	}
	
	// Constructor de parámetros
	Casa(String nombrePropietarios, int superficiePlanta1){
		this.nombrePropietario = nombrePropietarios;
		this.superficiePlanta1 = superficiePlanta1;
		superficiePlanta2 = 0;	
		numeroViviendas++;
	}
	
	// Constructor con todos los parámetros
	Casa(String nombrePropietario, int superficiePlanta1, int superficiePlanta2) {
        this.nombrePropietario = nombrePropietario;
        this.superficiePlanta1 = superficiePlanta1;
        this.superficiePlanta2 = superficiePlanta2;
        numeroViviendas++;
    }   
	
	// Encapsular las variables
	
		// Obtencion
	void establecerPropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}
		// Envio
	String devolverPropietario() {
		return nombrePropietario;
	}
		// Establecer superficie planta 1
	void establecerSuperficie(int superficiePlanta1) {
		this.superficiePlanta1 = superficiePlanta1;
	}
		// Envio o retornar superficie planta 1
	int devolverSuperficiePlanta1() {
		return superficiePlanta1;
	}
		// Devolver numero de viviendas
		// utilizando un metodo static 
	static int devolverNumeroViviendas() {
		return numeroViviendas;
	}
	
	// Metodo para devolver la operacion de superficie total
	int devolverSuperficieTotal() {
		int superficieTotal;
		superficieTotal = superficiePlanta1 + superficiePlanta2;
		return superficieTotal;
	}
}
