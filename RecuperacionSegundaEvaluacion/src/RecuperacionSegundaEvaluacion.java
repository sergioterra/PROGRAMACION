


	import java.util.Random;
	import java.util.Scanner;

	import com.github.javafaker.Faker;

	public class RecuperacionSegundaEvaluacion {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Faker faker = new Faker();
	        Random rd = new Random();


	        System.out.println("Dígame un número: ");
	        int tam = Integer.parseInt(sc.nextLine());


	        System.out.println("El array está compuesto por: ");
	        String[] nombres = new String[tam];


	        for (int i = 0; i < nombres.length; i++) {
	        nombres[i] = faker.name().name();
	        }
	        for (int i = 0; i < nombres.length - 1; i++) {
	            System.out.print(nombres[i] + "-");
	        }
	        System.out.print(nombres[nombres.length - 1]);
	        System.out.println();


	        int cont = tam;


	        while (cont != 0) {
	            int aleatorio = rd.nextInt(tam);


	            if (nombres[aleatorio] == "x") {
	                System.out.println("Se ha errado el tiro ");
	            } else if (!nombres[aleatorio].equals(null)) {
	                System.out.print("Se ha dado a: ");
	                System.out.println(nombres[aleatorio]);
	                nombres[aleatorio] = "x";
	                cont--;
	            }
	        }
	        System.out.println("Se han eliminado todos los nombres.");
	    

	
	
	        System.out.println("-----------------Ejercicio 1---------------------");


	        System.out.println("Introduce un numero: ");
	        int n = sc.nextInt();
	        sc.nextLine();

	        int[] numeros = new int[n];

	        for (int i = 0; i < numeros.length; i++){
	            numeros[i] = (int) (Math.random() * n);
	        }

	        System.out.println("El array es: ");

	        int suma = 0;
	        for (int numero : numeros){
	            suma +=numero;
	        }


	        for (int numero : numeros){
	            System.out.print(numero + " ");
	        }

	        System.out.println("\nSuma de los numeros del Array: " + suma);

	        //Numeros pares e impares

	        int paresConta = 0;
	        int imparesConta = 0;

	        for (int numero : numeros){
	            if (numero % 2 == 0){
	                paresConta++;
	            }else{
	                imparesConta++;
	            }
	        }

	        System.out.println("Numeros pares: " + paresConta);
	        System.out.println("Numero impares: " + imparesConta);



	    
	    
	    	//El tercero suele fallar por eso ejecutalos de 1 en 1 porfa.
	        System.out.println("---------------Ejercicio3--------");

	    

	    

	        System.out.println("Introduce la cantidad de filas: ");
	        int filas = sc.nextInt();
	        sc.nextLine();
	        System.out.println("Introduce la cantidad de columnas: ");
	        int columnas = sc.nextInt();
	        sc.nextLine();

	        char[][] asientos = new char[filas][columnas];

	        SalaCine sala = new SalaCine(filas, columnas);

	        System.out.println("Estado inicial de la sala de cine: ");
	        sala.mostrarEstado();

	        while (true) {
	            System.out.println("Opciones\n");
	            System.out.println("1. Reservar asiento");
	            System.out.println("2. Cancelar Reserva");
	            System.out.println("3. Mostrar estado actual");
	            System.out.println("4. Mostrar estadisticas");
	            System.out.println("5. Salir");

	            System.out.println("Introduzca la opcion a realizar: ");
	            int opcion = sc.nextInt();
	            sc.nextLine();

	            switch (opcion) {
	                case 1:
	                    System.out.println("Introduce la fila del asiento a reservar");
	                    int filaRserva = sc.nextInt();
	                    sc.nextLine();
	                    System.out.println("Introduce el numero de asiento a reservar: ");
	                    int numeroReserva = sc.nextInt();
	                    sc.nextLine();

	                    sala.reservarAsiento(filaRserva, numeroReserva);

	                    if (sala.reservarAsiento(filaRserva, numeroReserva)) {
	                        System.out.println("El asiento se ha reservado correctamente");
	                    } else {
	                        System.out.println("Error al reservar el asiento");
	                    }
	                    break;
	                case 2:
	                    System.out.println("Introduce la fila del asiento a cancelar: ");
	                    int filaCancelacion = sc.nextInt();
	                    sc.nextLine();
	                    System.out.println("Introduce el asiento a cancelar: ");
	                    int asiento = sc.nextInt();
	                    sc.nextLine();
	                    sala.cancelarReserva(filaCancelacion, asiento);
	                    break;
	                case 3:
	                    System.out.println("El estado actual es: ");
	                    sala.mostrarEstado();
	                    break;
	                case 4:
	                    System.out.println("Las estadisticas son: ");
	                    sala.getPorcentajeOcupacion();
	                    break;
	                default:
	                    System.out.println("Introduce un numero para hacer una opcion. ");
	                    break;

	            }

	        }
	    }
	    }



	public class SalaCine {
        private static final String DISPONIBLE = "D";
        private static final String RESERVADO = "R";
        private String[][] asientos;


        public SalaCine(int filas, int columnas) {
            asientos = new String[filas][columnas];
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    asientos[i][j] = DISPONIBLE;
                }

            }
        }

        public void mostrarEstado() {
            for (int i = 0; i < asientos.length; i++) {
                for (int j = 0; j < asientos[i].length; j++) {
                    System.out.print(asientos[i][j] + " ");
                }
                System.out.println();
            }
        }

        public boolean reservarAsiento(int fila, int numero) {
            if (fila < 0 || fila >= asientos.length || numero < 0 || numero >= asientos[0].length) {
                return false;
            }
            if (asientos[fila][numero] == RESERVADO) {
                return false;
            }
            boolean b = asientos[fila][numero] == RESERVADO;
            return true;
        }


    public boolean cancelarReserva(int filaCancelacion, int asiento) {
        int fila = 0;
        int numero = 0;
        if (fila < 0 || fila >= asientos.length || numero < 0 || numero >= asientos[0].length){
            return false;
        }
        if (asientos[fila][numero] == DISPONIBLE) {
            return false;
        }
        asientos[fila][numero] = DISPONIBLE;
        return true;
    }

    public int getTotalAsientos(){
        return asientos.length * asientos[0].length;
    }

    public int getAsientosDisponibles(){
        int disponibles = 0;
        for (int i = 0; i < asientos.length; i++){
            for (int j = 0; j < asientos[i].length; j++){
                if (asientos[i][j] == DISPONIBLE){
                    disponibles++;
                }
            }
        }
        return disponibles;
    }

    public int getAsientosReservados(){
        return getTotalAsientos() - getAsientosDisponibles();
    }

    public double getPorcentajeOcupacion(){
        return (double) getAsientosReservados() / getTotalAsientos() * 100;
    }

	


	
	


