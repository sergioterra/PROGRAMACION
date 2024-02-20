package javafaker;

import java.util.Iterator;
import java.util.Scanner;

import com.github.javafaker.Faker;

//para importar el faker es solo mentiendote a propiedades de la todo el proyecto y te metes a las bibliotecas y los añadas, 
//luego tienes que ponere IMPORT FAKER y te sale.

public class ejercicio {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tamaño;
		
		Faker faker =new Faker();
		
		System.out.println("Por favor escriba el tamaño del array que almacenara las palabras");
		
		tamaño = sc.nextInt();
		sc.nextLine();
		
		System.out.println("=================================================================");
		System.out.println("Por favor elija la tematica a utilizar para rellenar el array:");
		System.out.println("Nombres de cervezas.");
		System.out.println("Frases del gran Lebowski.");
		System.out.println("Personajes de Harry Potter.");
		System.out.println("=================================================================");
		
		int opcion;
		
		opcion = sc.nextInt();
		sc.nextLine();
		
		System.out.println("===============================================================");
		System.out.println("Imprimiendo la array...");
		System.out.println("================================================================");
		
		String[] cervezas = new String[tamaño];
		String[] lebowski = new String[tamaño];
		String[] harry = new String[tamaño];
		
		switch(opcion) {
		case 1:
			
			
			for(int i=0; i<tamaño; i++) {
				cervezas[i] = faker.beer().name();
				System.out.println((i) + ". " + cervezas);
			}
			System.out.println("/nDigame por favor");
			
			break;
		case 2:
			
			
			for(int j =0; j<tamaño; j++) {
				lebowski[j] = faker.lebowski().toString();
				System.out.println((j) + ". " + lebowski);
			}
			break;
		case 3:
		
			
			for(int z = 0; z< tamaño; z++) {
				harry[z] = faker.harryPotter().character();
				System.out.println((z) + ". " + harry);
			}
			break;
		default:      
			System.out.println("Elija una opcion del 1 al 3");
			break;
			
		}
		
		System.out.println("=============================================================");
		
		System.out.println("Digame la palabra que quiere encontrar en el array");
		
		String palabra;
		
		palabra = sc.nextLine();
		
		for(int i = 0; i<tamaño; i++) {
			if(palabra == cervezas[i]) {
				System.out.println("Encontre la palabra: " + palabra);
			}
		}
		
		
	}

}
