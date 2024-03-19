import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RegistroUsuarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ejercicio 2.");
        System.out.println("Sistema de Registro de Usuarios. ");
        System.out.println("-------------------------------");

        String nombreArchivo;
        System.out.print("Introduce el nombre del archivo donde desea guardar los datos: ");
        nombreArchivo = scanner.nextLine();

        String nombre;
        System.out.print("Introduce su nombre: ");
        nombre = scanner.nextLine();

        int edad = 0;
        boolean edadValida = false;
        while (!edadValida) {
            try {
                System.out.print("Introduce su edad: ");
                edad = scanner.nextInt();
                scanner.nextLine();
                edadValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: La edad debe ser un número entero.");
                scanner.nextLine();
            }
        }
        String correo;
        System.out.print("Introduce su correo electrónico: ");
        correo = scanner.nextLine();

        if (!validarEdad(edad) || !validarCorreo(correo)) {
            System.out.println("Error: Los datos ingresados no son válidos.");
            return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            bw.write("Nombre: " + nombre + ", Edad: " + edad + ", Correo: " + correo + "\n");
            System.out.println("Usuario registrado con exito.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static boolean validarEdad(int edad) {
        return edad > 0;
    }

    private static boolean validarCorreo(String correo) {
        return correo.contains("@");
    }
}
