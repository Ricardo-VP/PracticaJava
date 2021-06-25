package pucese.edu.unidad1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int res;
		Scanner entrada = new Scanner (System.in);
		int edad, acum = 0, cont = 0, mayores =0;
		float estatura, acum2 = 0;
		int mayores2 =0, cont2 = 0;
		do {
			System.out.println("Ingrese una edad");
			edad = entrada.nextInt();
			if(edad>0) {
				acum = acum + edad;
				cont++;
				if(edad>18) {
					mayores++;
				}
				System.out.println("Ingrese una estatura");
				estatura = entrada.nextFloat();
				acum2 = acum2 + estatura;
				cont2++;
				if(estatura>1.75) {
					mayores2++;
				}
			}else {
				System.out.println("Programa detenido");
			}
			
		}while(edad>0);
		System.out.println("Ingrese la operación que desea realizar");
		System.out.println("1. Edad media y estatura media| 2. Mayores a 18 años  y mayores a 1.75cm");
		res = entrada.nextInt();
		switch(res) {
		case 1:
			System.out.println("Promedio de las "+ cont + " edades: " + acum/cont);
			System.out.println("Promedio de las "+ cont2 + " estaturas: " + acum2/cont2);
			break;
		case 2:
			
			System.out.println("Total de mayores de 18 años: " + mayores);
			System.out.println("Total de mayores de 1.75cm: " + mayores2);
			break;
		}
		entrada.close();
	}

}
