package com.liceolapaz.des.grd;

import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		while(true) {
		menu();
		int op = seleccion();
		while(op<0 || op>3) {
			System.out.println("\nENTRADA INVÁLIDA. ¡Mira que eres gañán!");
			menu();
			op = seleccion();
		}
		switch(op) {
		case 1:
			double euros = pedirCantidad();
			Dolar d = new Dolar(euros);
			double resultado = d.cantidadEnEuros();
			System.out.println("La cantidad en dólares es: "+ resultado);
			break;
		case 2:
			euros = pedirCantidad();
			Libra l = new Libra(euros);
			resultado = l.cantidadEnEuros();
			System.out.println("La cantidad en libras es: "+ resultado);
			break;
		case 3:
			euros = pedirCantidad();
			Yen y = new Yen(euros);
			resultado = y.cantidadEnEuros();
			System.out.println("La cantidad en yenes es: "+ resultado);
			break;
		case 0:
			System.out.println("Cerrando programa...");
			System.exit(0);
			break;
		default:
			System.out.println("GRAN CATÁSTROFE, SEÑOR!!!");
			break;
		}
		}
	}

	private static double pedirCantidad() {
		System.out.print("Introduzca la cantidad de euros a convertir: ");
		Scanner scan = new Scanner (System.in);
        return scan.nextDouble();
		
	}

	private static int seleccion() {
		System.out.print("Elija opción: ");
		Scanner scan = new Scanner (System.in);
        return scan.nextInt();
}

	private static void menu() {
		System.out.println("\nCONVERSOR DE DIVISAS\n" +
				"---------------------\n" +
				"1. Dólares\n" + 
				"2. Libras\n" + 
				"3. Yenes\n" + 
				"0. Salir\n");
	}

}
