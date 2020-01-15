package figuras;

public class Triangulo extends FiguraGeo {
	private double base;
	private double altura;
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public Triangulo(double base) {
		this.base = base;
	}

	public double calcularArea() {
		return (base*altura)/2;
	}

	public double calcularPerimetro() {
		return base*3;
	}

}
