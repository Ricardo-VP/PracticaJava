package pucese.edu.unidad1;

public class SwitchSeleccionMultiple {

	public static void main(String[] args) {
		byte numeroMes = 4;
		
		if(numeroMes >= 1 && numeroMes <=12) {
			switch(numeroMes) {
			case 1:

			case 4:
				break;
			case 11: 
				System.out.println("x");
			}//Fin switch
		}else {
			System.out.println("Número del mes incorrecto");
		}//Fin if
		
	}

}
