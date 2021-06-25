package figuras;

public class figuras {

	public static void main(String[] args) {
		// Bucle exterior 5 veces
		// Bucle interno imprimir 10 numeros de esas veces
		// Total de 50 numeros impresos
		
		/*for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=10; j++) {
				System.out.print((i*j) + " ");
			}
			System.out.println();
		}*/
		
		
		// Dibujar un cuadrado
		/*for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=5; j++) {
					System.out.print(" * ");
				}
			System.out.println();
			}*/
		
		// Dibujar la mitad de un triangulo
		/*for(int i = 1; i<=6; i++) {
			//System.out.println("i:-"+i);
			for(int j = 1; j<=i; j++) {
				System.out.print(" *");
				}
			System.out.println();
			}*/
		
		for(int i = 1; i<=5; i++) {
			for(int j = 4; j>=i;j--) {
				System.out.print(".");
			}
			System.out.print(i);
			for(int x = 2; x<=i; x++) {
				System.out.print(".");
			}
			System.out.println();
		}
		
		
	}

}
