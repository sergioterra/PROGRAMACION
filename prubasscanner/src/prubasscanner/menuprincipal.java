package prubasscanner;

import java.util.Scanner;

public class menuprincipal {
	public static void main(String[] args) {
		
	
	
	Integer opcion = 0;
	Scanner sc = new Scanner(System.in);
	
	do {
		System.out.println("******APLICACION GESTION DE LIBRERIA*****");
		System.out.println("******MENU PRINCIPAL******");
		System.out.println("INtrofuzca la opcion que desea llevar a cabo");
		System.out.println("1. Gestion de ventas");
		System.out.println("2. Gestion de Inventario");
		System.out.println("3. Gestion de Descuentos");
		System.out.println("4. Salir");
		
		opcion = sc.nextInt();
		sc.nextLine();
		
		switch (opcion) {
			case 1 : 
				//Mostramos submenu de gestion de ventas
				System.out.println("Hola");
				MenuGestionVentas mv = new MenuGestionVentas();
				mv.mostrarMenu();
			break;
			case 2 : 
				//Mostramos submenu de inventario
				System.out.println("Inventario");
				break;
			case 3:
				//Mostramos Los descuentos
				System.out.println("Los descuentos son 100% gratis");
				break;
			case 4: 
				//Salir
				return;
			default:
				System.out.println("Opcion incorrecta : El número debe estar comprendido entre el 1 y el 4");
		}
	}while(opcion != 4);

}
}