package ejercicios;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int numero;
		
		Scanner all = new Scanner(System.in);
		
		//Pido al usuario que ponga un número
		
		System.out.println("Introduce un número, se dirá su valor absoluto");
		
		
		//Ese número será su valor	
			
		numero = all.nextInt();
		
		//Con un operador ternario, compruebo si el numero es mayor que cero, si es así,
		//simplemente se pondrá, si no, se multiplica por sí mismo y luego se divide en dos,
		//haciendo que cualquier número negativo se convierta en positivo.
		
		numero = (numero >= 0)? (numero):(numero*(numero/2));
		
		//Se enseña el valor absoluto
		
		System.out.println("El numero absoluto es " + numero);
	

//Cierro scanner

all.close();
}
}