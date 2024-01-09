package ejerciciosarrays;

import java.util.Random;
import java.util.Scanner;

public class ejerciciosarrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		
		do {
		System.out.println("Introduzca el numero de filas");
		int filas = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduzca el numero de columnas");
		int columnas = sc.nextInt();
		sc.nextLine();
		
		int[][] arrayBidimensional = new int [filas][columnas];
		System.out.println("Array Bideminsional");
		
		Random random = new Random();
		
		for(int i=0; i<arrayBidimensional.length; i++) {
			for (int j=0; j<arrayBidimensional[i].length; j++) {
				arrayBidimensional[i][j] = random.nextInt(99);
			}
		}
		
		for(int i=0; i<arrayBidimensional.length; i++) {
			System.out.println();
			for (int j=0; j<arrayBidimensional[i].length; j++) {
				System.out.print(arrayBidimensional[i][j] + " ");
			}
		}
		
		System.out.println("=========================================");
        System.out.println("                MENÚ PRINCIPAL             ");
        System.out.println("=========================================");
        System.out.println("1. Sumar todos los elementos");
        System.out.println("2. Obtener el mayor número");
        System.out.println("3. Mostrar la diagonal principal");
        System.out.println("4. Mostrar la diagonal secundaria");
        System.out.println("5. Crea su matriz transpuesta (intercambia filas por columnas)");
        System.out.println("6. Calcula el promedio de todos los elementos");
        System.out.println("7. Contar pares e impares");
        System.out.println("8. Mostrar borde de array");
        System.out.println("9. Calcular la suma de cada fila");
        System.out.println("10. Calcular la suma de cada columna");
        System.out.println("11. Encontrar el elemento más pequeño de cada fila");
        System.out.println("12. Suma ambas diagonales");
        System.out.println("13. Buscar número");
        System.out.println("14. Intercambiar los elementos de la primera fila con los de la última");
        System.out.println("============ MISCELANEA ============");
        System.out.println("15. Crear un array y rellenarlo de números consecutivos");
        System.out.println("16. Crear un array y rellenarlo de ceros y unos en función de su posición (impar o par)");
        System.out.println("17. Creación de una matriz 3x3 por el usuario y comprobación de si es simétrica.");
        System.out.println("18. Crear una matriz identidad de tamaño 4x4.");
        System.out.println("19. Salir");
        System.out.println("=========================================");
        
        
        
       opcion = sc.nextInt();
       sc.nextLine();
        
        switch (opcion) {
        case 1 :
        	int acumulador = 0;
        	for(int i=0; i<arrayBidimensional.length; i++) {
    			System.out.println();
    			for (int j=0; j<arrayBidimensional[i].length; j++) {
    				acumulador += arrayBidimensional[i][j];
    			}
    			System.out.println(acumulador);
        	}
        	break;
        case 2 :
        	int mayorNum = 0;
        	for(int i=0; i<arrayBidimensional.length; i++) {
    			System.out.println();
    			for (int j=0; j<arrayBidimensional[i].length; j++) {
    				if(arrayBidimensional[i][j] > mayorNum) {
    					mayorNum = arrayBidimensional[i][j];
    					}
    				
    				}
    			}
        	System.out.println(mayorNum);
        	break;
        case 3 :        
        	for(int i=0; i<arrayBidimensional.length; i++) {
    			System.out.println();
    			for (int j=0; j<arrayBidimensional[i].length; j++) {
    				System.out.println(arrayBidimensional[i][i]);
    				}
    			}
        	
        	break;
        case 4 : 
        	
        	break;
        case 5 : 
        	
        	break;
        case 6 : 
        	
        	break;
        case 7 :
        	
        	break;
        case 8 : 
        	
        	break;
        case 9 :
        	
        	break;
        case 10: 
        	
        	break;
        case 11: 
        	
        	break;
        case 12: 
        	
        	break;
        case 13 :
        	
        	break;
        case 14:
        	
        	break;
        case 15:
        	
        	break;
        case 16:
        	
        	break;
        case 17:
        	
        	break;
        case 18:
        	
        	break;
        case 19: 
        	
        	break;
        default :
        	System.out.println("Elija una opcion");
        
        }
     
        }while(opcion != 19 ); 
    }
		
	}

