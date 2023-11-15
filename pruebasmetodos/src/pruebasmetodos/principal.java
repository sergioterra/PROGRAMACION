package pruebasmetodos;

public class principal {
	public static void main(String[] args) {
		
		int ladoA = 2;
		int ladoB = 10;
		
		
		int area = calculoAreaRectangulo(ladoA, ladoB);
		
		System.out.println("El area es : " + area);
		
		int anno = 2000; 
		
		esBisiesto(anno);
	}
	
public static int calculoAreaRectangulo(int ladoA, int ladoB) {
	return ladoA * ladoB;
}

public static boolean esBisiesto(int anno) {
	if(anno %400 == 0 || anno % 4 == 0) {
		return true;
	} else {
		return false;
	}
}
}
