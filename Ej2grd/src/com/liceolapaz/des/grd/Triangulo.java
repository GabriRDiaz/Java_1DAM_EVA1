package com.liceolapaz.des.grd;

public class Triangulo extends FiguraGeometrica {
	private double l1;
	private double l2;
	private double l3;
	private double altura;
	public Triangulo(double l1, double l2, double l3, double altura){
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		this.altura = altura;
	}
	public Triangulo(double l2, double altura) {
		this.l2 = l2;
		this.altura = altura;
	}
	public Triangulo(double l1, double l2, double l3) {
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	}
	public double calcularArea() {
		return (l2*altura)/2;

	}

	public double calcularPerimetro() {
		return l1+l2+l3;
	}
}
