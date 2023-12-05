package com.sergiot.ejemploexamen1.entidades;

import com.sergiot.ejemploexamen1.entidades.Propietario;
import com.sergiot.ejemploexamen1.entidades.Ruedas;

public class Factura {
	public void preciosFacturas(Propietario propietario, Ruedas ruedas) {
		
		int edad;
		edad = propietario.getEdad();
		int precio;
		precio = ruedas.getPrecio();
		String ciudad;
		ciudad = propietario.getCiudad();
		
		
		if(edad >=18 || edad <=23) {
			System.out.println("El precio es: " + precio % 20);
		}
		if(edad >=24 || edad <= 29 ) {
			System.out.println("El precio es: " + precio %10);
		}
		if(!ciudad.equalsIgnoreCase("Salamanca")) {;
		System.out.println("Su precio es: " + precio % 10);
		}
		
		
	}
	}
	
	
	

