import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;


public class LibreriaTestPrimo {

	/**
	 * Variables de instancia
	 */
	private int numero;
	private boolean resul;
	
	
	/**
	 * Constructor
	 * @param numero
	 * @param resultado
	 */
	public LibreriaTestPrimo(int numero, boolean resul) {
		
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
			{5, true},
			{12, false},
			{20, true},
			{15, false}});
		
	} 
	
	
	/**
	 * Caso de prueba del método sumaElementos
	 */
	@Test
	public void testEsPrimo() {
		Libreria libr = new Libreria(numero);
		boolean resultado = libr.esPrimo();
		assertEquals(resul, resultado);
	}

}
