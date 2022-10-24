package ejercicios;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creo las variables necesarias; un int para el número que escriba el usuario
		//Y un string para convertirlo a una palabra.
		int numero;
		String numeros;

		Scanner all = new Scanner(System.in);
	
		//Pido al usuario que ponga un número
		
			System.out.println("Introduce un número del 1 al 99, se leerá en letras");
			
		//Ese número será su valor	
			
			numero = all.nextInt();
			
			//Hago un switch con un módulo, esto me sacará la unidad, del uno al nueve;
			//Por default, hay un espacio, que pretende no ser nada.
			
			switch (numero %10) {
			case 1:
				numeros = "uno";
				break;
			case 2:
				numeros = "dos";
				break;
			case 3:
				numeros = "tres";
				break;
			case 4:
				numeros = "cuatro";
				break;
			case 5:
				numeros = "cinco";
				break;
			case 6:
				numeros = "seis";
				break;
			case 7:
				numeros = "siete";
				break;
			case 8:
				numeros = "ocho";
				break;
			case 9:
				numeros = "nueve";
				break;
			default:
				numeros = " ";
			
			}
			
			
			//Del uno al quince, simplemente es un system.out.print y el número en letras
			//que se escribió, a partir del número 16, se hace lo siguiente;
			//Del 16 al 20, el string será "dieci", del 20 al 29, "venti", del 30 al 39, "treinta y "
			//y así hasta el noventa, si es un número que acaba en cero, directamente el programa
			//escribirá ese número.
			
			if (numero == 1) {
				
				System.out.println("uno");
				
			} 
			else if (numero == 2) {
				
				System.out.println("dos");
				
			} 
			else if (numero == 3) {
				
				System.out.println("tres");
				
			} 	
			else if (numero == 4) {
				
				System.out.println("cuatro");
				
			} 	
			else if (numero == 5) {
				
				System.out.println("cinco");
				
			} 
			else if (numero == 6) {
				
				System.out.println("seis");
				
			} 
			else if (numero == 7) {
				
				System.out.println("siete");
			}
			
			else if (numero == 8) {
				
				System.out.println("ocho");
				
			} 
			else if (numero == 9) {
				
				System.out.println("nueve");
				
			} 
			else if (numero == 10) {
				
				System.out.println("diez");
			}
			else if (numero == 11) {
				
				System.out.println("once");
				
			} 
			else if (numero == 12) {
				
				System.out.println("doce");
				
			} 
			else if (numero == 13) {
				
				System.out.println("trece");
			}
			else if (numero == 14) {
				
				System.out.println("catorce");
				
			} 
			else if (numero == 15) {
				
				System.out.println("catorce");
				
			} 
			else if (numero > 15 && numero < 20) {
				
				System.out.println("dieci" + numeros);
			}
			else if (numero == 20) {
				
				System.out.println("veinte");
			}
			else if (numero > 20 && numero < 30) {
				
				
				System.out.println("venti" + numeros);
			}
			
			else if (numero == 30) {
				
				System.out.println("treinta");
			}
			
			else if (numero > 30 && numero < 40) {
				
				System.out.println("treinta y " + numeros);
			}
			else if (numero == 40) {
				
				System.out.println("cuarenta");
			}
			
			else if (numero > 40 && numero < 50) {
				
				System.out.println("cuarenta y " + numeros);
			
			}
			else if (numero == 50) {
				
				System.out.println("cincuenta");
			}
			
			else if (numero > 50 && numero < 60) {
				
				System.out.println("cincuenta y " + numeros);
			
			}
			else if (numero == 60) {
				
				System.out.println("sesenta");
			}
			else if (numero == 70) {
				
				System.out.println("setenta");
			}
			
			else if (numero > 60 && numero < 70) {
				
				System.out.println("sesenta y " + numeros);
			
			}
			
			else if (numero == 80) {
				
				System.out.println("ochenta");
			}
			
			
			else if (numero > 70 && numero < 80) {
				
				System.out.println("setenta y " + numeros);
			
			}
			else if (numero == 90) {
				
				System.out.println("noventa");
			}
			
			
			else if (numero > 80 && numero < 90) {
				
				System.out.println("ochenta y " + numeros);
			
			}
			else if (numero >90 && numero < 100) {
				
				System.out.println("noventa y " + numeros);
			
			}
			
			//Si ninguna condición se cumple, significa que el usuario no escribió
			//un número del 1 al 99, así que se le avisará de ello.
			
			else  {
				System.out.println("el número sólo puede ser del 1 al 99");
			}
			//Cierro scanner
			
			all.close();
			
	}
}