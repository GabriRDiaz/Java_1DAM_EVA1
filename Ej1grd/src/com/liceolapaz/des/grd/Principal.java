package com.liceolapaz.des.grd;

import java.util.Random;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		while(true) {
		escribirMenu();
		int op1 = pedirOpcion();
		while(op1>1 || op1<0) {
			System.out.println(op1 + " no es ni 0 ni 1. Gañán.");
			System.out.print("Introduzca una opción válida: ");
			op1 = pedirOpcion();
		}
		if(op1==1) {
			int cpu = generarJugada();
			elijaJugada();
			String jugada = leerJugada();
			while (!jugada.equals("Spock") && !jugada.equals("Lagarto") && !jugada.equals("Tijera") && !jugada.equals("Papel") && !jugada.equals("Piedra") && !jugada.equals("spock") && !jugada.equals("lagarto") && !jugada.equals("tijera") && !jugada.equals("papel") && !jugada.equals("piedra")) {
				elijaJugadaError();
				jugada = leerJugada();
			}
			switch (jugada) {
			case "Tijera":
				switch (cpu) {
				//0- Tijera 1- Papel 2- Piedra 3-Spock 4-Lagarto
				case 0:
					System.out.println("Empate. CPU había jugado tijera");
					break;
				case 1:
					System.out.println("Victoria. CPU había jugado papel");
					break;
				case 2:
					System.out.println("Derrota. CPU había jugado piedra");
					break;
				case 3:
					System.out.println("Derrota. CPU había jugado tijera");
					break;
				case 4:
					System.out.println("Derrota. CPU había jugado lagarto");
					break;
				default:
					System.out.println("Error");
					break;
				}
			case "tijera":
				switch (cpu) {
				case 0:
					System.out.println("Empate. CPU había jugado tijera");
					break;
				case 1:
					System.out.println("Victoria. CPU había jugado papel");
					break;
				case 2:
					System.out.println("Derrota. CPU había jugado piedra");
					break;
				case 3:
					System.out.println("Derrota. CPU había jugado tijera");
					break;
				case 4:
					System.out.println("Derrota. CPU había jugado lagarto");
					break;
				default:
					System.out.println("Error");
					break;
				}
				break;
			case "Spock":
				switch(cpu) {
			case 0:
				System.out.println("Victoria. CPU había jugado tijera");
				break;
			case 1:
				System.out.println("Derrota. CPU había jugado papel");
				break;
			case 2:
				System.out.println("Victoria. CPU había jugado piedra");
				break;
			case 3:
				System.out.println("Empate CPU había jugado Spock");
				break;
			case 4:
				System.out.println("Derrota. CPU había jugado lagarto");
				break;
			default:
				System.out.println("Error");
				break;
			}
			break;
			case "spock":
				switch(cpu) {
				case 0:
					System.out.println("Victoria. CPU había jugado tijera");
					break;
				case 1:
					System.out.println("Derrota. CPU había jugado papel");
					break;
				case 2:
					System.out.println("Victoria. CPU había jugado piedra");
					break;
				case 3:
					System.out.println("Empate CPU había jugado Spock");
					break;
				case 4:
					System.out.println("Derrota. CPU había jugado lagarto");
					break;
				default:
					System.out.println("Error");
					break;
				}
			break;
			case "Papel":
				switch(cpu) {
				case 0:
					System.out.println("Derrota. CPU había jugado tijera");
					break;
				case 1:
					System.out.println("Empate. CPU había jugado papel");
					break;
				case 2:
					System.out.println("Victoria. CPU había jugado piedra");
					break;
				case 3:
					System.out.println("Victoria. CPU había jugado Spock");
					break;
				case 4:
					System.out.println("Derrota. CPU había jugado lagarto");
					break;
				default:
					System.out.println("Error");
					break;
				}
			break;
			case "papel":
				switch(cpu) {
				case 0:
					System.out.println("Derrota. CPU había jugado tijera");
					break;
				case 1:
					System.out.println("Empate. CPU había jugado papel");
					break;
				case 2:
					System.out.println("Victoria. CPU había jugado piedra");
					break;
				case 3:
					System.out.println("Victoria. CPU había jugado Spock");
					break;
				case 4:
					System.out.println("Derrota. CPU había jugado lagarto");
					break;
				default:
					System.out.println("Error");
					break;
			}
			break;
			case "Piedra":
			switch (cpu) {
			case 0:
				System.out.println("Victoria. CPU había jugado tijera");
				break;
			case 1:
				System.out.println("Derrota. CPU había jugado papel");
				break;
			case 2:
				System.out.println("Empate. CPU había jugado piedra");
				break;
			case 3:
				System.out.println("Derrota. CPU había jugado Spock");
				break;
			case 4:
				System.out.println("Victoria. CPU había jugado lagarto");
				break;
			default:
				System.out.println("Error");
				break;
			}
			break;
			case "piedra":
			switch (cpu) {
			case 0:
				System.out.println("Victoria. CPU había jugado tijera");
				break;
			case 1:
				System.out.println("Derrota. CPU había jugado papel");
				break;
			case 2:
				System.out.println("Empate. CPU había jugado piedra");
				break;
			case 3:
				System.out.println("Derrota. CPU había jugado Spock");
				break;
			case 4:
				System.out.println("Victoria. CPU había jugado lagarto");
				break;
			default:
				System.out.println("Error");
				break;
			}
			break;
			case "Lagarto":
			switch (cpu) {
			case 0:
				System.out.println("Derrota. CPU había jugado tijera");
				break;
			case 1:
				System.out.println("Victoria. CPU había jugado papel");
				break;
			case 2:
				System.out.println("Derrota. CPU había jugado piedra");
				break;
			case 3:
				System.out.println("Victoria. CPU había jugado Spock");
				break;
			case 4:
				System.out.println("Empate. CPU había jugado lagarto");
				break;
			default:
				System.out.println("Error");
				break;
			}
			break;
			case "lagarto":
			switch (cpu) {
			case 0:
				System.out.println("Derrota. CPU había jugado tijera");
				break;
			case 1:
				System.out.println("Victoria. CPU había jugado papel");
				break;
			case 2:
				System.out.println("Derrota. CPU había jugado piedra");
				break;
			case 3:
				System.out.println("Victoria. CPU había jugado Spock");
				break;
			case 4:
				System.out.println("Empate. CPU había jugado lagarto");
				break;
			default:
				System.out.println("Error");
				break;
			}
		}
		} else {
		salida();
		System.exit(0);
		}
	}
	}
	private static void crearMenu() {
		System.out.printl();
	}
	private static void elijaJugadaError() {
		System.out.println("Entrada inválida.");
		System.out.println("Escriba su jugada (Piedra, Papel,\n Tijera, Lagarto o Spock).");
	}
	private static String leerJugada() {
		Scanner scan = new Scanner (System.in);
        String jugada = scan.nextLine();
        return jugada;
	}
	private static void elijaJugada() {
		System.out.println("Escriba su jugada (Piedra, Papel,\n Tijera, Lagarto o Spock).");
		
	}
	private static void salida() {
		System.out.println("El programa se cerrará...");
	}

	private static int generarJugada() {
		Random rand = new Random();
		return rand.nextInt(5);
	}

	private static int pedirOpcion() {
		Scanner scan = new Scanner (System.in);
        int usuario = scan.nextInt();
        return usuario;
	}

	private static void escribirMenu() {
		System.out.print("\nPIEDRA PAPEL TIJERAS LAGARTO SPOCK\n" + 
				"1. Jugar\n" + 
				"0. Salir\n" + 
				"Escoja una opción: ");
	}

}