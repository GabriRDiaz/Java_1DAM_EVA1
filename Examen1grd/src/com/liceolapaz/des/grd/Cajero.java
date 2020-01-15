package com.liceolapaz.des.grd;

import java.util.Scanner;

public class Cajero {
	private static CuentaNormal c1 = null;
	private static CuentaPremium c2 = null;
	public static void main(String[] args) {
		while(true) {
			menuPrincipal();
		}
	}

	private static void menuPrincipal() {
		int op = menuBanco();
		switch(op) {
		case 1:
			menuCuenta();
			op = seleccion();
			switch(op) {
			case 1:
				double saldo = escribaSaldo();
				c1 = new CuentaNormal(saldo);
				menuPrincipal();
				break;
			case 2:
				saldo = escribaSaldo();
				c2 = new CuentaPremium(saldo);
				break;
			case 0:
				menuPrincipal();
				break;
			default:
				entradaInvalida();
			}
			break;
		case 2:
			if(c1 == null && c2 == null) {
				System.out.println("\nError: No existe ninguna cuenta bancaria");
			}else if(c2 == null){
				double cantidad = operacionBancaria();
				c1.ingresarDinero(cantidad);
				menuPrincipal();
			}else if(c1 == null) {
				double cantidad = operacionBancaria();
				c2.ingresarDinero(cantidad);
				menuPrincipal();
			}
			break;
		case 3:
			if(c1 == null && c2 == null) {
				System.out.println("\nError: No existe ninguna cuenta bancaria");
			}else if(c2 == null){
				double cantidad = operacionBancaria();
				if(cantidad>c1.consultarSaldo()) {
					System.out.println("Error. Saldo insuficiente");
					menuPrincipal();
				}else {
					c1.retirarDinero(cantidad);
					menuPrincipal();
				}
			}else if(c1 == null) {
				double cantidad = operacionBancaria();
				c2.retirarDinero(cantidad);
				menuPrincipal();
			}
			break;
		case 4:
			if(c1 == null && c2 == null) {
				System.out.println("\nError: No existe ninguna cuenta bancaria");
			}else if(c2 == null){
				System.out.println("\nSu saldo es: "+c1.consultarSaldo());
				menuPrincipal();
			}else if(c1 == null) {
				System.out.println("\nSu saldo es: "+c2.consultarSaldo());
				menuPrincipal();
			}
			break;
		case 0:
			System.out.println("\nCerrando programa...");
			System.exit(0);
			break;
		default:
			entradaInvalida();
		}
		
	}

	private static double operacionBancaria() {
		System.out.print("\nIntroduzca cantidad: ");
		Scanner scan = new Scanner(System.in);
		return scan.nextDouble();
	}

	private static double escribaSaldo() {
		System.out.print("\nEscriba el saldo inicial: ");
		return meterSaldo();
	}

	private static double meterSaldo() {
		Scanner scan = new Scanner (System.in);
        return scan.nextInt();
	}

	private static void entradaInvalida() {
		System.out.println("\nEntrada inválida.");
		menuPrincipal();
	}

	private static void menuCuenta() {
		System.out.println("\nTipo de cuenta\n" + 
				"1. Cuenta normal\n" + 
				"2. Cuenta premium\n" + 
				"0. Cancelar");
	}

	private static int seleccion() {
		System.out.print("\nEscoja una opción: ");
		Scanner scan = new Scanner (System.in);
        return scan.nextInt();
	}

	private static int menuBanco() {
		System.out.println("\nBANCO\n" + 
				"1. Crear cuenta\n" + 
				"2. Ingresar dinero\n" + 
				"3. Retirar dinero\n" + 
				"4. Consultar saldo\n" + 
				"0. Salir");
		return seleccion();
	}

}
