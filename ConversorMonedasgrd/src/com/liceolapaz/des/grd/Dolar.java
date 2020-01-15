package com.liceolapaz.des.grd;

public class Dolar implements Moneda {
	private double cantidad;
	public Dolar(double cantidad) {
		this.cantidad = cantidad;
	}
	public double cantidadEnEuros() {

		return cantidad * 0.883509299;
	}
}
