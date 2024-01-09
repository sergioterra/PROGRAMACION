package com.sergiot.examenprogramacionT3.interfaces;

import com.sergiot.examenprogramacionT3.entidades.Factura;
import com.sergiot.examenprogramacionT3.entidades.Propietario;
import com.sergiot.examenprogramacionT3.entidades.Ruedas;


public class MenuFactura {
	public Ruedas creacionFactura(Propietario propietario, Ruedas ruedas ){
		
		Factura factura = new Factura();
		
		
		System.out.println("**************FACTURA************");
		System.out.println("Factura emitida al cliente: "+ propietario.getNombre() + propietario.getPrimerApellido() + "con DNI : " + propietario.getDni());
		System.out.println("Neumaticos sustituidos");
		factura.preciosFacturas(propietario, ruedas);
		return ruedas;
		
		
	}
	
	
}
