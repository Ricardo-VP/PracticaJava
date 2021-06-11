package pucese.edu.unidad1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TareaFunciones {

	public static void main(String[] args) {
		// Tarea de funciones
		
		// Ejercicio 1
		System.out.println("Ingrese los puntos para calcular la distancia");
		System.out.print("x1");
		Double x1 = leerPuntos();
		System.out.print("y1");
		Double y1 = leerPuntos();
		System.out.print("x2");
		Double x2 = leerPuntos();
		System.out.print("y2");
		Double y2 = leerPuntos();
		System.out.printf("El resultado de la distancia es: %.2f", distancia(x1,y1,x2,y2));
		System.out.println();
		
		// Ejercicio 2
		System.out.println();
		System.out.println("Calcule el resultado de la multiplicacion");
		multiplicacion();

	}
	
	public static double distancia(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
	}
	
	public static double leerPuntos() {
		double a;
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.print(" es igual a: ");
			a = Double.parseDouble(in.readLine());
		} catch (Exception e) {
			a = 0.0;
		}
		return a;
	}
	
	public static void multiplicacion() {
		int a = (int) Math.round(Math.random()*10);
		int b = (int) Math.round(Math.random()*10);
		System.out.println("¿Cuánto es " + a + " x " + b + " ?");
		int res;
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			res = Integer.parseInt(in.readLine());
		}catch (Exception e){
			res = 0;
		}
		if(res == a*b) {
			System.out.println("Muy bien!");
			return;
		}else {
			System.out.println("No. Por favor intenta de nuevo");
			return;
		}
		
	}

}
