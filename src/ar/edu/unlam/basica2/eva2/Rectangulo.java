package ar.edu.unlam.basica2.eva2;

public class Rectangulo extends Figura {

	private Double ladoA;
	private Double ladoB;

	public Rectangulo(Double ladoA, Double ladoB, String color) {
		super(color);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}

	@Override
	public Double calcularElArea() {
		Double area = this.ladoA * this.ladoB;
		return area;
	}

	@Override
	public Double calcularElPerimetro() {
		Double perimetro = this.ladoA * 2 + this.ladoB * 2;
		return perimetro;
	}

	@Override
	public String dibujarFigura() {
		return "Rectangulo";
	}

	public Double getLadoA() {
		return ladoA;
	}

	public void setLadoA(Double ladoA) {
		this.ladoA = ladoA;
	}

	public Double getLadoB() {
		return ladoB;
	}

	public void setLadoB(Double ladoB) {
		this.ladoB = ladoB;
	}

}
