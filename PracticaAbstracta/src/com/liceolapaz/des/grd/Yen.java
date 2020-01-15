package com.liceolapaz.des.grd;

public class Yen extends Moneda {
	private double cantidad;
	
	public Yen(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public double cantidadEnEuros() {
		return cantidad * 0.00779327499;
	}

}