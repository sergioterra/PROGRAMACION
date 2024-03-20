package com.kike.calculos;

public class calculos {
	public void dividirYSumar( int uno, int dos) {
		calculosaritmeticos ca = new calculosaritmeticos();
		
		System.out.println("El resultado de la division es : " + ca.dividir(uno, dos));
		
		System.out.println("El resultado de la suma es: " + ca.sumar(uno, dos));
	}
}
