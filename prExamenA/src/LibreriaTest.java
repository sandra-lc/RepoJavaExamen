import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class LibreriaTest {

	// Definimos un objeto de tip Libreria
	private Libreria libr;
	
	// Creamos una variable para poder guardar el resultado de las operaciones
	// y poder compararlas.
	private int numero;
	
	// Creamos un objeto de tipo TablaEnteros
	@BeforeEach
	public void creaTalaEnteros() {
		libr = new Libreria(numero);
	}
	
	// Borramos el objeto poniéndolo a null
	@AfterEach
	public void borrarTablaEnteros() {
		libr = null;
	}
	
	
	//-----------------------Casos de prueba de los métodos-----------------------------//
	@Test
	void testEsPrimo() {
		numero = 5;
		assertEquals(true, libr.esPrimo());
		
	}

	@Test
	void testFactorial() {
		
		assertEquals(1, libr.factorial());
	}

}
