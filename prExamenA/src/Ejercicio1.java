

import Lectura.Leer;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int num, mayor, menor;
		
		// Lectura del primer n�mero
		System.out.print("N�mero "); 
		num = Leer.leeInt();
		
		// Inicializo las variables mayor y menor a este primer n�mero
		mayor = num;
		menor = num;
		
		// Leer el resto de n�meros 
		while (num!=0){
			if (num>mayor) 
				mayor=num;
			else 
				if (num<menor)	
					menor=num;
			
			System.out.println("N�mero "); 
			num = Leer.leeInt();
		}
		
		System.out.println("El mayor es "+mayor+" y el menor es "+menor);
	}
}
