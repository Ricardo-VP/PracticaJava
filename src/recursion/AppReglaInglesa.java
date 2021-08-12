package recursion;

public class AppReglaInglesa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		drawRuler(5, 5);
	
	}
	//dibujar lineas
	private static void drawLine(int tickLength) { 
		  drawLine(tickLength, -1);
	 }
	//dibujar lineas completas
	private static void drawLine(int tickLength, int tickLabel) { 
		  for (int j = 0; j < tickLength; j++)
	 System.out.print("-");
	 if (tickLabel >= 0)
	 System.out.print(" " + tickLabel);
	 System.out.print("\n");
	 } 
	
	//dibbujar intervalos

	private static void drawInterval(int centralLength) { 
		 if (centralLength >= 1) { 
	 drawInterval(centralLength - 1); //recursion para los intervalos
	 drawLine(centralLength); //dibujar las lineas centrales pequeñas
	 drawInterval(centralLength -1); //dibjar los otros vaores del intervalo
	 } 
	}
	//dibjar la regla 
		 
		 public static void drawRuler(int nInches, int majorLength) {
			 drawLine(majorLength, 0);  //dibujar las pulgadas y el numero principal
		 for (int j = 1; j <= nInches; j++) { 
				//dibjar los valores internos de los numeros
			 drawInterval(majorLength - 1); 
			//dibjar las lineas de las pulgadas
			 drawLine(majorLength, j); 
		 } 
		  } 
		 
	
	

}