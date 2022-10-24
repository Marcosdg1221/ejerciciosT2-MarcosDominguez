package ejercicios;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creo tres variables int; una para el segundo, otra para el minuto y otra para la hora.
		
		int segundo;
		int minuto;
		int hora;
		
		//Genero el scanner
		
		Scanner all = new Scanner(System.in);
		
		//Pido la hora, minuto y segundo, y sus variables respectivas guardarán ese valor.
		
		System.out.print("Introduce la hora");
		hora = all.nextInt();
		System.out.print("Introduce el minuto");
		minuto = all.nextInt();
		System.out.print("Introduce el segundo");
		segundo = all.nextInt();
		
		//si el segundo es menor que 59, entonces simplemente se enseña al usuario la hora más un segundo.
		
		if (segundo < 59) {
		  segundo = segundo + 1;
		  System.out.print("La hora es "+ hora + ":" + minuto + ":" + segundo);
		}
		
		//si no y el minuto es menor que 59, sumo uno al minuto y pongo 00 en el segundo y se lo muestro al usuario.
		
		else if (minuto < 59) {
			
				 System.out.print("La hora es "+ hora + ":" + (minuto + 1) + ":" + "00");
			}
		
		//si no y la hora es menor que 23, sumo uno a la hora y pongo 00 al segundo y al minuto, muestro al usuario la hora.
			
		else if (minuto == 59 && hora < 23) {
				 System.out.print("La hora es "+ (hora+1) + ":" + "00" + ":" + "00");
			}
			
		//si la hora es igual a 23 y no se cumple nada de lo anterior, entonces la hora será las 12 de la noche, le enseño la hora al usuario.
		
		else if (hora == 23){
				System.out.print("La hora es 00" + ":" + "00" + ":" + "00");
				
		}
		
		//Si la hora es menor que veintitrés, sumo uno a la hora y pongo 00 al segundo y al minuto, muestro al usuario la hora.
		
		else if (hora < 23){
				System.out.print("La hora es " + (hora+1) + ":" + "00" + ":" + "00");
			}
		//Cierro scanner
		
				all.close();
		}
}