import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		System.out.println("=================");
		System.out.println("Ejercicio 2");
		System.out.println("=================");
		
		Scanner sc = new Scanner(System.in);
		
		int tamaño;
		System.out.println("Digame un numero: ");
		tamaño = sc.nextInt();
		sc.nextLine();
		
		
		String[][] array = new String[tamaño][tamaño];
		
		for(int i=0; i<array.length; i++) {
			System.out.println();
			for (int j=0; j<array[i].length; j++) {
				System.out.println(array[tamaño][tamaño]);
			}
	}

}
	}
