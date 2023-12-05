package com.sergiot.ejercicioexamen1.interfaces;

import java.util.Scanner;

import com.sergiot.ejemploexamen1.entidades.Vehiculo;
import com.sergiot.ejemploexamen1.entidades.Ruedas;
import com.sergiot.ejercicioexamen1.interfaces.MenuVehiculo;

public class MenuRuedas {
	public void MenuEleccionRuedas(Vehiculo vehiculo) {
		
		Scanner sc = new Scanner(System.in);
		
		
		String marcaRuedas;
		String precio;
		
		
		
		do {
			System.out.println("Introducir la marca de las ruedas deseadas: ");
			marcaRuedas = sc.nextLine();
			if(marcaRuedas.equalsIgnoreCase("")) {;
			System.out.println("ERROR : No puede estar vacio");
	}
	}while 
		(marcaRuedas.equalsIgnoreCase("") );
		
		
		do {
			System.out.println("Introducir el precio de las ruedas: ");
			precio = sc.nextLine();
			if(precio.equalsIgnoreCase("")) {;
			System.out.println("ERROR : No puede estar vacio");
	}
	}while 
		(precio.equalsIgnoreCase("") );
		
		System.out.println("Neumaticos" + marcaRuedas+ " asignados al vehiculo"+  vehiculo.getMarca());
		
		}
	}

