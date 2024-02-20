import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		System.out.println("=================");
		System.out.println("Ejercicio 1");
		System.out.println("=================");
		
		
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		String acumulador;
		String[] arrayUnidimensional = new String[numero];
		
		System.out.println("Introduzca un numero: ");
		numero = sc.nextInt();
		sc.nextLine();
		
		for(int j = 0; j< numero; j++) {
			
			
			
			System.out.println("Introduzaca un numero o una letra: ");
			acumulador = sc.nextLine();
			sc.nextLine();
			
			for(int i=0; i<arrayUnidimensional.length; i++) {
				System.out.println();
				acumulador += arrayUnidimensional[numero];
				
				System.out.println("El total es : " + acumulador);
			}
	    	}
			
	}
}
