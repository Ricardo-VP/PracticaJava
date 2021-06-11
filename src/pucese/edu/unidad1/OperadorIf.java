package pucese.edu.unidad1;

public class OperadorIf {

	public static void main(String[] args) {
		// Condicionales -> if y switch
		// Repetitivos o loops -> for, while y do while
		
		// Ejercicio: comparar dos valores
		
		int intento = 5;
		int solucion = 10;
		int resultado = 0;
		
		// condicional
		if(intento > solucion)
			resultado = +1;
		else 
			if(intento < solucion)
				resultado = -1;
			else
				resultado = 0;
		System.out.println(resultado);
	}

}
