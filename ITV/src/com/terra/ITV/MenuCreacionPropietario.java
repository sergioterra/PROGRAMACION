package com.terra.ITV;
import java.util.Scanner;

public class MenuCreacionPropietario {
	Propietario propietario;
	private String dni, nombre, apellido;
	public void menuCreacionPropietario() {
		Scanner sc = new Scanner(System.in);
		String dni, nombre, apellido;
		
		System.out.print("Introduzca el DNI del propietario: ");
		dni = sc.nextLine();
		while(dni.isBlank()) {
			System.out.print("ERROR: El DNI no puede estar vacío ");
			System.out.print("Introduzca la matrícula del vehículo: ");
			dni = sc.nextLine();
		}
		
		
		System.out.print("Introduzca el nombre del propietario: ");
		nombre = sc.nextLine();
		while(nombre.isBlank()) {
			System.out.print("ERROR: El nombre no puede estar vacío ");
			System.out.print("Introduzca el nombre del propietario: ");
			nombre = sc.nextLine();
		}
		
		
		System.out.print("Introduzca el apellido del propietario: ");
		apellido = sc.nextLine();
		while(apellido == "") {
			System.out.print("ERROR: El apellido no puede estar vacío ");
			System.out.print("Introduzca el apellido del propietario: ");
			apellido = sc.nextLine();
		}
		
		if (propietario == null) {
			propietario = new Propietario(dni, nombre, apellido);
			
			System.out.println("Vehículo creado correctamente");
			System.out.println("");
		}else {
			System.out.println("Ya hay un vehículo guardado en memoria, ¿desea borrarlo y guardar otro? Y/N");
			String eleccion = sc.nextLine();
			if (eleccion == "Y" || eleccion == "y") {
				propietario = new Propietario(dni, nombre, apellido);
				
				System.out.println("Vehículo actualizado correctamente");
				System.out.println("");
			}else {
				System.out.println("Vehiculo mantenido corectamente");
				System.out.println("");

			}
		}
	}
	
	public void informePropietario() {
		System.out.println("╔═════════════════════════════════════╗");
		System.out.println("║                                     ║");
		System.out.println("║           APLICACIÓN ITV            ║");
		System.out.println("║                                     ║");
		System.out.println("║       Datos del propietario         ║");
		System.out.println("║                                     ║");
		System.out.println("║                                     ║");
		System.out.println("║     Nombre: " + espaciosAdd(23, nombre) + "║");
		System.out.println("║                                     ║");
		System.out.println("║     Apellido: " + espaciosAdd(26, apellido)+ "║");
		System.out.println("║                                     ║");
		System.out.println("║     DNI: " + espaciosAdd(20, dni) + "║");
		System.out.println("║                                     ║");
		System.out.println("║                                     ║");
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
