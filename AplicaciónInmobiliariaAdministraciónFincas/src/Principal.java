import java.util.Scanner;

import com.sergiot.fincas.FincasCirculares;
import com.sergiot.fincas.FincasRectangulares;

public class Principal {

	public static void main(String[] args) {
		
		int opcion = 0;
		
		FincasRectangulares fincasrectangulares = new FincasRectangulares();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*****APLICACION DE GESTION DE FINCAS******");
		System.out.println("**************MENU PRINCIPAL**************");
		System.out.println("Introduzca la opcion que desea realizar");
		System.out.println("1. Gestion de fincas rectangulares");
		System.out.println("2. Gestion de fincas circulares");
		System.out.println("3. Gestion de fincas con forma de poligono regular");
		System.out.println("4. Salir");
		
		float lado1;
		float lado2;
		
		switch(opcion) {
			case 1:
				int opcion2 = 0;
				System.out.println("MENU DE FINCAS RECTANGULARES");
				System.out.println("1. Crear finca");
				System.out.println("2. Calcular area");
				System.out.println("3. Calacular perimetro");
				System.out.println("4. Salir");
				switch(opcion2) {
				case 1:
					
					System.out.println("Introduce el primer lado1");
					lado1 = sc.nextFloat();
					sc.nextLine();
					System.out.println("Introduce el segundo lado2");
					lado2 = sc.nextFloat();
					sc.nextLine();
					fincasrectangulares = new FincasRectangulares(lado1, lado2);
					break;
				case 2:
					fincasrectangulares.CalacularArea();
					break;
				case 3:
					fincasrectangulares.CalcularPerimetro();
					break;
				case 4:
					System.out.println("Ha seleccionado salir");
					return;
				}
				
				break;
			case 2:
			int opcion3;
			opcion3 = sc.nextInt();
			sc.nextLine();
			
			switch(opcion3) {
			case 1:
				int opcion4;
				opcion4 = sc.nextInt();
				sc.nextLine();
				System.out.println("MENU DE FINCAS CIRCULARES");
				System.out.println("1. Crear finca");
				System.out.println("2. Calcular area");
				System.out.println("3. Calacular perimetro");
				System.out.println("4. Salir");
				switch(opcion4) {
				case 1:
					float radio;
					System.out.println("Introduce el radio");
					radio = sc.nextFloat();
					sc.nextLine();
					FincasCirculares fincascirculares = new FincasCirculares(radio);
					
					break;
				case 2:
					fincascirculares.CalcularAreaCirculares();     
				case 3:
					fincasrectangulares.CalcularPerimetro();
					break;
				case 4:
					System.out.println("Ha seleccionado salir");
					return;
				
				}
			case 3:
				
				break;
			case 4: 
				System.out.println("Ha seleccionado salir");
				return;
			default:
				System.out.println("Seleccione una opcion del 1 al 4");
		}
			
			
		
		
	}
	
	
	}
	}

