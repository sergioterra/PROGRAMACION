package com.sergiot.ejemploexamen1.entidades;

public class Propietario {
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String dni;
	private Integer edad;
	private String ciudad;
	
	

	
	public Propietario(String nombre, String primerApellido, String segundoApellido, String dni, Integer edad, String ciudad) {
	
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.dni = dni;
		this.edad = edad;
		this.ciudad = ciudad;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		dni = dni;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return edad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCiudad() {
		return ciudad;
	}
	
	
	
}
