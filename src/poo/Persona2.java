package poo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Persona2 {
	protected String cedula;	
	protected String nombre;
	protected String fechaNacimiento;
	
	// Constructor
	public Persona2(String cedula, String nombre, String fechaNacimiento) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	// Metodos
	
	public  Integer calcularEdad(String fechaNacimiento){
		   Date fechaNacimiento1=null;
		       try {
		           /**Se puede cambiar la mascara por el formato de la fecha 
		           que se quiera recibir, por ejemplo año mes día "yyyy-MM-dd"
		           en este caso es día mes año*/
		           fechaNacimiento1 = new SimpleDateFormat("dd-MM-yyyy").parse(fechaNacimiento);
		       } catch (Exception ex) {
		           System.out.println("Error:"+ex);
		       }
		       Calendar fechaNacimiento2 = Calendar.getInstance();
		       //Se crea un objeto con la fecha actual
		       Calendar fechaActual = Calendar.getInstance();
		       //Se asigna la fecha recibida a la fecha de nacimiento.
		       fechaNacimiento2.setTime(fechaNacimiento1);
		       //Se restan la fecha actual y la fecha de nacimiento
		       int año = fechaActual.get(Calendar.YEAR)- fechaNacimiento2.get(Calendar.YEAR);
		       int mes =fechaActual.get(Calendar.MONTH)- fechaNacimiento2.get(Calendar.MONTH);
		       int dia = fechaActual.get(Calendar.DATE)- fechaNacimiento2.get(Calendar.DATE);
		       //Se ajusta el año dependiendo el mes y el día
		       if(mes<0 || (mes==0 && dia<0)){
		           año--;
		       }
		       //Regresa la edad en base a la fecha de nacimiento
		       return año;
		   }
	
	// Encapsulando

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	// Metodo para imprimir los datos
	
	public String datos() {
		return this.cedula + ", " + this.nombre + ", " + this.fechaNacimiento + ", " + calcularEdad(this.fechaNacimiento);
	}
	
	
	
}
