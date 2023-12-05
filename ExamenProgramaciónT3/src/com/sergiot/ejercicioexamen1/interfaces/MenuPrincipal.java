package com.sergiot.ejercicioexamen1.interfaces;

import com.sergiot.ejemploexamen1.entidades.Vehiculo;

import java.util.Scanner;

import com.sergiot.ejemploexamen1.entidades.Propietario;

public class MenuPrincipal {
	
	private Vehiculo vehiculo;
	private Propietario propietario;
	
	int opcion;

	
	public void mostrarMenu() {
		do {
		System.out.println("*******TALLER DE RUEDAS REPARACION***********");
		System.out.println("1.Dar de alta a un cliente");
		System.out.println("2.Dar de alta a un vehiculo");
		System.out.println("3.Servicio de cambio de ruedas");
		System.out.println("4.Emision de factura");
		System.out.println("5.Salir de la Aplicacion");
		System.out.println("***********************************************");	
	
			Scanner sc = new Scanner(System.in);
		
		opcion =sc.nextInt();
		sc.nextLine();
		
		
			
		switch(opcion) {
		case 1:
			MenuPropietario menupropietario = new MenuPropietario();
			propietario = menupropietario.creacionPropietario();
			
			break;
		case 2:
			MenuVehiculo menuvehiculo = new MenuVehiculo();
			menuvehiculo.menuCreacionVehiculos(propietario);
			break;
		case 3:
			MenuRuedas menuruedas = new MenuRuedas();
			menuruedas.MenuEleccionRuedas(vehiculo);
			break;
		case 4:
			MenuFactura menufactura = new MenuFactura();
			menufactura.creacionFactura(propietario, null);
			break;
		case 5:
			return;
		default :
			System.out.println("Introduzca una opcion del 1 al 5");
		}
	}while(opcion != 5);
	}
		
	
	
	
	private boolean hayVehiculoCreado() {
		return vehiculo != null;
	}
	private boolean hayPropietarioCreado() {
		return propietario != null;
	}
	
}
