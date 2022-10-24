package ejercicios;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio03 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creo las variables necesarias; tres int para el número que escriba el usuario sin que tengan comas
		//y un double para la ración que corresponde a cada animal.
		
		int cantidad;
		int kilos;
		int animales;
		double racion;
		
		//Doy el scanner
		
		Scanner all = new Scanner(System.in);

		//Pido al usuario que ponga un la cantidad de comida
		
	
	System.out.println("Introduce la cantidad de comida comprada (en kg)");
	
	//Pongo el valor en la variable "cantidad"
	
	cantidad = all.nextInt();
	
	//Pido al usuario que ponga los números de animales
	
	System.out.println("Introduce los números de animales");
	
	//Pongo el valor en la variable "animales"
	
	animales = all.nextInt();
	
	//Pido al usuario que ponga los kilos
	
	System.out.println("Introduce los kilos de comida que comen");
	
	//los kilos será lo que ponga el usuario
	
	kilos = all.nextInt();
	
	//Si los kilos por los animales superan la cantidad, racion dividirá la cantidad entre los animales,
	//y esa será la ración que corresponda a cada animal, le aviso al usuario.
	
	if((kilos * animales) > cantidad) {
		
		racion = cantidad / animales;
		
		System.out.println("No hay cantidad suficiente, hay que hacer raciones más pequeñas de " + racion + " kg");
		
	}
	
	//si no y es superior, se avisará de que hay comida suficiente.
	
	else if ((kilos * animales) < cantidad) {
		
		
		
		racion = kilos / cantidad;
		
		
		System.out.println("Hay cantidad más que suficiente para cada animal");
	}
	
	//Si es igual, se avisará al usuario
	
	else {
		
		System.out.println("Tenemos la cantidad justa de comida para cada animal");
		
	}
	//Cierro scanner
	
		all.close();
	
	}
}