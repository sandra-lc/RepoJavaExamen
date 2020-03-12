public class ValidarFechas {

	/**
	 * Un a�o es bisiesto si es m�ltiplo de 4 (p.e. 1988), excepto 
	 * los m�ltiplos de 100 que no son bisiestos (p. e. 1800), 
	 * salvo los m�ltiplos de 400 que si lo son (p. e. 2000).
	 * @param a�o
	 * @return true o false
	 */
	public static boolean esBisiesto(int a�o)
	{
		return (a�o%4==0) && ((a�o%100!=0) || (a�o%400==0));
	}
	
	
	/**
	 * Comprueba si una fecha es correcta o no
	 * @param dia
	 * @param mes
	 * @param a�o
	 * @return true o false
	 */
	public static boolean fechaCorrecta(int dia, int mes, int a�o)
	{
		int topeDia=0;
		
		// Valido el a�o
		if ((a�o<1000) || (a�o>3000)) return false;
		
		// Valido el mes
		if ((mes<1) || (mes>12)) return false;
		
		// Averiguo el n�mero m�ximo de d�as para ese mes
		if (mes==2) {
			if (esBisiesto(a�o)) topeDia=29; else topeDia=28;
		}
		else {
			if ((mes==4) || (mes==6) || (mes==9) || (mes==11)) 
				topeDia=30;
			else
				topeDia=31;
		}
		
		// Valido el d�a
		if ((dia>0) && (dia<=topeDia)) return true; else return false;
	}
}
