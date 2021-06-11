package pucese.edu.unidad1;

public class Conversion {

	public static void main(String[] args) {
		//conversiones entre cadenas y tipos primitivos 
		//integer double float character
		//String
		//toString doubleValue
		//parint parseFloat
		//valueOf
		System.out.println(Integer.toString(55,2));
		int x = Integer.parseInt("75");
		System.out.println(x);
		Double y = Double.valueOf("3.14").doubleValue();
		System.out.println(y);
				
		//string a integer
				
		Integer a = Integer.valueOf("900");
		Integer b = Integer.parseInt("900");
				
		System.out.println(a);
				
		String cadena = Integer.toString(a);
		String cadena1 = String.valueOf(a);
		System.out.println(cadena);

	}

}
