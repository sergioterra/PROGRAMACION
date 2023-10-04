package conversor;

import java.util.Scanner;

public class Conversor {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el los grados Fahrenheid: ");
		
		int F = scanner.nextInt();
		
		scanner.close();
		
		int grados;
		grados = (F -32) * 5 / 9;
		
		System.out.println("Los grados son : " + grados);
		
		
		
		
		
	}

}
