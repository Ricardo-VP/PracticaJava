package pucese.edu.unidad1;

import java.util.Scanner;

public class TareaBucles {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int res;
		System.out.println("Seleccione el ejercicio: ");
		System.out.println("1 | 6 | 8 | 9 | 12 | 13 | 14 | 18 | 21 | 22");
		res = entrada.nextInt();
		switch(res) {
			case 1: 
				ejercicio1();
				break;
			case 6:
				ejercicio6();
				break;
			case 8: 
				ejercicio8();
				break;
			case 9:
				ejercicio9();
				break;
			case 12:
				ejercicio12();
				break;
			case 13: 
				ejercicio13();
				break;
			case 14: 
				ejercicio14();
				break;
			case 18: 
				ejercicio18();
				break;
			case 21: 
				ejercicio21();
				break;
			case 22: 
				ejercicio22();
				break;
			default: System.out.println("Numero incorrecto");
		}
		entrada.close();
	}
	
	public static void ejercicio1() {
		// 1. Write a program that takes three integer command-line arguments and prints equal if all three are equal, and not equal otherwise.
				int n1,n2,n3;
				Scanner entrada = new Scanner(System.in);
				System.out.print("Ingrese el n1: ");
				n1 = entrada.nextInt();
				System.out.print("Ingrese el n2: ");
				n2 = entrada.nextInt();
				System.out.print("Ingrese el n3: ");
				n3 = entrada.nextInt();
				
				if(n1 == n2 && n1 == n3) {
					System.out.print("Los 3 numeros son iguales");
				}else {
					System.out.print("Los 3 numeros no son iguales");
				}
				entrada.close();
	}
	
	public static void ejercicio6() {
				// 6. Write a program that prints the result of rolling a loaded die such that the probability of
				// getting a 1, 2, 3, 4, or 5 is 1/8 and the probability of getting a 6 is 3/8.
				
				// double in the range [0.0, 1.0)
		        double r = Math.random();

		        // integer in the range 1 to 6 with desired probabilities
		        int roll;
		        if (r < 1.0/8.0) {
		        	roll = 1;
		        }
		        else if (r < 2.0/8.0) {
		        	roll = 2;
		        }
		        else if (r < 3.0/8.0) {
		        	roll = 3;
		        }
		        else if (r < 4.0/8.0) {
		        	roll = 4;
		        }
		        else if (r < 5.0/8.0) {
		        	roll = 5;
		        }
		        else{
		        	roll = 6;
		        }

		        System.out.println(roll);
	}
	
	public static void ejercicio8() {
		// Rewrite TenHellos.java to make a program that takes the number of lines to print as a command-line argument. 
		// You may assume that the argument is less than 1000. 
		// Hint: consider using i % 10 and i % 100 to determine whether to use "st", "nd", "rd", or "th" for printing the ith Hello.
		int a;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese el número de HELLO'S a mostrar: ");
		a = entrada.nextInt();
		for(int i = 1; i<=a; i++) {
			System.out.print(i);
			// Si termina en 11 a 20 i%100 se usa th
			if(i % 100 >=11 && i % 100 <= 20) {
				System.out.print("th");
			}else if(i % 10 == 1) { // Caso especial st
				System.out.print("st");
			}else if(i % 10 == 2) { // Caso especial nd
				System.out.print("nd");
			}else if(i % 10 == 3) { // Caso especial rd
				System.out.print("rd");
			}else {
				System.out.print("th"); // Resto de casos th
			}
			System.out.println(" Hello");
		}
		entrada.close();
	}
	
	public static void ejercicio9() {
		// 9. Write a program that, using one for loop and one if statement, 
		// prints the integers from 1000 to 2000 with five integers per line. Hint: use the % operator.
		for(int i = 1000; i<= 2000; i++) {
			System.out.print(i + " ");
			if((i+1) % 5 == 0) {
				System.out.println();
			}
		}
	}
	
	public static void ejercicio12() {
		// 12. Write a program that prints a table of the values of ln n, n, n ln n, n2, n3, 
		// and 2n for n = 16, 32, 64, ..., 2048. Use tabs ('\t' characters) to line up columns.
		System.out.println("log n \tn \tn log n\tn^2 \tn^3");
        for (long i = 2; i <= 2048; i *= 2) {
            System.out.print((int) Math.log(i));
            System.out.print('\t');             // tab character
            System.out.print(i);
            System.out.print('\t');             
            System.out.print((int) (i * Math.log(i)));
            System.out.print('\t');             
            System.out.print(i * i);
            System.out.print('\t');             
            System.out.print(i * i * i);
            System.out.println();
        }
	}
	
	public static void ejercicio13() {
		// 13. What is the value of m and n after executing the following code?
		int n = 123456789;
		int m = 0;
		while (n != 0) {
		   m = (10 * m) + (n % 10);
		   n = n / 10;
		}
		System.out.print("m: " + m + " n: "+ n);
		// El valor de n ha sido invertido y asignado a m, mientras que n se ha quedado en 0
	}
	
	public static void ejercicio14() {
		// 14. What does the following code print out?
		int f = 0, g = 1;
		for (int i = 0; i <= 15; i++) {
		   System.out.println(f);
		   f = f + g;
		   g = f - g;
		}
		// Primero se está imprimiendo el valor de f, luego a esta f se le suma g y por ultimo la g equivale a la resta de f menos g, 
		// esto en un bucle de 15 repeticiones
	}
	
	public static void ejercicio18() {
		// 18. Unlike the harmonic numbers, the sum 1/1 + 1/4 + 1/9 + 1/16 + ... + 1/n2 does converge to a constant as n grows to infinity. 
		// (Indeed, the constant is pi2 / 6, so this formula can be used to estimate the value of pi.) Which of the following for loops computes this sum? 
		// Assume that n is an int initialized to 1000000 and sum is a double initialized to 0.
		double sum = 0.0;
		Scanner entrada = new Scanner(System.in);
		int n;
		System.out.print("Ingresa n: ");
		n = entrada.nextInt();
        for (int i = 1; i <= n; i++) {      
            sum += 1 / (1.0 * i * i);     // bien - multiplica por 1.0 to obtener el doble
            // sum += 1.0 / (i * i);      // mal  - desborda si n > 65,535
            // sum += 1 / (i * i);        // mal  - division de entero
            // sum += 1.0 / i * i;        // mal  - calcula (1.0 / i) * i
        }
        System.out.printf("%.2f", sum);
        System.out.println();
        System.out.printf("%.2f", Math.sqrt(6.0 * sum));
        entrada.close();
	}
	
	public static void ejercicio21() {
		// 21. Modify Binary.java to get a program Modify that takes a second command-line argument K and converts the first argument to base K. 
		// Assume the base is between 2 and 16. For bases greater than 10, 
		// use the letters A through F to represent the 11th through 16th digits, respectively.
		
		// read in the command-line argument
		Scanner entrada = new Scanner(System.in);
		char[] tabla = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.print("Ingresa n: ");
        int n = entrada.nextInt();
        System.out.print("Ingresa k(base): ");
        int k = entrada.nextInt();

        // Establecer la potencia más larga de K que sea <= n
        int power = 1;
        while (power <= n/k) {
            power *= k;
        }
        System.out.println(power);
        while (power > 0) {
            //Recuperar e imprimir el siguiente digito de n
            int digit = n / power;
            System.out.print(tabla[digit]);

            // actualizar las variables para el siguiente bucle
            n -= digit * power;
            power /= k;
        }

        System.out.println(n);
        entrada.close();
	}
	
	public static void ejercicio22() {
		// 22. Write a program code fragment that puts the binary representation of a positive integer n into a String variable s.
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese n: ");
		int n = entrada.nextInt();

        // Se divide para 2 en bucle, y formar los restos al revés
        String s = "";
        for (int i = n; i > 0; i /= 2) {
            s = (i % 2) + s;
        }
        System.out.println(s);
        entrada.close();
	}

}
