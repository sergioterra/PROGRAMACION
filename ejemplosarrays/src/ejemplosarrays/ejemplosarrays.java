package ejemplosarrays;

public class ejemplosarrays {
	public static void main(String[] args) {
		int[][] arraybidimensional = {
				{23, 44, 67, 22},
				{55, 43, 33, 11},
				{42, 66, 31, 11},
				{6, 22, 55, 43}
				};
		int miVariable = arraybidimensional[1] [2];
		System.out.println(miVariable);
		
		arraybidimensional [2][1] = 22;
		
		for(int i = 0; i< arraybidimensional.length; i++) {
			for( int j = 0; j<arraybidimensional[i].length; j++) {
				System.out.println(arraybidimensional[i][j]);
			}
			System.out.println("\n");
			
			}
		
		}
	}


