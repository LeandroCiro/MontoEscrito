import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMontoEscrito {

	@Test
	void testnumeroletraUnidades() {
		MontoEscrito1 converter = new MontoEscrito1 ();
		String esperado = "Dos"; 
		String obtenido = converter.numeroletra(2);
		assertEquals(esperado, obtenido);
	}


	@Test
	void testnumeroletraDecenas() {
		MontoEscrito1 converter = new MontoEscrito1 ();
		String esperado = "Diez y Nueve"; 
		String obtenido = converter.numeroletra(19);
		assertEquals(esperado, obtenido);
	}

	@Test
	void testnumeroletraCentenas() {
		MontoEscrito1 converter = new MontoEscrito1 ();
		String esperado = "Cuatrocientos Tres"; 
		String obtenido = converter.numeroletra(403);
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void testnumeroletraMiles() {
		MontoEscrito1 converter = new MontoEscrito1 ();
		String esperado = "Mil Ciento Cuarenta y Ocho"; 
		String obtenido = converter.numeroletra(1148);
		assertEquals(esperado, obtenido);
	}
}