package com.sergiot.ejercicioexamen1.interfaces;

import com.sergiot.ejemploexamen1.entidades.Factura;
import com.sergiot.ejemploexamen1.entidades.Propietario;
import com.sergiot.ejemploexamen1.entidades.Ruedas;


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
