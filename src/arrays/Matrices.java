package arrays;

public class Matrices {

	public static void main(String[] args) {
		//declaracion de una matriz bidimensional
		
		double [] [] temperatures = new double [3][4];
		
		temperatures [0][0] = 20.5; 
		temperatures [0][1] = 30.6;
		temperatures [0][2] = 28.3;
		temperatures [0][3] = 58.3;
		
		temperatures [1][0] = 38.7; 
		temperatures [1][1] = 18.3;
		temperatures [1][2] = 16.2;
		temperatures [1][3] = 16.2;
		
		temperatures [2][0] = 14.7;
		temperatures [2][1] = 68.3;
		temperatures [2][2] = 36.2;
		temperatures [2][3] = 78.2;

//imprimir la matriz con for
		//podemos utilizar el for each
		
		for (double [] columna: temperatures) {
			System.out.println();
			for(double z: columna)
			{
				System.out.print(z +  " " );
			}
		}
		
//declaracion de matrices 
		int [][] temperaturas={
		/*fila0*/		{15,16,18,97,65},
		/*fila1*/		{95,56,42,85,23},
		/*fila2*/		{33,25,45,78,45},
		/*fila3*/		{65,69,55,29,41},
				};

		for (int [] fila: temperaturas) {
			System.out.println();
			for(int z: fila) {
			System.out.print(z+ " ");
			}
		}
		
		
	}

}
