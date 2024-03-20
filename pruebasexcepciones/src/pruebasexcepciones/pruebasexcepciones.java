package pruebasexcepciones;

import java.util.Scanner;

import com.kike.calculos.calculos;

public class pruebasexcepciones {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean valoresOk = false;
		
		do {
			System.out.println("Porfavor digame el primer numero: ");
		
			Integer valorUno = Integer.parseInt(sc.nextLine());
		
			System.out.println("Porfavor digame el segundo numero: ");
		
			Integer valorDos = Integer.parseInt(sc.nextLine());
		
			calculos cal = new calculos();
		
		
			try {
				cal.dividirYSumar(valorUno, valorDos);
			
			}catch(ArithmeticException a) {
				System.out.println("No se puede dividir por 0");
			}
		
		
		}while(!valoresOk);
	}
}
