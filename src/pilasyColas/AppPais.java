package pilasyColas;

import java.util.Scanner;

public class AppPais {

	public static void main(String[] args) {
//		PaisMetodos a;
//		a = new PaisMetodos("pais1", "paiscapital1", 500);
//		System.out.println(a.mostrar());
		int respuesta;
		Scanner read = new Scanner(System.in);
		ArrayTareaStack<PaisMetodos> pila = new ArrayTareaStack<PaisMetodos>();
		do {
			System.out.println("Seleccione la operacion que desea realizar: ");
			System.out.println("1. Agregar pais");
			System.out.println("2. Eliminar pais");
			System.out.println("3. Mostrar paises");
			System.out.println("4. Salir");
			respuesta = read.nextInt();
			switch(respuesta) {
				case 1:
					System.out.println("**********************************");
					System.out.print("Ingrese el nombre del pais: ");
					String nombrePais = read.next();
					System.out.print("Ingrese la capital del pais: ");
					String capitalPais = read.next();
					System.out.print("Ingrese la cantidad de habitantes del pais: ");
					double habitantesPais = read.nextDouble();
					PaisMetodos pais;
					pais = new PaisMetodos(nombrePais, capitalPais, habitantesPais);
					pila.push(pais);
					System.out.println("**********************************");
					break;
				case 2:
					System.out.println("**********************************");
					System.out.println("Pais eliminado : " + pila.pop().mostrar());
					System.out.println("**********************************");
					break;
				case 3: 
					System.out.println("**********************************");
					PaisMetodos arr[] = new PaisMetodos[pila.size()];
					if(pila.isEmpty()) {
						System.out.println("No hay paises para mostrar");
					}else {
						int i = 0;
						int x = 1;
						System.out.println("Lista de paises (desde el más actual)");
						while(pila.isEmpty() == false) {
							System.out.println("Pais " + x + ": " + pila.top().mostrar());
							PaisMetodos a = pila.pop();
							arr[pila.size()] = a;
							i--;
							x++;
						}
						for(int j = 0; j<arr.length; j++) {
							pila.push(arr[j]);
						}
					}
					System.out.println("**********************************");
					break;
				case 4: 
					System.out.println("**********************************");
					System.out.println("Saliendo...");
					System.out.println("**********************************");
					break;
				default:
						System.out.println("**********************************");
						System.out.println("Opcion incorrecta");
						System.out.println("**********************************");
			}
		}while(respuesta!=4);
		read.close();
	}

}
