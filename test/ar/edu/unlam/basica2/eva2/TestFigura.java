package ar.edu.unlam.basica2.eva2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestFigura {

	@Test
	public void testQueVerificaQueUnaMismaFiguraSePuedaInstanciaTantoComoUnRectangoYTambienComoUncirculo() {

		Figura figura = new Circulo(0, null);

		assertTrue(figura instanceof Circulo);

		figura = new Rectangulo(null, null, null);

		assertTrue(figura instanceof Rectangulo);

	}

}
