package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Fichero1 {

	public static void main(String[] args) {

		//leer datos principales
		File fichero = new File ("clientes.txt");
		if(fichero.exists()) {
			System.out.println("nombre del archivo: "+ fichero.getName());
			System.out.println("ruta: "+ fichero.getPath());
			System.out.println("ruta absoluta: "+ fichero.getAbsolutePath());
			System.out.println("se puede escribir: "+ fichero.canRead());
			System.out.println("se puede leer: "+ fichero.canWrite());
			System.out.println("tamaño: "+ fichero.length());

		}
		
		//leer el fichero es decir ver los datos que estan guardados
		//leerFichero();
		escribirFichero();
		
	}
	public static void escribirFichero() {
		File fichero = null;
		FileWriter writer = null;
		PrintWriter pw = null;
		String frase = "esto es una archivo generado y escrito desde java";
		try {
			 //fichero = new File("guardarArchivo.txt");
			writer = new FileWriter("guardarArchivo.txt");
			//pw = new PrintWriter(writer);
			for (int i = 0; i < 10; i++) {
				//pw.println("linea " + i);
				writer.write("linea \n" + i);	
				
			}
			writer.write(frase);
			writer.close();
			System.out.println("archivo guardado");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void leerFichero() {
		File archivo = null;
		FileReader reader = null;
		BufferedReader buffer = null;
		
		try {
			archivo = new File("clientes.txt");
			reader = new FileReader(archivo);
			buffer = new BufferedReader(reader);
			
			String linea;
			System.out.println("datos del archivo leido:");
			while((linea = buffer.readLine()) != null) {
				System.out.println(linea);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}