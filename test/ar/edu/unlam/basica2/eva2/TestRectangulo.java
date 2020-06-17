package ar.edu.unlam.basica2.eva2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestRectangulo {

	// Desarrolle Todos Los test para verificar el correcto funcionamiento de Un
	// Rectangulo

	Rectangulo rectangulo = new Rectangulo(2.0, 2.0, "rojo");

	@Test
	public void testQueCalculeElAreaCorrectamente() {

		Double resObtenido = rectangulo.calcularElArea();
		Double resEsperado = 4.0;

		assertEquals(resEsperado, resObtenido);

	}

	@Test
	public void testQueCalculeElPerimetroCorrectamente() {

		Double resObtenido = rectangulo.calcularElPerimetro();
		Double resEsperado = 8.0;

		assertEquals(resEsperado, resObtenido);

	}

	@Test
	public void testQueVerifiqueQueLaFiguraEsUnRectangulo() {
		Boolean esRectangulo = null;

		if (rectangulo.dibujarFigura() == "Rectangulo") {
			esRectangulo = true;
		}

		assertTrue(esRectangulo);

	}

}
