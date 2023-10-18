package ejerciciosestructurasdecontrol5;

public class ejerciciosestructurasdecontrol5 {
	public static void main(String[]args) {
	
		boolean genero = false;
		float altura = 4.00f;
		
		if(genero == true) {
			System.out.println("Es un hombre");
			if(altura <= 1.40f) {
				System.out.println("Es enano");
			}
			else if(altura > 1.40f && altura <= 1.65f){
				System.out.println("Es de estatura media");
			}
			else if(altura > 1.65f && altura <= 2.00f) {
				System.out.println("El de estatura alta");
			}
			else if(altura > 2.00){
				System.out.println("Es gigante");
			}
			}
		
		if(genero == false) {
			System.out.println("Es una mujer");
			if(altura <= 1.35f) {
				System.out.println("Es enana");
			}
			else if(altura > 1.35f && altura <= 1.65f){
				System.out.println("Es de estatura media");
			}
			else if(altura > 1.65f && altura <= 1.90f) {
				System.out.println("El de estatura alta");
			}
			else if(altura > 1.90){
				System.out.println("Es gigante");
			}
			}
		
		
		
		
	}

}
