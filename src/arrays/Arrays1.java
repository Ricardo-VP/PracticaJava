package arrays;

public class Arrays1 {

	public static void main(String[] args) {
		/*int[] miMatriz = new int[5];
		miMatriz[0]=5;
		miMatriz[1]=38;
		miMatriz[2]=15;
		miMatriz[3]=92;
		miMatriz[4]=71;
		
		//otra forma de declar un array
		int[] miMatriz1={5,38,18,92,71};
		
		System.out.println(miMatriz[1]);
		//recorrer arrays
		for(int i =0;i<miMatriz.length;i++)
		{
			System.out.println("el valor del indice i " + i + " " + miMatriz[i]);
		}
*/
		
		//otro ejercicion de arrays con recorrido de for each
	
		String[] miMatrizPaises = {"ecuador","peru","colombia","brasil","uruguay","venezuela"};
		for (String cualquierVariable:miMatrizPaises) {
			System.out.println("pais + " + cualquierVariable);
		}
		
		//otro ejercicio de arrays con recorrido de for each para sumarlos
		int[] miMatriz1={5,38,18,92,71};
		int total = 0;
		
		for(int suma:miMatriz1)
			total += suma;
		
		System.out.println("el total sumado es: " + total);
		
		//otro ejercicio: PASO DE ARREGLOS A LOS METODOS
		int array[] = {3,1,4,8,2};
		
		//pasar array a un metodo
		suma(array);
		
		//obtener array desde un metodo
		int array2[] = matriz1();
		for(int i:array2)
			System.out.println("datos: " + i);
		
	}
	public static int[] matriz1() {
			
		//retonral un array
		return new int[] {1,3,5,8,7,1};
	}
	
	public static void suma(int [] arr) {
		//sumar
		int suma =0;
		//recorre el argumento tipo array
		for(int ar:arr) {
			suma+= ar;
		}
		System.out.println("suma de array: " + suma);
		
	}

}