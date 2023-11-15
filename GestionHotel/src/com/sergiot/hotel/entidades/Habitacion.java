package com.sergiot.hotel.entidades;

public class Habitacion {

	private int numeroHabitacion;
	private int numeroPlanta;
	private boolean estaOcupada;
	
	
	public Habitacion(int numeroHabitacion, int numeroPlanta) {
		this.numeroHabitacion = numeroHabitacion;
		this.numeroPlanta = numeroPlanta;
		this.estaOcupada = false;
	}
	
	public void setnumeroHabitacion(int numeroHabitacion){
		this.numeroHabitacion = numeroHabitacion;
	}
	public int getnumeroHabitacion() {
		return this.numeroHabitacion;
	}
	public void setnumeroPlanta(int numeroplanta) {
		this.numeroPlanta = numeroPlanta;
	}
	public int getnumeroPlanta() {
		return this.numeroPlanta;
	}
	public void setestaocupada(boolean estaOcupada) {
		this.estaOcupada = estaOcupada;
	}
	public boolean getestaOcupada() {
		return this.estaOcupada;
	}
}
