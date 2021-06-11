package pucese.edu.unidad1;

public class OperadorTernarioIf {

	public static void main(String[] args) {
		// Operador ternario ?:
		// Nos sirve como un if reducido
		// Más sencilla con pocas lineas de codigo 
		// Estructura: resultado=(condicion)?valor1:valor2
		
		int x = 1;
		int y = 2;
		int mayor = 0;
		
		mayor = (x>y) ? x : y;
		
		System.out.println(y);

	}

}
