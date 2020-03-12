

import Lectura.Leer;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int num, mayor, menor;
		
		// Lectura del primer número
		System.out.print("Número "); 
		num = Leer.leeInt();
		
		// Inicializo las variables mayor y menor a este primer número
		mayor = num;
		menor = num;
		
		// Leer el resto de números 
		while (num!=0){
			if (num>mayor) 
				mayor=num;
			else 
				if (num<menor)	
					menor=num;
			
			System.out.println("Número "); 
			num = Leer.leeInt();
		}
		
		System.out.println("El mayor es "+mayor+" y el menor es "+menor);
	}
}
