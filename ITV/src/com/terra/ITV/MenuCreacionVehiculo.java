package com.terra.ITV;
import java.util.Scanner;

public class MenuCreacionVehiculo {
	Vehiculo vehiculo;
	private String matricula, modelo, combustible;
	private String caballos;
	private boolean esDiesel;
	public void menuCreacionVehiculo(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca la matrícula del vehículo: ");
		matricula = sc.nextLine();
		while(matricula == "") {
			System.out.print("ERROR: La matrícula no puede estar vacía ");
			System.out.print("Introduzca la matrícula del vehículo: ");
			matricula = sc.nextLine();
		}
		
		
		System.out.print("Introduzca el modelo del vehículo: ");
		modelo = sc.nextLine();
		while(modelo == "") {
			System.out.print("ERROR: El modelo no puede estar vacío ");
			System.out.print("Introduzca el modelo del vehículo: ");
			modelo = sc.nextLine();
		}
		
		
		System.out.print("Introduzca los caballos del vehículo: ");
		caballos = sc.nextLine();
		while(caballos == "") {
			System.out.print("ERROR: Los caballos no pueden estar vacíos ");
			System.out.print("Introduzca los caballos del vehículo: ");
			caballos = sc.nextLine();
		}
		

		System.out.print("Introduzca el tipo de combustible del vehículo: ");
		combustible = sc.nextLine();
		while(!(combustible.equals("Diesel") || combustible.equals("diesel") || combustible.equals("Diésel") || combustible.equals("diésel") || combustible.equals("Carbon") || combustible.equals("carbon") || combustible.equals("Carbón") || combustible.equals("carbón"))) {
			System.out.print("ERROR: El combustible solo puede ser o Diésel o Carbón ");
			System.out.print("Introduzca el tipo de combustible: ");
			combustible = sc.nextLine();
		}
		if(combustible.equals("Diesel") || combustible.equals("diesel") || combustible.equals("Diésel") || combustible.equals("diésel")) esDiesel = true; else esDiesel = false;
		
		if (vehiculo == null) {
			vehiculo = new Vehiculo(matricula, modelo, caballos, esDiesel);
			
			System.out.println("Vehículo creado correctamente");
			System.out.println("");
		}else {
			System.out.println("Ya hay un vehículo guardado en memoria, ¿desea borrarlo y guardar otro? Y/N");
			String eleccion = sc.nextLine();
			if (eleccion == "Y" || eleccion == "y") {
				Vehiculo vehiulo = new Vehiculo(matricula, modelo, caballos, esDiesel);
				
				System.out.println("Vehículo actualizado correctamente");
				System.out.println("");
			}else {
				System.out.println("Vehiculo mantenido corectamente");
				System.out.println("");

			}
		}
		
	}
	
	public int precioItv(){
		int caballos = Integer.parseInt(this.vehiculo.getCaballos());
		int precio = 0;
		if(caballos <= 60) {
			precio = 30;
		}else if(caballos < 120) {
			precio = 50;
		}else if(caballos < 140) {
			precio = 50;
		}else {
			precio = 100;
		}
		
		return precio;
		
	}
	
	public void informeVehiculo() {
		String tipo;
		if(esDiesel) {
			tipo = "Diesel"; 
		}else {
			tipo = "Gasolina";
		}
		System.out.println("║                                     ║");
		System.out.println("║         Datos del Vehículo          ║");
		System.out.println("║                                     ║");
		System.out.println("║                                     ║");
		System.out.println("║     Matrícula: " + espaciosAdd(23, matricula ) + "║");
		System.out.println("║                                     ║");
		System.out.println("║     Modelo: " + espaciosAdd(26, modelo)+ "║");
		System.out.println("║                                     ║");
		System.out.println("║     Caballos: " + espaciosAdd(20, caballos) + "║");
		System.out.println("║                                     ║");
		System.out.println("║     Tipo de combustible: " + espaciosAdd(20, tipo) + "║");
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
