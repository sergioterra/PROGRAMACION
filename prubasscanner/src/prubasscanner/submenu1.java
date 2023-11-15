package prubasscanner;

import java.util.Scanner;

public class submenu1 {
	
	public void mostrarMenu() {
		int opcion;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("********Menu de Gestion de venta********");
			System.out.println("********ELIGA OPCION********");
			System.out.println("****************************************");
			System.out.println("1. Hacer una venta");
			System.out.println("2. Salir");

			opcion = sc.nextInt();
			sc.nextLine();
			
			switch(opcion) {
			case 1 :
				System.out.println("Hacemos una venta");
				String nombre = sc.nextLine();
				
				System.out.println("Introduzca la ciudad del cliente");
				String ciudad = sc.nextLine();
				
				Cliente c = new Cliente(nombre, ciudad);
				
				System.out.println("Digame el titulo del libro que ha comprado");
				String titulo = sc.nextLine();
				System.out.println("Digame el precio del libro");
				String precioString = sc.nextLine();
				float precio = Float.parseFloat(precioString);
				sc.nextLine();
				System.out.println("Digame el autor del libro");
				String autor = sc.nextLine();
				
				
				Libro l = new Libro(titulo, autor,precio);

				System.out.println("Digame la cantidad de libros a comprar: ");
				int cantidad = sc.nextInt();
				sc.nextLine();
				
				Venta venta = new Venta(c, 1, cantidad);
				
				venta.regitraVenta();
				
				
				break;
			case 2 :
				return;
			default :
				System.out.println("Tiene que estar entre 1 y 2");
			}
			 
;		}while(opcion <=2);
	}

}
