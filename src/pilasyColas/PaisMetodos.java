package pilasyColas;

public class PaisMetodos extends Pais {
	private String nombre;
	private String capital;
	private double habitantes;
	
	public PaisMetodos(String nombre, String capital, double habitantes) {
		this.nombre = nombre;
		this.capital = capital;
		this.habitantes = habitantes;
	}
	
	public void añadir(String nombre, String capital, double habitantes) {
		this.nombre = nombre;
		this.capital = capital;
		this.habitantes = habitantes;
	}
	
	public String mostrar() {
		return this.nombre + " | " + this.capital + " | " + this.habitantes;
	}
	
	public String eliminar() {
		this.nombre = "";
		this.capital = "";
		this.habitantes = 0;
		return "Pais eliminado";
	}
}
