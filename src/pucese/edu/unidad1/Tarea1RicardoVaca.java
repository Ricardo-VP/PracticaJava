package pucese.edu.unidad1;

public class Tarea1RicardoVaca {

	public static void main(String[] args) {
		/* TAREA INDIVIDUDAL TIPOS DE DATOS PARTE 1
		 * REALIZAR LOS EJERCICIOS DEL 1 AL 23 SOBRE TYPES OF DATA
		*/
		
		
		// 1. Suppose that a and b are int values. What does the following sequence of statements do? 
		// R: Primero t se declara con el valor de a, luego b se le asigna el valor de t (el mismo de a), y por ultimo, a es igual a b (con valor de a)
		int a = 1;
		int b = 2;
		
		int t = a;
		b = t;
		a = b;
		System.out.println("a: "+ a+ "; b: "+ b+ "; t: "+ t);
		
		
		// 2. Suppose that a and b are int values. Simplify the following expression: (!(a < b) && !(a > b))
		System.out.println("(!(a < b) && !(a > b) es igual a : "+ (!(a < b) && !(a > b))); // True debido a que las dos operaciones dan true
		
		
		/* 3. The exclusive or operator ^ for boolean operands is defined to be true if they are different, false if they are the same. 
		 *	  Give a truth table for this function.
		 *	  |     A     |     B     | A ^ B | 
		 *    |    TRUE   |    TRUE   | FALSE | 
		 *    |   FALSE   |    TRUE   | TRUE  | 
		 *    |    TRUE   |   FALSE   | TRUE  | 
		 *    |   FALSE   |   FALSE   | FALSE | 
		*/
		
		
		// 4. Why does 10/3 give 3 and not 3.33333333? Porque los dos valores son enteros y no flotantes
		int x = 10;
		int y = 3;
		System.out.println("10/3 = " + x/y);
		
		
		// 5. What do each of the following print?
		System.out.println(2 + "bc"); // Concatena el número y la cadena de texto
		System.out.println(2 + 3 + "bc"); // Realiza la operación con los números y luego el resultado lo concatena con el texto
		System.out.println((2+3) + "bc"); // Realiza la operación en paréntesis y luego el resultado lo concatena con el texto
		System.out.println("bc" + (2+3)); // Realiza la operación en paréntesis y luego el resultado lo concatena con el texto del inicio
		System.out.println("bc" + 2 + 3); // Realiza la operación con los números y luego el resultado lo concatena con el texto del inicio
		
	}

}
