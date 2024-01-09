package com.sergiot.examenprogramacionT3.entidades;

public class Ruedas {
	
	private String marcaRuedas;
	private Integer precio;
	
	
	public Ruedas(String ruedas, Integer precio) {
		this.marcaRuedas = ruedas;
		this.precio = precio;
	}
	
	
	
	
	public String getRuedas() {
		return marcaRuedas;
	}
	public void setRuedas(String ruedas) {
		this.marcaRuedas = ruedas;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	
	
	
}
