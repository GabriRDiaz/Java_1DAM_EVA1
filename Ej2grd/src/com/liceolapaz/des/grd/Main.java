package com.liceolapaz.des.grd;

import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		while(true) {
		menu();
		int op = seleccion();
		int op2 = 0;
		switch(op) {
		case 1:
			menu2();
			op2 = seleccion();
			double l1;
			double l2;
			double l3;
			switch(op2) {
				case 1:
					System.out.print("Introduce base (lado 2): ");
					l2 = datos();
					System.out.print("Introduce altura: ");
					double altura = datos();
					Triangulo t1 = new Triangulo(l2,altura);
					double area = t1.calcularArea();
					System.out.print("El valor del área es: " + area);
					break;
				case 2:
					System.out.print("Introduce lado 1: ");
					l1 = datos();
					System.out.print("Introduce base (lado 2): ");
					l2 = datos();
					System.out.print("Introduce lado 3: ");
					l3 = datos();
					Triangulo t2 = new Triangulo(l1,l2,l3);
					double perimetro = t2.calcularPerimetro();
					System.out.print("El valor del perímetro es: "+ perimetro);
					break;
				default:
					System.out.println("Cerrando programa...");
					System.exit(0);
			}
			break;
		case 2:
			menu2();
			op2 = seleccion();
			double base = 0;
			double altura = 0;
			switch(op2) {
			case 1:
				System.out.print("Introduce la base: ");
				base = datos();
				System.out.print("Introduce la altura: ");
				altura = datos();
				Rectangulo r1 = new Rectangulo(base,altura);
				double area = r1.calcularArea();
				System.out.print("El valor del area es: "+ area);
				break;
			case 2:
				System.out.print("Introduce la base: ");
				base = datos();
				System.out.print("Introduce la altura: ");
				altura = datos();
				Rectangulo r2 = new Rectangulo(base,altura);
				double perimetro = r2.calcularPerimetro();
				System.out.print("El valor del perímetro es: "+ perimetro);
				break;
			}
			break;
		case 3:
			menu2();
			op2 = seleccion();
			double ladoC;
			switch(op2) {
			case 1:
				System.out.print("Introduce lado: ");
				ladoC = datos();
				Cuadrado c1 = new Cuadrado(ladoC);
				double area = c1.calcularArea();
				System.out.print("El valor del area es: "+ area);
				break;
			case 2:
				System.out.print("Introduce lado: ");
				ladoC = datos();
				Cuadrado c2 = new Cuadrado(ladoC);
				double perimetro = c2.calcularPerimetro();
				System.out.print("El valor del area es: "+ perimetro);
				break;
			}
			break;
		case 4:
			menu2();
			op2 = seleccion();
			double lado;
			double apotema;
			switch(op2){
			case 1:
				System.out.print("Introduce el valor del lado: ");
				lado = datos();
				System.out.print("Introduce apotema: ");
				apotema = datos();
				Pentagono p1 = new Pentagono(lado,apotema);
				double area = p1.calcularArea();
				System.out.print("El valor del área es: " + area);
				break;
			case 2:
				System.out.print("Introduce el valor del lado: ");
				lado = datos();
				Pentagono p2 = new Pentagono(lado);
				double perimetro = p2.calcularPerimetro();
				System.out.print("El valor del perímetro es: " + perimetro);
				break;
			default:
				System.out.println("Cerrando programa...");
				System.exit(0);
				break;
			}
			break;
		default:
			System.out.println("Cerrando programa...");
			System.exit(0);
		}
	}
	}
	private static double datos() {
		Scanner scan = new Scanner(System.in);
		return scan.nextDouble();
	}

	private static void menu2() {
		System.out.println("\nELIJA OPCIÓN:\n"
				+ "1. Calcular área\n"
				+ "2. Calcular perímetro\n"
				+ "0. Salir");
	}

	private static int seleccion() {
		System.out.print("Elija opción: ");
		Scanner scan = new Scanner (System.in);
        int op = scan.nextInt();
        return op;
}

	private static void menu() {
		System.out.println("\n\nFIGURAS GEOMÉTRICAS\n" + 
				"1. Triángulo\n" + 
				"2. Rectángulo\n" + 
				"3. Cuadrado\n" + 
				"4. Pentágono\n" + 
				"0. Salir");
	}

}
