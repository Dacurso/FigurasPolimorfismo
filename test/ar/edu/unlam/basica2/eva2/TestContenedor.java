package ar.edu.unlam.basica2.eva2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestContenedor {

	ContenedorFigura contenedor = new ContenedorFigura();
	Rectangulo rectangulo = new Rectangulo(null, null, null);
	Circulo circulo = new Circulo(0, null);

	@Test
	public void testQueSeAgregueUnRectangulo() {

		contenedor.agregar(rectangulo);

		assertTrue(contenedor.obtenerRectangulos().contains(rectangulo));

	}

	@Test
	public void testQueSeAgregueUnCirculo() {

		contenedor.agregar(circulo);

		assertTrue(contenedor.obtenerCirculos().contains(circulo));

	}

	@Test
	public void testQueSeAgregueUnaFigura() {

		Integer valorEsperado = 2;

		contenedor.agregar(rectangulo);
		contenedor.agregar(circulo);
		Integer valorObtenido = contenedor.getListaFiguras().size();

		assertEquals(valorEsperado, valorObtenido);

	}

	@Test
	public void testQueVerificaQueSeObtieneRectangulos() {

		Integer valorEsperado = 1;

		contenedor.agregar(rectangulo);
		contenedor.agregar(circulo);
		Integer valorObtenido = contenedor.obtenerRectangulos().size();

		assertEquals(valorEsperado, valorObtenido);

	}

	@Test
	public void testQueVerificaQueSeObtieneCirculos() {

		Integer valorEsperado = 1;

		contenedor.agregar(rectangulo);
		contenedor.agregar(circulo);
		Integer valorObtenido = contenedor.obtenerCirculos().size();

		assertEquals(valorEsperado, valorObtenido);

	}

	@Test
	public void testQueElPromedioDetodasLasFigurasSeaCorrecto() {

		Rectangulo rectangulo = new Rectangulo(2.0, 2.0, null);
		Circulo circulo = new Circulo(10, null);

		Double valorEsperado = (rectangulo.calcularElArea() + circulo.calcularElArea()) / 2;

		contenedor.agregar(circulo);
		contenedor.agregar(rectangulo);

		Double valorObtenido = contenedor.calcularPromedioDeAreaDeTodasLasFiguras();

		assertEquals(valorEsperado, valorObtenido);

	}

}
