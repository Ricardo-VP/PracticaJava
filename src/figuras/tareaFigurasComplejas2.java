package figuras;

import java.util.Scanner;

public class tareaFigurasComplejas2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int res, respuesta;
		do {
		System.out.println("¿Que figura desea visualizar?");
		System.out.println("1 | 2 | 3 | 4 | 5 | 6 | 7 | 8");
		res = entrada.nextInt();
		switch(res) {
			case 1:
				// Figura 1
				figura1();
				break;
			case 2:
				// Figura 2
				figura2();
				break;
			case 3:
				// Figura 3 
				figura3();
				break;
			case 4:
				// Figura 4
				figura4();
				break;
			case 5:
				// Figura 5
				figura5();
				break;
			case 6:
				// Figura 6
				figura6();
				break;
			case 7:
				// Figura 7
				figura7();
				break;
			case 8:
				// Figura 8
				figura8();
				break;
			default:
				System.out.println("Numero incorrecto");
		}
		System.out.println("¿Desea volver? 1. Si | 2. No");
		respuesta = entrada.nextInt();
		}while(respuesta==1);

	}
	
	public static void figura1() {
	    for(int i = 1; i<= 7; i++) {
	    	System.out.print("*");
	    }
	    System.out.println();
	    for(int i = 1; i<= 5; i++) {
	    	System.out.print("*");
	    	for(int j = 1; j<= 5; j++) {
	    		System.out.print(" ");
	    	}
	    	System.out.print("*");
	    	System.out.println();
	    }
	    for(int i = 1; i<= 7; i++) {
	    	System.out.print("*");
	    }
	    System.out.println();
	}
	
	public static void figura2() {
		for (int i = 1; i <= 8; i++) {
		      for (int j = 1; j <= i; j++) {
		        System.out.print("*");
		      }
		      System.out.println();
		    }
	}
	
	public static void figura3() {
		    for (int k = 1; k <= 7; k++) {
		      for (int i = 1; i <= k*-1+7; i++) {
			        System.out.print(" ");
		      }
		      for (int i = 1; i <= 2 * k - 1; i++) {
		    	  System.out.print("*");
		      }   
		      System.out.println();
		    }
	}
	
	public static void figura4() {
		for (int k = 1; k <= 5; k++) {
		      for (int i = 1; i <= k*-1+7; i++) {
			        System.out.print(" ");
		      }
		      for (int i = 1; i <= 2 * k - 1; i++) {
		    	  System.out.print("*");
		      }   
		      System.out.println();
		    }
		for (int k = 4; k >= 1; k--) {
		      for (int i = 1; i <= k*-1+7; i++) {
			        System.out.print(" ");
		      }
		      for (int i = 1; i <= 2 * k - 1; i++) {
		    	  System.out.print("*");
		      }   
		      System.out.println();
		    }
	}
	
	public static void figura5() {
	    for (int i = 1; i <= 8; i++) {
	      for (int j = 1; j <= 8 - i; j++) {
	        System.out.print(" ");
	      }
	      for (int k = 1; k <= i; k++) {
	        System.out.print("*");
	      }
	      System.out.println("");
	    }
	}
	
	public static void figura6() {
		 for (int i = 8; i >= 1; i--) {
		      for (int j = 1; j <= i; j++) {
		        System.out.print("*");
		      }
		      System.out.println();
		    }
	}
	
	public static void figura7() {
		for (int i = 1; i <= 8; i++) {
		      for (int j = 1; j <= i; j++) {
		        System.out.print("*");
		      }
		      System.out.print(" ");
		      for (int j = 1; j <= i; j++) {
			        System.out.print("*");
			  }
		      System.out.println();
		    }
	}
	
	public static void figura8() {
		int n = 8;
		for (int i = 0; i < n; ++i) {
		      asteriscos(i + 1);
		      espacios(n - i - 1);
		      asteriscos(n - i + 1);
		      espacios(2 * i);
		      asteriscos(n - i);
		      espacios(n - i - 1);
		      asteriscos(i + 1);
		      System.out.println();
		    }
	}
	
	public static void espacios(int n) {
		 for (int i = 0; i < n ; ++i) {
			 System.out.print(" ");
		 }      
	}
	
	public static void asteriscos(int n) {
		for (int i = 0; i < n; ++i) {
			System.out.print("*");
		}     
	}

}
