package com.terra.ITV;
public class Vehiculo {
	private String matricula;
	private String modelo;
	private String caballos;
	private boolean esDiesel;
	
	public Vehiculo(String matricula, String modelo, String caballos, boolean esDiesel) {
		this.matricula = matricula;
		this.modelo = modelo;
		this.caballos = caballos;
		this.esDiesel = esDiesel;
	}

	public Vehiculo() {
		// TODO Auto-generated constructor stub
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCaballos() {
		return caballos;
	}

	public void setCaballos(String caballos) {
		this.caballos = caballos;
	}

	public boolean isEsDiesel() {
		return esDiesel;
	}

	public void setEsDiesel(boolean esDiesel) {
		this.esDiesel = esDiesel;
	}
	
}
