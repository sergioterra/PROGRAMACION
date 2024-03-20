import java.util.Scanner;

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

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

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



