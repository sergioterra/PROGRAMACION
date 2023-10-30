package ejercicio13estructurasdecontrol;

public class ejercicio13estructurasdecontrol {
	public static void main(String[] args) {
		
		int numero = 7;
		int i;
		
		System.out.println("El resultado de la tabla de multiplicacion del " + numero + " es: ");
		System.out.println("==============================================================");
		
		for(i=1; i>=1 && i<=10; i++ ) {
			System.out.println(numero + " X " + i + " = " + numero * i);
		}
	}

}
