package arrays;

public class EjercicioArrays {

	public static void main(String[] args) {
		// matriz o libro de calificaciones
		
		String nombreCurso;
		
		//datos que es una matriz
		int arregloCalif[][] = {
				{87,96,70},
				{68,87,90},
				{94,100,90},
				{100,81,82},
				{83,65,85},
				{78,87,65},
				{85,75,83},
				{81,94,100},
				{76,72,84},
				{87,93,73},
		};
		//leer matriz
		for (int [] fila: arregloCalif) {
			for (int z:fila) {
				System.out.print(z + " ");
			}
			System.out.println();
		}
		
		//imprimirCalificaiones y promedio
		imprimirCalificaciones(arregloCalif);
		
		
		//Calificaciones bajas y altas
		
		System.out.println("la calificacion mas baja es: " + minima(arregloCalif));
		System.out.println("la calificacion mas alta es: " + maxima(arregloCalif));
		
		//distribucion de las calificaciones o grafico
		imprimirGraficoBarra(arregloCalif);

	}
	public static void imprimirCalificaciones (int [][] calificaciones) {
		System.out.println("La calificaciones son: "); //titulo
		System.out.print("            "); //subtitulo
		//crear encabezado
		for (int prueba = 0; prueba < calificaciones[0].length; prueba++)
			System.out.printf("Prueba %d ", prueba + 1);
			System.out.println("promedio");
		//crear las filas y columnas con las calificaciones
			
			//leer filas
			for(int estudiante=0; estudiante < calificaciones.length;estudiante++) {
				System.out.printf("Estudiante %2d", estudiante +1);
			
				//leer columnas
				for (int prueba: calificaciones[estudiante]) 
					System.out.printf("%8d",prueba);
					//calcular promedio
					double promedio = obtenerPromedio(calificaciones[estudiante]);
					System.out.printf("%9.2f", promedio);
					
				
				System.out.println();
				
			}
			
		
		
	}

	public static double obtenerPromedio(int conjuntoCalificaciones []) {
		int total = 0;
		for (int promedio:conjuntoCalificaciones)
			total+= promedio;
		return (double)total/conjuntoCalificaciones.length;
	}

	public static int minima(int calificaciones [][]) {
		//crear una matriz vacia
		int califBaja= calificaciones[0][0]; //asumiendo que el primer dato es el mas bajo
		
		//recorrido o iteracion a traves de las filas del arreglo
		for (int califEstudiante[]: calificaciones) {
			//revisar las columnas
			for (int calificacion: califEstudiante) {
				//si la calificaciones es menor que califBaja, se le asigna a califBaja
				if (calificacion<califBaja)
					califBaja = calificacion;
			}
		}
		return califBaja; 
		
	}
	public static int maxima(int calificaciones [][]) {
		int califAlta= calificaciones[0][0]; //asumiendo que el primer dato es el mas bajo
		
		//recorrido o iteracion a traves de las filas del arreglo
		for (int califEstudiante[]: calificaciones) {
			//revisar las columnas
			for (int calificacion: califEstudiante) {
				//si la calificaciones es mayor que califAlta, se le asigna el valor a califAlta
				if (calificacion>califAlta)
					califAlta = calificacion;
			}
		}
		return califAlta; 
	}

	public static void imprimirGraficoBarra(int calificaciones [][]) {
		
		System.out.println("Distribucion de calificaciones en general: ");
		//un vector donde almacenar la calificaciones de cada rango de las 10 calificaciones
		int frecuencia[] = new int[11];
		//recorrer la matriz y asignar que para cada califaciones, se incrementa el valor del vector frecuencia
		for (int califEstudiantes[]: calificaciones) 
			for (int calificacion:califEstudiantes)
				++frecuencia[calificacion/10];
		
		/*for (int f:frecuencia) {
			System.out.println(f);
		}*/
		
		//organizar la impresion de frecuencias es decir imprimir el grafico
		for (int cuenta = 0;  cuenta<frecuencia.length; cuenta++) {
			//imprimir la etiquetas de las barras (00-09:... 90:99
			if (cuenta == 10)
				System.out.printf("%5d: ", 100);
			else
				System.out.printf("%02d-%02d: ", cuenta *10, cuenta * 10+9);
			//imprimir los asteriscos
			for (int asterisco = 0; asterisco<frecuencia[cuenta]; asterisco++)
				System.out.print("*"); //imprime los asterisco de acuerdo a la frecuencia
			System.out.println();
		}
	
	}
	
	
}

