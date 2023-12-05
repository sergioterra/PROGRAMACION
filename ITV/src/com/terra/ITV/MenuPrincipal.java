package com.terra.ITV;
import java.util.Scanner;

public class MenuPrincipal {
	public void menuPrincipal() {
		Scanner sc = new Scanner(System.in);
		MenuCreacionVehiculo menuCreacionVehiculo = new MenuCreacionVehiculo();
		MenuCreacionPropietario menuCreacionPropietario = new MenuCreacionPropietario();
		MenuPasarITV menuPasarItv = new MenuPasarITV();

		int opcion;
		do {
			System.out.println("╔═════════════════════════════════════╗");
			System.out.println("║                                     ║");
			System.out.println("║           APLICACIÓN ITV            ║");
			System.out.println("║                                     ║");
			System.out.println("║           Menú Principal            ║");
			System.out.println("║                                     ║");
			System.out.println("║                                     ║");
			System.out.println("║  1. Introducir Vehiculo             ║");
			System.out.println("║                                     ║");
			System.out.println("║  2. Introducir Propietario          ║");
			System.out.println("║                                     ║");
			System.out.println("║  3. Dar precio ITV                  ║");
			System.out.println("║                                     ║");
			System.out.println("║  4. Pasar la ITV                    ║");
			System.out.println("║                                     ║");
			System.out.println("║  5. Imprimir informe de la ITV      ║");
			System.out.println("║                                     ║");
			System.out.println("║  6. Salir de la aplicación ITV      ║");
			System.out.println("║                                     ║");
			System.out.println("╚═════════════════════════════════════╝");
			System.out.println("");
			System.out.print("Selecciona la opción a realizar: ");
			opcion = sc.nextInt();
			sc.nextLine();
			switch (opcion) {
			case 1:
				menuCreacionVehiculo.menuCreacionVehiculo();
				break;
			case 2:
				menuCreacionPropietario.menuCreacionPropietario();
				break;
			case 3:
				if(menuCreacionVehiculo.vehiculo == null) {
					System.out.println("No se puede dar precio, falta el vehículo");
				}
				if (menuCreacionPropietario.propietario != null && menuCreacionVehiculo.vehiculo != null) {
					System.out.println("El precio de la Itv es: " + menuCreacionVehiculo.precioItv());
				}
				break;
			case 4:
				if(menuCreacionPropietario.propietario == null) {
					System.out.println("No se puede dar precio, falta el propietario");
				}
				if(menuCreacionVehiculo.vehiculo == null) {
					System.out.println("No se puede dar precio, falta el vehículo");
				}
				if (menuCreacionPropietario.propietario != null && menuCreacionVehiculo.vehiculo != null) {
					menuPasarItv.menuPasarItv();
				}
				break;
			case 5:
				if(menuCreacionPropietario.propietario == null) {
					System.out.println("No se puede dar precio, falta el propietario");
				}
				if(menuCreacionVehiculo.vehiculo == null) {
					System.out.println("No se puede dar precio, falta el vehículo");
				}
				if (menuCreacionPropietario.propietario != null && menuCreacionVehiculo.vehiculo != null) {
					menuCreacionPropietario.informePropietario();
					
				}
				break;
			default:
				break;
			}
		} while (opcion != 6);
	}
}
