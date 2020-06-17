package ar.edu.unlam.basica2.eva2;

public class Circulo extends Figura {

	private double radio;

	public Circulo(double radio, String color) {
		super(color);
		this.radio = radio;
	}

	@Override
	public Double calcularElArea() {
		Double area = (Math.PI * (this.radio * this.radio));
		return area;
	}

	@Override
	public Double calcularElPerimetro() {
		Double perimetro = 2 * Math.PI * this.radio;
		return perimetro;
	}

	@Override
	public String dibujarFigura() {
		return "Circulo";
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

}
