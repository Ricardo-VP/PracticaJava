package ficheros;

public class RegistroCuenta {
	private int cuenta;
	private String nombre, apellido;
	private double saldo;

	
	public RegistroCuenta() {
		this(0,"","",0.0);
	}

	public RegistroCuenta(int cuenta, String nombre, String apellido, double saldo) {
		setCuenta(cuenta);
		setNombre(nombre);
		setApellido(apellido);
		setSaldo(saldo);
	}
		public int getCuenta() {
			return cuenta;
			
		}

		public void setCuenta(int cuenta) {
			this.cuenta = cuenta;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		

	}