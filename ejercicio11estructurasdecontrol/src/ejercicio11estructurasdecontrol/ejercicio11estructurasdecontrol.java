package ejercicio11estructurasdecontrol;

public class ejercicio11estructurasdecontrol {
	public static void main(String[] args) {
		
		float consumo = 200f;
		
		
		if(consumo < 199f) {
			System.out.println("El precio es de 1,20 la unidad. El total de la factura es de: " + consumo * 1.2 );
		}
		else if(consumo >= 200f && consumo <= 400f) {
			System.out.println("El precio es de 1.50 la unidad. El total de la factura es de: " + consumo * 1.5 );
		}
		else{	
			System.out.println("El precio es de 3 la unidad. El total de la factura es de: " + consumo * 3);		
		}
	}

}
