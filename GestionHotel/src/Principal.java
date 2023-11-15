import java.util.Scanner;

import com.sergiot.hotel.entidades.Habitacion;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcion = 0;
		
		
	
		
		System.out.println("***************MENU********************");
		System.out.println("*******SELECCIONE UNA OPCION***********");
		System.out.println("1.*****REGISTRAR AL CLIENTE************");
		
		System.out.println("2.Introduzca el DNI: ");
		String dni = sc.nextLine();
		
		System.out.println("2.Introduzca el nombre: ");
		String nombre = sc.nextLine();

		System.out.println("2.Introduzca el apellido: ");
		String apellido = sc.nextLine();
		
		Cliente cliente = new Cliente(dni, nombre, apellido);
		
		System.out.println("Introduzca el numero de habitacion");
		int numeroHabitacion = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduzca el numero de planta");
		int plantaHabitacion = sc.nextInt();
		sc.nextLine();
		
		Habitacion habitacion = new Habitacion(numeroHabitacion, plantaHabitacion);
		do {
			System.out.println("Menu de Reservas");
			System.out.println("1. Hacer reserva");
			System.out.println("2. Cancelar reserva");
			System.out.println("3. Salir");
			
			opcion = sc.nextInt();
			sc.nextLine();
		
		switch(opcion) {
		case 1:
			Reservas reservas = new Reservas();
			reservas.reservarHabitacion(cliente, habitacion);
			break;
		case 2:
			Reservas reservas1 = new Reservas();
			reservas1.anularReserva(cliente, habitacion);
			break;
		case 3: 
			System.out.println("Ha seleccionado salir");
			return;
			
		default:
			System.out.println("Seleccione un numero del 1 al 3");
		}
		}while(opcion != 3);
		
	}

}
