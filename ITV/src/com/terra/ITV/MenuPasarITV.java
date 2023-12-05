package com.terra.ITV;
import java.util.Scanner;

public class MenuPasarITV {
	private String leves;
	private String graves;
	private boolean estaPasada;
	public void menuPasarItv() {
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║                                     ║");
			System.out.println("║           APLICACIÓN ITV            ║");
			System.out.println("║                                     ║");
			System.out.println("║           Menú Pasar Itv            ║");
			System.out.println("║                                     ║");
			System.out.println("║                                     ║");
			System.out.println("║  1. Pasa la ITV sin problemas       ║");
			System.out.println("║                                     ║");
			System.out.println("║  2. Paa la Itv con problemas        ║");
			System.out.println("║                                     ║");
			System.out.println("║  3. No pasa la ITV                  ║"); 
			System.out.println("║                                     ║");
			System.out.println("╚═════════════════════════════════════╝");
			System.out.println("");
			System.out.print("Selecciona la opción a realizar: ");
			opcion = sc.nextInt();
			sc.nextLine();
			switch (opcion) {
			case 1:
				System.out.println("Escribe las deficencias observadas");
				leves = sc.nextLine();
				estaPasada = true;
				break;
			case 2:
				System.out.println("Escribe las deficencias observadas leves");
				leves = sc.nextLine();
				System.out.println("Escribe las deficencia observadas graves");
				graves = sc.nextLine();
				estaPasada = true;
				break;
			case 3:
				estaPasada = false;
				break;
			}
		}while (opcion != 3);
}
	public void informeItv() {
		if(estaPasada){
			if(leves == null) {
				System.out.println("║                                     ║");
				System.out.println("║           Datos de la ITV           ║");
				System.out.println("║                                     ║");
				System.out.println("║    ITV SUPERADA SIN FALTAS LEVES    ║");
				System.out.println("║                                     ║");
			} else {
				System.out.println("║                                     ║");
				System.out.println("║           Datos de la ITV           ║");
				System.out.println("║                                     ║");
				System.out.println("║            ITV SUPERADA             ║");
				System.out.println("║                                     ║");
				System.out.println("║     Faltas leves: " + espaciosAdd(20, leves) + "║");
			}
		}else {
			System.out.println("║                                     ║");
			System.out.println("║           Datos de la ITV           ║");
			System.out.println("║                                     ║");
			System.out.println("║           ITV NO SUPERADA           ║");
			System.out.println("║                                     ║");
			System.out.println("║     Faltas leves: " + espaciosAdd(20, leves) + "║");
			System.out.println("║                                     ║");
			System.out.println("║     Faltas leves: " + espaciosAdd(20, graves) + "║");
		}
	}
	private String espaciosAdd(int longitudTotal, String texto) {
		
		 int longitudNombre = texto.length();
	        int espaciosAñadir = longitudTotal - longitudNombre;
	        String espacios = "";
	        for (int i = 0; i < espaciosAñadir; i++) {
	            espacios += " ";
	        }
	        return texto + espacios;
		
	}
	
}
