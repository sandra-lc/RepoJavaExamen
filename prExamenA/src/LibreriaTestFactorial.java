import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

public class LibreriaTestFactorial {

	/**
	 * Variables de instancia
	 */
	private int numero;
	private long resul;
	
	
	/**
	 * Constructor
	 * @param numero
	 * @param resultado
	 */
	public LibreriaTestFactorial(int numero, long resul) {
		
		this.numero = numero;
		this.resul = resul;
	}
	
	
	/**
	 * Parámetros
	 * @return
	 */
	@Parameters
	public static Collection<Object[]> numeros() {
		return Arrays.asList(new Object[][] {
			{5, 120},
			{12, 4526874},
			{20, 4572154},
			{15, 8945245}});
		
	} 
	
	
	/**
	 * Caso de prueba del método sumaElementos
	 */
	@Test
	public void testEsPrimo() {
		Libreria libr = new Libreria(numero);
		long resultado = libr.factorial();
		assertEquals(resul, resultado);
	}

}
