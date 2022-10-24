package ejercicios;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pongo como double la variable distancia y como int los días.
	
		double distancia;
		int dias;
		
		//doy scanner
		
		Scanner all = new Scanner(System.in);
		
		//Pido la distancia y los días al usuario, lo que ponga será el valor de esas variables.
		
		System.out.print("Escriba la distancia en km que tenga su viaje");
		distancia = all.nextInt();
		System.out.print("Escriba los días que va a tener su viaje");
		dias = all.nextInt();
		
		//si los días superan los seis, y la distancia es igual o mayor a 700, entonces
		//la distancia se multiplicará por 2,5, que es el precio total, y luego se le restará
		//ese número menos ese número multiplicado por treinta y dividido entre 100, eso es con el descuento.
		
		if (dias > 6){
			if (distancia >= 700) {
				
				distancia = distancia * 2.5;
				
				distancia = distancia - ((distancia * 30) / 100);
				
				//Muestro el precio al usuario
				
				System.out.print("El precio del viaje es " + distancia + " €");
			}
			
			//Si los días son menores a siete, no se aplicará la oferta y le muestro al usuario el precio.
			
		else {
			
			distancia = distancia * 2.5;
			
				System.out.print("El precio del viaje es " + distancia + " €");
				}
		}
		
		//Si no se cumple lo que se dijo, no se aplicará la oferta y le muestro al usuario el precio.
		
		else {
			
			distancia = distancia * 2.5;
			System.out.print("El precio del viaje es " + distancia + " €");
			}
		//Cierro scanner
		
		all.close();
		
	}
}
