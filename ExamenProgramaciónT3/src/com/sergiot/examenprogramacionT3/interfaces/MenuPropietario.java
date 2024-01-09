package com.sergiot.examenprogramacionT3.interfaces;

import java.util.Scanner;

import com.sergiot.examenprogramacionT3.entidades.Propietario;

public class MenuPropietario {
	
	public Propietario creacionPropietario() {
		
		Scanner sc = new Scanner(System.in);
		
		String nombre;
		String primerApellido;
		String segundoApellido;
		String dni;
		Integer edad;
		String ciudad;
		
		System.out.println("**********MENU DE CREACION DEL PROPIETARIO***********");
		
		do {
			System.out.println("Introduce el Nombre del Cliente");
			nombre = sc.nextLine();
			if(nombre.equalsIgnoreCase("")) {
				System.out.println("ERROR : El campo no se puede quedar vacio");
			}
		}while(nombre.equalsIgnoreCase(""));
		
		
		
		
		
		do {
			System.out.println("Introduce el Nombre del Primer Apellido");
			primerApellido = sc.nextLine();
			if(primerApellido.equalsIgnoreCase("")) {
				System.out.println("ERROR : El campo no se puede quedar vacio");
			}
		}while(primerApellido.equalsIgnoreCase(""));
		
		
		
		
		do {
			System.out.println("Introduce el Nombre del Segundo Apellido");
			segundoApellido = sc.nextLine();
			if(segundoApellido.equalsIgnoreCase("")) {
				System.out.println("ERROR : El campo no se puede quedar vacio");
			}
		}while(segundoApellido.equalsIgnoreCase(""));
		
		
		
		
		do {
			System.out.println("Introduce la edad");
			edad = sc.nextInt();
			sc.nextLine();
			if(edad.equals("")) {
				System.out.println("ERROR : El campo no sea puede quedar vacio");
			}
		}while(edad.equals(""));
		
		
		
		
		
		do {
			System.out.println("Introduce el DNI");
			dni = sc.nextLine();
			if(dni.equalsIgnoreCase("")) {
				System.out.println("ERROR : El campo no se puede quedar vacio");
			}
		}while(dni.equalsIgnoreCase(""));
		
		
		do {
			System.out.println("Introduce la ciudad residente");
			ciudad = sc.nextLine();
			if(ciudad.equalsIgnoreCase("")) {
				System.out.println("ERROR : El campo no se puede quedar vacio");
			}
		}while(ciudad.equalsIgnoreCase(""));
		
	
		Propietario propietario = new Propietario(nombre, primerApellido, segundoApellido, dni, edad, ciudad);
		return propietario;
		
	}
	
	
	
}
