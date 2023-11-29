package com.sergiot.fincas;

public class FincasRectangulares {
	
	private float lado1;
	private float lado2;

	
	

	public FincasRectangulares(float lado1, float lado2){
		this.lado1 = lado1;
		this.lado2 = lado2;
		
		
	
	}
	
	public FincasRectangulares(){
		
	}
	
	
	public void CalcularPerimetro(){
		System.out.println("El perimetro de la finca es: " + (this.lado1 + this.lado2)*2);
	}
	
	public String CalacularArea() {
		System.out.println("El area de la finca es: " + (this.lado1 * this.lado2));
		return null;
		
	}
	
	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}
	public float getLado1() {
		return lado1;
	}
	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}
	public float getLado2() {
		return lado2;
	}
	
	
	
	
}
