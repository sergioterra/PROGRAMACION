package com.sergiot.examenprogramacionT3.interfaces;


import java.util.Scanner;

import com.sergiot.examenprogramacionT3.entidades.Ruedas;
import com.sergiot.examenprogramacionT3.entidades.Vehiculo;

public class MenuRuedas {
	public Ruedas MenuEleccionRuedas(Vehiculo vehiculo) {
		
		Scanner sc = new Scanner(System.in);
		
		
		String marcaRuedas;
		int precio;
		
		
		
		do {
			System.out.println("Introducir la marca de las ruedas deseadas: ");
			marcaRuedas = sc.nextLine();
			if(marcaRuedas.equalsIgnoreCase("")) {;
			System.out.println("ERROR : No puede estar vacio");
	}
	}while 
		(marcaRuedas.equalsIgnoreCase("") );
		
		
			System.out.println("Introducir el precio de las ruedas: ");
			precio = sc.nextInt();
			sc.nextLine();
			
	
	
		
		System.out.println("Neumaticos " + marcaRuedas+ " asignados al vehiculo");
		
		Ruedas ruedas = new Ruedas(marcaRuedas, precio);
		return ruedas;
		
		}
	}

