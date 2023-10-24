package pruebas;

import java.util.Scanner;

public class pruebas {
	public static void main (String args[]) {	
		
		Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("0. Salir");
            System.out.print("Ingresa el número de la opción: ");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Seleccionaste la Opción 1");
                    	System.out.println("Sumando 2+2");
                    	System.out.println("Es igual a 4");
                    	
                    break;
                case 2:
                    System.out.println("Seleccionaste la Opción 2");
                    System.out.println("HOLA");
                    break;
                case 3:
                    System.out.println("Seleccionaste la Opción 3");
                    System.out.println("ADIOS");
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
		}
		


		
	

}


