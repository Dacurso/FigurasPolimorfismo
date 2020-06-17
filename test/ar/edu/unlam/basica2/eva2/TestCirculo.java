package ar.edu.unlam.basica2.eva2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestCirculo {
	// Desarrolle Todos Los test para verificar el correcto funcionamiento de Un
	// circulo

	Circulo circulo = new Circulo(5, null);

	@Test
	public void testQueCalculeElAreaCorrectamente() {

		Double resEsperado = Math.PI * Math.pow(circulo.getRadio(), 2);
		Double resObtenido = circulo.calcularElArea();

		assertEquals(resEsperado, resObtenido);

	}

	@Test
	public void testQueCalculeElPerimetroCorrectamente() {

		Double resEsperado = 2 * Math.PI * circulo.getRadio();
		Double resObtenido = circulo.calcularElPerimetro();

		assertEquals(resEsperado, resObtenido);

	}

	@Test
	public void testQueVerifiqueQueLaFiguraEsUnRectangulo() {
		Boolean esCirculo = null;

		if (circulo.dibujarFigura() == "Circulo") {
			esCirculo = true;
		}

		assertTrue(esCirculo);

	}
}
