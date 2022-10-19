package ejercicios;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creo las variables necesarias
		
		int numero;
		int resto;
		int num1;
		int num2;
		
		//Doy el scanner

		Scanner all = new Scanner(System.in);
		
		//Pido al usuario que introduzca un número entre 0 y 9999.
		
		System.out.println("Introduce un número entre 0 y 9999, se comprobará si es capicúa");
		
		//Lo que introduzca será su valor

		numero = all.nextInt();
		resto = numero;
		
		if (numero < 0 | numero > 9999) {
			
			System.out.println("Introduce sólo un número del 1 al 9999");
		}
		if (numero < 10 && numero > -1) {
			
			System.out.println("El número es capicúa");
		}

		if (numero > 9 && numero < 100) {
			
			numero = numero / 10;
			resto = resto % 10;
			
			if (numero == resto) {
				
				System.out.println("El número es capicúa");
			}
			else {
				
				System.out.println("El número no es capicúa");
				}
				
		}
		
		if (numero > 99 && numero < 1000) {
			
			numero = numero / 100;
			resto = resto % 10;
			
			if (numero == resto) {
				
				System.out.println("El número es capicúa");
			}
			else {
				
				System.out.println("El número no es capicúa");
				}
		}
		
	if (numero > 999 && numero < 10000) {
			
			num2 = numero;
			num1 = numero;
			numero = numero / 1000;
			resto = (resto /100) % 10;
			num2 = num2 % 10;
			num1 = (num1 /10) %10;
			
			
			if (numero == resto) {
				
				System.out.println("El número es capicúa");
			}
			else {
				
				System.out.println("El número no es capicúa");
				}
		}
	//Cierro scanner
	
	all.close();
	}
}
