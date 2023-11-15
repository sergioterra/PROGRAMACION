package pruba2;

public class Venta {
	
	private Libro libro;
	private Cliente cliente;
	private int cantidad; 

	public Venta(Libro libro, Cliente cliente, int cantidad) {
		this.libro = libro;
		this.cliente = cliente;
		this.cantidad = cantidad;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente(Cliente cliente) {
		return this.cliente;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	public Libro getLibro(Libro libro) {
		return this.libro;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getCantidad(int cantidad) {
		return this.cantidad;
	}
	
	public void registraVenta() {
		//Esto es para registrar una venta
		
		System.out.println("Regrsitrando venta del cliente" + this.cliente + "del libro" + libro.titulo + "cantidad" + this.cantidad);
	}
}
