package listas;

import java.util.Scanner;

public class AppSimpleLinkedList {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		
		//SimpleLinkedList<Integer> listaEnlazada = new SimpleLinkedList<>();
		//listaEnlazada.addFirst(5);
		//listaEnlazada.addFirst(12);
		//listaEnlazada.addFirst(32);
		//listaEnlazada.addFirst(55);
		//listaEnlazada.addLast(45);
		
		//System.out.println(listaEnlazada.last());
	
		//listaEnlazada.getAll();
		//System.out.println("indice 2: " + listaEnlazada.getElementObject(2));
		
		//System.out.println(listaEnlazada.promedio());
		//System.out.println(listaEnlazada.obtenerMayor());
		//System.out.println(listaEnlazada.mayores());
		
		System.out.println("Cuantos estudiantes desea ingresar?");
		n = entrada.nextInt();
		SimpleLinkedList<Estudiante> listaEnlazadaEstudiante = new SimpleLinkedList<>();
		for(int i = 1; i<=n; i++) {
			System.out.println("Estudiante " + i);
			System.out.println("Ingrese la cedula: ");
			String cedula = entrada.next();
			System.out.println("Ingrese el nombre: ");
			String nombre = entrada.next();
			System.out.println("Ingrese la edad: ");
			int edad = entrada.nextInt();
			Estudiante a = new Estudiante(cedula, nombre, edad);
			listaEnlazadaEstudiante.addFirst(a);
		}
		listaEnlazadaEstudiante.getAllEstudiantes();
		System.out.println("El promedio de las edades es: " + listaEnlazadaEstudiante.promedio());
		System.out.println("El numero de estudiantes mayores de 20 años es: " + listaEnlazadaEstudiante.mayores());
		System.out.println("El estudiante con mayor edad tiene: " + listaEnlazadaEstudiante.obtenerMayor());
		entrada.close();
	}

}
