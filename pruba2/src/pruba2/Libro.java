package pruba2;

public class Libro {
	private String titulo;
	private String autor;
	private float precio;
	
	public Libro(String titulo, String autor, float precio) {
		this.autor = autor;
		this.titulo = titulo;
		this.precio = precio;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTitulo(String titulo) {
		return this.titulo;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getAutor(String autor) {
		return this.autor;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public float getPrecio(float precio) {
		return this.precio;
	}
	
	public float calculaDescuento(Cliente cliente) {
		if(cliente.esVip())  return precio * 0.8f;
		return precio;

	}
	
	
	
	
}


