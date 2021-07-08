package arrays;

import java.util.Scanner;


public class TareaArrays {

	public static void main(String[] args) {
		ejercicio1();
	}
	
	// EJERCICIO 1
	public static void ejercicio1() {
		// 1. Birthday problem. Modify Birthday.java so that it compute the probability that two people have a birthday within a day of each other.
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el número de días: ");
		int days   = entrada.nextInt();   // number of days
		System.out.println("Ingrese el número de intentos: ");
        int trials = entrada.nextInt();   // number of trials
        int people = 0;                            // total number of people over all trials

        // repeat trials times
        for (int t = 0; t < trials; t++) {

            //  hasBirthday[d] = true if someone born on day d; false otherwise
            boolean[] hasBirthday = new boolean[days];

            while (true) {
                people++;                               // one more person enters the room
                int d = (int) (days * Math.random());   // integer between 0 and days-1
                if (hasBirthday[d]) break;              // found two people with the same birthday
                hasBirthday[d] = true;                  // update array
            }
        }

        double average = (double) people / trials;
        System.out.println("Promedio = " + average);
        entrada.close();
    }
	
	// Ejercicio 10
	public static void ejercicio10(){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa n: ");
		int N= entrada.nextInt();
		int t=0;

		String[][] a=new String[N][N];
		for(int i=0;i<N;i++){
		    for(int j=0;j<N;j++){
		    double r=Math.random();
		    if(r<0.33){a[i][j]="X";t=1;}
		    else if(r<0.66)a[i][j]="O";
		    else a[i][j]=".";
		    System.out.print(a[i][j]+" ");
		}
		System.out.println();
		}

		 for(int i=0;i<N;i++){
		    for(int j=0;j<N;j++){
		        if(a[i][j]=="X"){
		//to check horizontally

		            for(int y=j,length=1;y<N-1;y++){                        
		        if(a[i][y]!=a[i][y+1])break;
		        length++;
		        if(t<length) t=length;}
		 //to check vertically

		            for(int x=i,length=1;x<N-1;x++)
		            {if(a[x][j]!=a[x+1][j])
		                break;
		            length++;
		            if(t<length) t=length;}
		    //to check diagonally ,right and down

		            for(int x=i,y=j,length=1;x<N-1&&y<N-1;x++,y++)
		            { if(a[x][y]!=a[x+1][y+1])
		                break;
		                   length++;
		            if(t<length) t=length; }

		                }
		           }
		     }
		          for(int i=N-1;i>=0;i--){
		            for(int j=0;j<N-1;j++){
		                if(a[i][j]=="X"){
		  //to check diagonally ,right and up

		                    for(int x=i,y=j,length=1;x>0&&y<N-1;x--,y++)
		                    {if(a[x][y]!=a[x-1][y+1])
		                        break;
		                    length++;
		                    if(t<length) t=length;
		                    }
		                }
		            }
		        }


		  System.out.println("La longitud de la secuencia más larga de x en el arreglo anterior: "+t);
		  entrada.close();
	}
	
	// Ejercicio 21
	public static void ejercicio21() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa n: ");
		int n = entrada.nextInt();
        int[] digits = new int[6];
        int[][] code = { { 1, 1, 0, 0, 0 },
                         { 0, 0, 0, 1, 1 },
                         { 0, 0, 1, 0, 1 },
                         { 0, 0, 1, 1, 0 },
                         { 0, 1, 0, 0, 1 },
                         { 0, 1, 0, 1, 0 },
                         { 0, 1, 1, 0, 0 },
                         { 1, 0, 0, 0, 1 },
                         { 1, 0, 0, 1, 0 },
                         { 1, 0, 1, 0, 0 } };

        // extract digits
        for (int i = 1; i <= 5; i++) {
            digits[i] = n % 10;
            n /= 10;
        }

        // compute check digit
        int checkdigit = 0;
        for (int i = 1; i <= 5; i++)
            checkdigit += digits[i];
        digits[0] = checkdigit % 10;

        // print barcode
        System.out.println("*****");
        for (int i = 5; i >= 0; i--)
            for (int j = 0; j < 5; j++)
                if (code[digits[i]][j] == 1) System.out.println("*****");
                else                         System.out.println("**");
        System.out.println("*****");
        entrada.close();
    }
	
}
