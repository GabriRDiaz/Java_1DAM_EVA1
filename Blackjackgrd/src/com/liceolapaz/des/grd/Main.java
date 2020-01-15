package com.liceolapaz.des.grd;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int opcion = menu();
		int maquina = 0;
		int user = 0;
		switch(opcion) {
		case 1:
			maquina = generarNum();
			while(maquina<=15 && maquina<=21) {
				maquina = maquina + generarNum();
			} if(maquina>21) {
				System.out.println("La máquina pierde: Has ganado.");
			}else {
				System.out.println("\nPuntuación del crupier: " +maquina);
				while(user<22) {
					menuJUser();
					int movUser = peticion();
					if(movUser == 2) {
						if(maquina>user) {
							System.out.println("\nHas perdido.");
							System.out.print("Máquina: "+maquina);
							System.out.print("\nUsuario: "+user);
							System.exit(0);
						}else {
							System.out.println("\nHas ganado");
							System.out.print("Máquina: "+maquina);
							System.out.print("\nUsuario: "+user);
							System.exit(0);
						}
					}else {
						user = generarNum() + user;
					}
				}System.out.println("Te has pasado. Has sacado: "+ user);
			}
			break;
		case 2:
			maquina = generarNum();
			while(maquina<=15 && maquina<=21) {
				maquina = maquina + generarNum();
			} if(maquina>21) {
				System.out.println("La máquina pierde: Has ganado.");
			}else {
				while(user<22) {
					menuJUser();
					int movUser = peticion();
					if(movUser == 2) {
						if(maquina>user) {
							System.out.println("\nHas perdido.");
							System.out.print("Máquina: "+maquina);
							System.out.print("\nUsuario: "+user);
							System.exit(0);
						}else {
							System.out.println("\nHas ganado");
							System.out.print("Máquina: "+maquina);
							System.out.print("\nUsuario: "+user);
							System.exit(0);
						}
					}else {
						user = generarNum() + user;
					}
				}System.out.println("Te has pasado. Has sacado: "+ user);
			}
			break;
		case 0:
			System.out.println("Cerrando programa...");
			break;
		default: System.out.println("Entrada inválida. Cerrando...");
		System.exit(1);
		}
	}
		private static void menuJUser() {
		System.out.println("\nEs su turno. Elija sabiamente\n");
		System.out.print("1.Jugar\n2.Pasar\nSelección: ");
	}
		private static int menu() {
			System.out.println("BLACKJACK\n" + 
					"1. Modo fácil\n" + 
					"2. Modo normal\n" + 
					"0. Salir");
			System.out.print("Escoja una opción: ");
			int op = peticion();
			return op;
		}
		
		private static int peticion() {
			Scanner scan = new Scanner (System.in);
		    return scan.nextInt();
		}
		private static int generarNum() {
			return (int)(Math.random()*11+1);
		}
	}
