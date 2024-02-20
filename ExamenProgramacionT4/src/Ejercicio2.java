import java.util.Scanner;

import com.github.javafaker.Faker;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		System.out.println("=================");
		System.out.println("Ejercicio 2");
		System.out.println("=================");
		
		int numero;
		
		Scanner sc = new Scanner(System.in);
	    Faker faker = new Faker();
	    
		
	
		
		System.out.println("Introduzca un numero");
	    numero = sc.nextInt();
	    sc.nextLine();
	    
	    
	    System.out.println("El array esta compuesto por :");
	    
	    for(int i = 0; i < numero; i++) {
	    	String[] array = new String[numero];
	    	
	    	System.out.print(faker.dragonBall().character() + " - ");
	    	array[numero] = sc.nextLine();
	    		    	
	    }
	    
	    for(int j = 0; j < numero; j++ ) {
	    	 {
	    		
	    	}
	    }
	    
	    
		
	}
}
