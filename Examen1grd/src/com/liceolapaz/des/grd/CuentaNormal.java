package com.liceolapaz.des.grd;

public class CuentaNormal extends CuentaBancaria {
	private double saldo;
	
	public CuentaNormal(double saldo) {
		this.saldo = saldo;
	}
	
	public void ingresarDinero(double cantidad) {
		if(cantidad<0) {
			System.out.println("\nCantidad inválida");
		}else {
		saldo = saldo + cantidad;
		System.out.println("\nIngresando dinero...");
	}
	}

	public void retirarDinero(double cantidad) {
		if(cantidad<0) {
			System.out.println("\nCantidad inválida");
		}else {
		saldo = saldo - cantidad;
		System.out.println("\nRetirando dinero...");
		}
	}

	public double consultarSaldo() {
		return saldo;
	}

}
