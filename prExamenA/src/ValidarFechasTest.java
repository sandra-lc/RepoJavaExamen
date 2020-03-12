import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ValidarFechasTest {

	
	/**
	 * Pruebas del método fechaCorrecta()
	 */
	@Test
	void testFechaCorrecta1() {
		assertEquals(true, ValidarFechas.fechaCorrecta(12, 03, 2020));
	}
	
	@Test
	void testFechaCorrecta2() {
		assertEquals(false, ValidarFechas.fechaCorrecta(12, -7, 2020));
	}
	
	
	@Test
	void testFechaCorrecta3() {
		assertEquals(false, ValidarFechas.fechaCorrecta(29, 02, 2019));
	}
	
	@Test
	void testFechaCorrecta4() {
		assertEquals(false, ValidarFechas.fechaCorrecta(40, 02, 2019));
	}
	
	
	@Test
	void testVarios() {
		assertAll("Prueba de multiples cosas",
				() -> assertEquals(true, ValidarFechas.fechaCorrecta(12, 03, 2020)),
				() -> assertEquals(false, ValidarFechas.fechaCorrecta(12, -7, 2020)),
				() -> assertEquals(false, ValidarFechas.fechaCorrecta(29, 02, 2019)),
				() -> assertEquals(false, ValidarFechas.fechaCorrecta(40, 02, 2019)));
	}
	
	

}
