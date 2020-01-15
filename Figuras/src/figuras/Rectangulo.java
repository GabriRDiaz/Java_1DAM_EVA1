package figuras;

public class Rectangulo extends FiguraGeo {

	private double base;
	private double altura;

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double calcularArea() {
		return base*altura;
	}

	public double calcularPerimetro() {
		return (2*base)+(2*altura);
	}
}
