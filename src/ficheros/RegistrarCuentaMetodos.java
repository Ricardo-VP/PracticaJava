package ficheros;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class RegistrarCuentaMetodos {
	
	//arquitectura y disposicion de archivos
	
	//objeto para enviar el texto al archivo
	private Formatter salida;
	
	//permitir al usuario abrir el archivo
	public void abrirArchivo() {
	  try {
		  salida = new Formatter("clientes.txt");
	  }catch (SecurityException e) {
		System.err.println("no tiene acceso de escritura");
		System.exit(1);
	  }catch(FileNotFoundException filenot) {
		  System.err.println("error al crear el achivo");
		  System.exit(1);
	  }
	}
	
	//agregar registros al archivo
	@SuppressWarnings("resource")
	public void agregarArchivo() {
		//objeto que se va a escribir el archiov
				RegistroCuenta rc = new RegistroCuenta();
				Scanner entrada = new Scanner(System.in);
				System.out.printf("%s\n %s\n %s\n %s\n\n",
					"para terminar, escriba el indicador de fin",
					"cuando se le pida los datos de entrada",
					"en unix/linux escriba ctrl d y oprima intro",
					"en windows escriba ctrl z y oprima intro");
				System.out.printf("%s\n%s", 
				"escriba cuenta mayor a cero, nombre,apellido, saldo",
				"? "); 
				
				while(entrada.hasNext()) {
					try {
						rc.setCuenta(entrada.nextInt());
						rc.setNombre(entrada.next());
						rc.setApellido(entrada.next());
						rc.setSaldo(entrada.nextDouble());
					if(rc.getCuenta()<0) {
						System.out.println("error al escribir la cuenta");
					}else {
						salida.format("%d %s %s %.2f \n",
						rc.getCuenta(),rc.getNombre(),rc.getApellido(),rc.getSaldo());
					}
						
					} catch (FormatterClosedException formatterClosedException ) {
						System.err.println( "Error al escribir en el archivo." );
						 return;
					}
					catch( NoSuchElementException elementException) {
						System.err.println( "Entrada invalida. Intente de nuevo." );
						 entrada.nextLine(); 
					}
					System.out.printf("%s %s \n%s", 
							"escriba cuenta mayor a cero",
							"nombre,apellido, saldo",
							"? ");
				}
			}
	
	//cerrar el archivo
	public void cerrarArchivo() {
		if(salida != null)
			salida.close();
	}

}
