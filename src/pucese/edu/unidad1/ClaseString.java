package pucese.edu.unidad1;

public class ClaseString {

	public static void main(String[] args) {
		// Generar un string
		System.out.println("El primer programa");
		
		// Declarar cadena
		String str = new String("El primer programa");
		String str1 = "El primer programa";
		
		// String nulos
		String strn = "";
		String strn1 = new String();
		
		// Obtener datos desde los string
		int longitud = str.length(); // Contar caracteres
		System.out.println(longitud);
		
		// Obtener desde donde empieza un string
		boolean resultado = str.startsWith("El");
		System.out.println(resultado);
		
		// Obtener donde comienza el string
		boolean resultado2 = str.endsWith("programa");
		System.out.println(resultado2);
		
		// Obtener el puesto de algun caracter
		int pos = str.indexOf("p");
		System.out.println(pos);
		
		// El operador logico == no es igual al metodo equals
		String str5 = "El lenguaje Java"; // Cadena string
		String str6 = new String("El lenguaje Java"); // Objeto string
		if(str5 == str6) {
			System.out.println("Son los mismos objetos");
		}else {
			System.out.println("No son los mismos objetos");
		}
		
		if(str5.equals(str6)) {
			System.out.println("Tienen el mismo contenido");
		}else {
			System.out.println("No tienen el mismo contenido");
		}
		
		// Extraer substrings = subcadenas
		String str8 = "El lenguaje Java";
		String subStr = str8.substring(12);
		System.out.println(subStr);
		String subStr1 = str8.substring(3,11);
		System.out.println(subStr1);
		
		// Conversion de número a string
		int valor = 10;
		String str9 = String.valueOf(valor);
		System.out.println(str9);
		
		// Reversa de una cadena
		String input = "hola mundo";
		StringBuilder input1 = new StringBuilder();
		input1.append(input);
		input1.reverse();
		System.out.println(input1);
		
		// Reversa de una cadena sin reverse
		char[] char1 = input.toCharArray();
		for(int i = char1.length-1; i>=0; i--) {
			System.out.print(char1[i]);
		}
	}

}
