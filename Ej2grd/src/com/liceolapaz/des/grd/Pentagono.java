package com.liceolapaz.des.grd;

public class Pentagono extends FiguraGeometrica {
	private double lado;
	private double apotema;
	public Pentagono(double apotema, double lado) {
		this.lado = lado;
		this.apotema = apotema;
	}
	public Pentagono(double lado) {
		this.lado = lado;
	}
	public double calcularArea() {
		return ((lado*5)*apotema)/2;
	}
	public double calcularPerimetro() {
		return (lado*5);
	}
}
