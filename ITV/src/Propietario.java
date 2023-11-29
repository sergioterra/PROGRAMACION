
public class Propietario {
	
	private String dni;
	private String nombre;
	private String apellidos;
	
	public void CreadorPropietarios(String dni, String nombre, String apellidos) {
		System.out.println("Introduzca su DNI");
		this.dni = dni;
		System.out.println("Introduca su Nombre");
		this.nombre = nombre;
		System.out.println("Introduzca su Apellido");
		this.apellidos = apellidos;
		
		System.out.println("Se ha creado un propietario correctamente");
		
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDni() {
		return dni;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getApellidos() {
		return apellidos;
	}
	
	
	
}
