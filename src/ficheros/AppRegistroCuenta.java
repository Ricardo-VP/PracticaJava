package ficheros;

public class AppRegistroCuenta {

	public static void main(String[] args) {
		RegistrarCuentaMetodos archivo = new RegistrarCuentaMetodos();
		archivo.abrirArchivo();
		archivo.agregarArchivo();
		archivo.cerrarArchivo();
	}

}