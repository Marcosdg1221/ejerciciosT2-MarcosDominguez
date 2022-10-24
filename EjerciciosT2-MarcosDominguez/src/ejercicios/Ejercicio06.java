package ejercicios;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Generamos dos variables int; cada uno cogerá un número al azar del 1 al 99, luego habrá otro int para la respuesta.
	
		int uno = (int) ((double)Math.random()*99);
		int dos = (int) ((double)Math.random()*99);
		int respuesta;
		
		//genero scanner.
		
		Scanner all = new Scanner(System.in);
		
		//Pido al usuario que ponga el resultado de la suma.
	
		System.out.print("Haz la suma de estos dos números; " + uno + " + " + dos);
		
		//respuesta guardará ese valor.
		
		respuesta = all.nextInt();
		
		//si la respuesta es igual a las variables uno y dos, la respuesta es correcta, si no, es incorrecta.
		//en ambos casos se le avisará al usuario.
		
		if (uno + dos == respuesta) {
			System.out.print("Respuesta correcta");
		}
		else {
			System.out.print("Respuesta incorrecta");
		}
		//Cierro scanner
		
			all.close();
			
	}
}
