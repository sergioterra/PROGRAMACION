package com.sergiot.examenprogramacionT3.entidades;

public class Vehiculo {

	private String marca;
	private String anoAntiguedad;
	
	
	public Vehiculo(String marca, String anoAntiguedad) {
		this.marca = marca;
		this.anoAntiguedad = anoAntiguedad;
		
		System.out.println("El vehiculo se ha creado correctamente.");
		
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return marca;
	}
	public void setAnoAntiguedad(String anoAntiguedad) {
		this.anoAntiguedad = anoAntiguedad;
	}
	public String getAnoAntiguedad() {
		return anoAntiguedad;
	}
	
	
	
	
	

	
}
