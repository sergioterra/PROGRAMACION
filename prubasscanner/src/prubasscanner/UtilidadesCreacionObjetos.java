package prubasscanner;

import java.util.Scanner;

public class UtilidadesCreacionObjetos {
	
	public static Libro crearLibro(Scanner sc) {
		System.out.println("lala");
		String titulo = sc.nextLine();
		
		System.out.println("lala");
		String autor = sc.nextLine();
		
		System.out.println("Digame el precio");
		float precio = Float.parseFloat(sc.nextLine());
		
		Libro libro = new Libro(titulo,autor,precio);
		return libro;
		
	}

}
