package com.sergiot.fincas;

public class FincasCirculares {

	private float radio;
	
	public FincasCirculares(float radio) {
		this.radio = radio;
		
	}
	
	public FincasCirculares() {
		
	}
	
	public void CalcularAreaCirculares() {
		System.out.println("El area de la finca es: " + Math.PI * Math.pow(radio,2));
		
	}
	
	
	
	
	
	public void setRadio(float radio) {
		this.radio = radio;
	}
	public float getRadio() {
		return radio;
	}
	
	
	
}
