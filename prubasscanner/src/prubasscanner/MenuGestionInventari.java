package prubasscanner;

import java.util.Scanner;

public class MenuGestionInventari {
	public void mostrarMenu() {
		
		int opcion = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("*******MENU GESTION DE INVENTARIO********");
			System.out.println("Indique la operaion a realizar");
			System.out.println("1. Introducir libros");
			System.out.println("2. Borrar Libro");
			System.out.println("3.Salir");
			String opcionString = sc.nextLine();
			
			opcion = Integer.parseInt(opcionString);
			
		}while(opcion != 3);
		
		switch(opcion) {
			case 1:
				//TODO: introducir un libro
			extracted(sc);
				
				break;
			case 2:
				//TODO: borrar libro
				break;
			case 3 :
				//TODO: salir
				System.out.println("Volviendo a menu principal");
				return;
			default : 
				System.out.println("La opcion debe ser entre 1 y 3");
			
		}
	}

	private void extracted(Scanner sc) {
		System.out.println("Introduzca el titulo del libro");
		String titulo = sc.nextLine();
		System.out.println("Introduzca el precio");
		float precio = sc.nextFloat();
		
		
		System.out.println("Introduzca la cantidad");
		int cantidad = sc.nextInt();
		sc.nextLine();
		
		Libro libro = new Libro(titulo,titulo,precio);
		
		
		LibroDAO libroDAO = new LibroDAO();
		libroDAO.insertarLibros(null, cantidad);
	}
	

}
