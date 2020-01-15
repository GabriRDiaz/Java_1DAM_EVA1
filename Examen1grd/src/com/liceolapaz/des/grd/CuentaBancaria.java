package com.liceolapaz.des.grd;

public abstract class CuentaBancaria {
	public abstract void ingresarDinero(double cantidad);
	public abstract void retirarDinero(double cantidad);
	public abstract double consultarSaldo();
}
