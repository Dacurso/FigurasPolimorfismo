package ar.edu.unlam.basica2.eva2;

import java.util.ArrayList;
import java.util.LinkedList;

public class ContenedorFigura {

	private ArrayList<Rectangulo> listaRectangulos;
	private LinkedList<Circulo> listaCirculos;
	private ArrayList<Figura> listaFiguras;

	public ContenedorFigura() {
		this.listaCirculos = new LinkedList<Circulo>();
		this.listaRectangulos = new ArrayList<Rectangulo>();
		this.listaFiguras = new ArrayList<Figura>();

	}

	public Boolean agregar(Figura figura) {
		return listaFiguras.add(figura);
	}

	public ArrayList<Rectangulo> obtenerRectangulos() {

		for (Figura figura : listaFiguras) {
			if (figura.dibujarFigura() == "Rectangulo") {
				listaRectangulos.add((Rectangulo) figura);
			}
		}
		return listaRectangulos;

	}

	public LinkedList<Circulo> obtenerCirculos() {

		for (Figura figura : listaFiguras) {
			if (figura.dibujarFigura() == "Circulo") {
				listaCirculos.add((Circulo) figura);
			}

		}

		return listaCirculos;

	}

	public Double calcularPromedioDeAreaDeTodasLasFiguras() {
		Double totalArea = 0.0;
		for (Figura figura : listaFiguras) {
			totalArea += figura.calcularElArea();

		}

		return totalArea / listaFiguras.size();

	}

	public ArrayList<Figura> getListaFiguras() {
		return listaFiguras;
	}

	public void setListaFiguras(ArrayList<Figura> listaFiguras) {
		this.listaFiguras = listaFiguras;
	}

}
