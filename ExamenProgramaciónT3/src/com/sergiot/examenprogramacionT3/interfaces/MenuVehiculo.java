package com.sergiot.examenprogramacionT3.interfaces;

import java.util.Scanner;

import com.sergiot.examenprogramacionT3.entidades.Propietario;
import com.sergiot.examenprogramacionT3.entidades.Vehiculo;
import com.sergiot.examenprogramacionT3.interfaces.MenuPropietario;

public class MenuVehiculo {

	public Vehiculo menuCreacionVehiculos(Propietario propietario) {
		
		
		String marca;
		String anoAntiguedad;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("***********MENU CREACION DE VEHICULO**************");
			
		
		do {
			System.out.println("Introducir la marca.");
			marca = sc.nextLine();
			if(marca.equalsIgnoreCase("")) {
			System.out.println("ERROR : No puede estar vacio");
		}
		}while 
			(marca.equalsIgnoreCase("") );
		
		
		
		
		
		do {
			System.out.println("Introducir año de antiguedad");
			anoAntiguedad = sc.nextLine();
			if(anoAntiguedad.equalsIgnoreCase("")) {;
			System.out.println("ERROR : No puede estar vacio");
	}
	}while 
		(anoAntiguedad.equalsIgnoreCase("") );
		
		System.out.println("Asignando coche con marca: "+ marca + "al cliente: " + propietario.getNombre()+ propietario.getPrimerApellido()) ;
		
		Vehiculo vehiculo = new Vehiculo(marca, anoAntiguedad);	
		return vehiculo;
		
		
		
	}
	
	
}
