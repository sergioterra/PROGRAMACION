package ejerciciodeestructurasdecontrol7;

public class ejerciciodeestructurasdecontrol7 {
	public static void main(String[] args) {
		
		int lado1 = 1;
		int lado2 = 1;
		int lado3 = 1;
		
		
		
		if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
			System.out.println("Es equilatero");
		}
		
		else if(lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
			System.out.println("Es escaleno");

		}
		
		else {
			System.out.println("Es isosceles");
		}
	}
	

}
