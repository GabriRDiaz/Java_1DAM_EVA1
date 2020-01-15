package com.liceolapaz.des.grd;

public class Libra implements Moneda {
	private double cantidad;
	public Libra(double cantidad) {
		this.cantidad = cantidad;
	}
	public double cantidadEnEuros() {

		return cantidad * 1.1029861;
	}
}