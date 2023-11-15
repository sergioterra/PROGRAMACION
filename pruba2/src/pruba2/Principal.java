package pruba2;

public class Principal {
	public static void main(String[] args) {
		/*Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();*/
		
		Cliente cliente1 = new Cliente("Kike", 33, "Salamanca");
		Cliente cliente2 = new Cliente("Pepe", 55, "Bilbao");
		
		/*Libro 11 = new Libro();
		Libro 12 = new Libro();*/
		
		Libro l1 = new Libro("El Quijote", "Miguel de Cervantes", 50.5f);
		Libro l2 = new Libro("Cien Años de Soledad", "Gabriel G.Marquez", 25.5f);
	
		cliente1.setEdad(-5);
	
	
		
		System.out.println("El cliente se llama: " + cliente1.getNombre() + "tiene : " + cliente1.getEdad() + "años" );
		
		Venta venta = new Venta();
		
		venta.setCantidad(30);
		venta.setCliente(cliente1);
		venta.setLibro(l2);
		
		
	}

}
