import com.sergiot.hotel.entidades.Habitacion;

public class Cliente {

	private String dni;
	private String nombre;
	private String apellido;
	private Habitacion habitacion;
	
	public Cliente(String dni, String nombre, String apellido) {        //ESTO ES UN CONSTRUCTOR PARA 
		this.dni = dni; 
		this.apellido = apellido;         
		this.nombre = nombre;
		
		
		System.out.println("Cliente con dni: " + dni +"nombre: " + nombre + "y apellido" + apellido + "CREADO");
	}
	
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDni() {
		return this.dni;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getApellido() {
		return this.apellido;
	}
	void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}
	public Habitacion getHabitacion() {
		return this.habitacion;
	}
	
	
	
	

	
}
