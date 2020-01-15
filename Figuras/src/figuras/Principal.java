package figuras;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	int op1;
	menu();
	op1 = scanner();
	switch(op1) {
	case 0: 
		System.out.println("Cerrando programa...");
		System.exit(0);
		break;
	case 1:
		double altura;
		double base;
		System.out.print("Introduzca altura: ");
		altura = scannerDouble();
		System.out.print("Introduzca base: ");
		base = scannerDouble();
		Triangulo t1 = new Triangulo(base, altura);
		double area = t1.calcularArea();
		double perimetro = t1.calcularPerimetro();
		System.out.println("\nÁrea: " + area);
		System.out.println("Perímetro: " + perimetro);
		break;
	case 2:
		break;
	case 3:
		break;
	case 4:
		break;
	default:
		System.out.println("Usuario gañán. Cerrando programa...");
		System.exit(0);
		break;
	}
	}

	private static double scannerDouble() {
		Scanner scan = new Scanner (System.in);
        return scan.nextDouble();
	}

	private static int scanner() {
		Scanner scan = new Scanner (System.in);
        return scan.nextInt();
	}

	private static void menu() {
		System.out.print("\n\nFIGURAS GEOMÉTRICAS\n" + 
				"1. Triángulo\n" + 
				"2. Rectángulo\n" + 
				"3. Cuadrado\n" + 
				"4. Pentágono\n" + 
				"0. Salir\n" +
				"Elija opción: ");
	}

}
