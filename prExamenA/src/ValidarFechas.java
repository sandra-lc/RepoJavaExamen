public class ValidarFechas {

	/**
	 * Un año es bisiesto si es múltiplo de 4 (p.e. 1988), excepto 
	 * los múltiplos de 100 que no son bisiestos (p. e. 1800), 
	 * salvo los múltiplos de 400 que si lo son (p. e. 2000).
	 * @param año
	 * @return true o false
	 */
	public static boolean esBisiesto(int año)
	{
		return (año%4==0) && ((año%100!=0) || (año%400==0));
	}
	
	
	/**
	 * Comprueba si una fecha es correcta o no
	 * @param dia
	 * @param mes
	 * @param año
	 * @return true o false
	 */
	public static boolean fechaCorrecta(int dia, int mes, int año)
	{
		int topeDia=0;
		
		// Valido el año
		if ((año<1000) || (año>3000)) return false;
		
		// Valido el mes
		if ((mes<1) || (mes>12)) return false;
		
		// Averiguo el número máximo de días para ese mes
		if (mes==2) {
			if (esBisiesto(año)) topeDia=29; else topeDia=28;
		}
		else {
			if ((mes==4) || (mes==6) || (mes==9) || (mes==11)) 
				topeDia=30;
			else
				topeDia=31;
		}
		
		// Valido el día
		if ((dia>0) && (dia<=topeDia)) return true; else return false;
	}
}
