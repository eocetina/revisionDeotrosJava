package com.generation;

import java.util.Scanner;

public class Codigo4 {

//   fix:Falta agregar un main para ejecutar el codigo
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); // fix:configure la entrada del constructor scanner

		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");//fix:cambio de println a print

		String j1 = s.nextLine();
		
		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); // fix: escribir correctamente
																							// turno y cambio de println a print
		Scanner s2 = new Scanner(System.in); // fix:configure la entrada del constructor scanner
		String j2 = s2.nextLine();// fix: variable correcta
		

		
		if (j1.equals(j2)) { // fix: parenteesis extra y modificacion de metodo de comparacion
			System.out.println("Empate");
		} else {
			int g = 2;
			switch (j1) {
			case "piedra":
				if (j2.equals("tijera")) {// fix:uso de metodo equal y "tijeras"
					g = 1;
				}
				if(j2.equals("papel")) {
					g = 2;
				}
				break;
			case "papel":
				if (j2.equals("piedra")) {// fix:uso de metodo equals
					g = 1;
				}	
				if (j2.equals("tijera")) {// fix:uso de metodo equals
					g = 2;
				}
				break;
			case "tijera":
				if (j2.equals("papel")) {
					g = 1;
				}
				if (j2.equals("piedra")) {
					g = 2;
				}
				break;
				default:
					System.out.println("Seleccion invalida"); // fix: corregir default
				
			}// end switch	
			System.out.println("Gana el jugador " + g); // fix: corregir ubicacion del aviso
		}// fin If
		// destruir objetos 
		s.close();
		s2.close();
	}// fin main
}
// FIn class