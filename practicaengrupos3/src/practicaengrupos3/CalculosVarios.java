package practicaengrupos3;

import java.util.Scanner;

public class CalculosVarios {

	public static float AreaCirculoDiametro(){
		Scanner sc = new Scanner(System.in);
		float diametro;
		
		System.out.println("Introduce el diametro del circulo");
		diametro = sc.nextFloat();
		sc.nextLine();
		
		float area;
		area = (float) ((Math.PI * diametro) / 4);
		System.out.println("El area del circulo es: " + area);
		
		return 0;
	}
	public static float AreaCirculoRadio(){
		Scanner sc = new Scanner(System.in);
		float radio;
		
		System.out.println("Introduce el radio del circulo");
		radio = sc.nextFloat();
		sc.nextLine();
		
		float area;
		area = (float) ((Math.PI * (radio * radio ))) ;
		System.out.println("El area del circulo es: " + area);
		
		return 0;
	}
	public static float PerimetroPoligonorRegular(){
		Scanner sc = new Scanner(System.in);
		float Lado1;
		float Lado2;
		float Lado3;
		float Lado4;
		
		System.out.println("Introduce el primer lado del poligono: ");
		Lado1 = sc.nextFloat();
		sc.nextLine();
		System.out.println("Introduce el segundo lado del poligono: ");
		Lado2 = sc.nextFloat();
		sc.nextLine();
		System.out.println("Introduce el tercer lado del poligono: ");
		Lado3 = sc.nextFloat();
		sc.nextLine();
		System.out.println("Introduce el cuarto lado del poligono: ");
		Lado4 = sc.nextFloat();
		sc.nextLine();
		
		
		float perimetro;
		perimetro = Lado1 + Lado2 + Lado3 + Lado4;
		System.out.println("El perimetro es: " + perimetro);
		
		return 0;
	}
	public static float PerimetroTrianguloEquilatero() {
		
		Scanner sc = new Scanner(System.in);
		float lado1;
		
		System.out.println("Introduce un lado del triangulo equilatero: ");
		lado1 = sc.nextFloat();
		sc.nextLine();
		
		float perimetro;
		perimetro = lado1*3;
		
		System.out.println("El perimtro del triangulo equilatero es: "+ perimetro);
		
		return 0;
	}
	
	public static float AreaTrianguloEquilatero() {
		
		Scanner sc = new Scanner(System.in);
		float lado;
		
		System.out.println("Introduce la longitud del lado: ");
		lado = sc.nextFloat();
		sc.nextLine();
		
		float area;
		area = (float) ((Math.sqrt(3) / 4) * Math.pow(lado, 2));
		
		System.out.println("El area del triangulo es: " + area);
		
		return 0;
	}
}
