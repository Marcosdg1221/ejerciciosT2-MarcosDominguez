package ejercicios;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creo las variables necesarias
		
		int letra;
		int num;
		
		//Doy el scanner

		Scanner all = new Scanner(System.in);
	
		//Pido al usuario que ponga un DNI (un número de 8 cifras)
		
			System.out.println("Introduce tu DNI sin letra, tranquilo, no estamos grabando");
			letra = all.nextInt();
			
			num = letra % 23;
			
			switch (letra){
			
			case 0:
				System.out.println("Tu letra es T");
			break;
			case 1:
				System.out.println("Tu letra es R");
				break;
			case 2:
				System.out.println("Tu letra es W");
				break;
			case 3:
				System.out.println("Tu letra es A");
				break;
			case 4:
				System.out.println("Tu letra es M");
				break;
			case 5:
				System.out.println("Tu letra es Y");
				break;
			case 6:
				System.out.println("Tu letra es F");
				break;
			case 7:
				System.out.println("Tu letra es P");
				break;
			case 8:
				System.out.println("Tu letra es D");
				break;
			case 9:
				System.out.println("Tu letra es X");
				break;
			case 10:
				System.out.println("Tu letra es B");
				break;
			case 11:
				System.out.println("Tu letra es N");
				break;
			case 12:
				System.out.println("Tu letra es J");
				break;
			case 13:
				System.out.println("Tu letra es Z");
				break;
			case 14:
				System.out.println("Tu letra es S");
				break;
			case 15:
				System.out.println("Tu letra es Q");
				break;
			case 16:
				System.out.println("Tu letra es V");
				break;
			case 17:
				System.out.println("Tu letra es H");
				break;
			case 18:
				System.out.println("Tu letra es L");
				break;
			case 19:
				System.out.println("Tu letra es C");
				break;
			case 20:
				System.out.println("Tu letra es G");
				break;
			case 21:
				System.out.println("Tu letra es K");
				break;
			case 22:
				System.out.println("Tu letra es E");
				break;

	}	
}
}
