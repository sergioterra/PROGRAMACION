package pruba2;

public class Cliente {
	String nombre;
	int edad;
	String ciudad;
	
	public Cliente (String nombre, int  edad, String ciudad) {
	this.nombre = nombre;
	this.edad = edad;
	this.ciudad = ciudad;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	public String getNombre (String nombre) {
		return this.nombre;
	}        
	public void setEdad (int edad) {
		if(edad < 0) {
			System.err.println("El valor esta mal puesto");
		}
		else {
			this.edad = edad;

		}
	}
	public int getEdad(int edad) {
		return this.edad;
	}
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCiudad(String ciudad) {
		return this.ciudad;
	}
	
	
	
	public boolean esVip() {
		boolean tieneGastoAlto = true;
		if(tieneGastoAlto) return true;
		return false;
		
	}
}
