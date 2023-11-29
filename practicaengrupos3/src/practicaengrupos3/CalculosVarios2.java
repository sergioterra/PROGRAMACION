package practicaengrupos3;

import java.util.Scanner;

public class CalculosVarios2 {

	private float libras;
	private float yardas;
	
	public float YardasMetros() {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Introdce las yardas: ");
		yardas = sc.nextFloat();
		sc.nextLine();
		
		float conversion;
		conversion = (float) ((yardas * 1) / 1.0936);
		
		System.out.println("Las yardas introducidas se conviertena estos metros: " + conversion);
				
		
		return 0;
	}
	
	public float FarenheitCentigrados() {
		
		Scanner sc = new Scanner(System.in);
		
		float farenheit;
		
		System.out.println("Introduzca los grados farenheit: ");
		farenheit = sc.nextFloat();
		sc.nextLine();
		
		float conversion;
		conversion = (float) ((farenheit - 32) / 1.8);
		
		System.out.println("La conversion sale a " + conversion + "gradoscentigrados");
		
		return 0;
	}
	
	public float LibrasKilos(float libras) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduzca las libras : ");
		libras = sc.nextFloat();
		sc.nextLine();
		
		float conversion;
		conversion = (float) (libras / 2.2046);
		
		System.out.println("Las libras introducidas son equivalestes a estos kilos: "+ conversion);
		
		return 0;
	}

	
	
	public void setLibras(float libras) {
		this.libras = libras;
	}
	public float getLibras() {
		return libras;
	}
	public void setYardas(float yardas) {
		this.yardas = yardas;
	}
	public float getYardas() {
		return yardas;
	}
}


