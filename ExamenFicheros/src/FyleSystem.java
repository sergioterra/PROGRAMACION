import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FyleSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ejercicio 3.");
        System.out.println("Manejo de FyleSystem.");
        System.out.println("--------------------");

        String nombreFicheroSalida;
        System.out.print("Introduce el nombre del fichero donde escribir los resultados: ");
        nombreFicheroSalida = scanner.nextLine();

        String nombreDirectorio;
        System.out.print("Introduce el nombre del directorio: ");
        nombreDirectorio = scanner.nextLine();

        try {
            File directorio = new File(nombreDirectorio);
            File ficheroSalida = new File(nombreFicheroSalida);
            listarDirectorio(directorio, ficheroSalida);
            System.out.println("El contenido del directorio se ha listado correctamente.");
        } catch (IOException e) {
            System.err.println("Error al listar el directorio: " + e.getMessage());
        }

        String nombreFichero;
        System.out.print("Introduce el nombre de un fichero: ");
        nombreFichero = scanner.nextLine();


        String palabraBusqueda;
        System.out.print("Introduce una palabra para buscar en el fichero: ");
        palabraBusqueda = scanner.nextLine();

        try {
            int apariciones = buscarPalabraEnFichero(nombreFichero, palabraBusqueda);
            System.out.println("La palabra '" + palabraBusqueda + "' aparece " + apariciones + " veces en el fichero.");
        } catch (IOException e) {
            System.err.println("Error al buscar la palabra en el fichero: " + e.getMessage());
        }

    }

    private static void listarDirectorio(File directorio, File ficheroSalida) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroSalida))) {
            escribirDirectorio(directorio, "", bw);
        }
    }

    private static void escribirDirectorio(File directorio, String prefijo, BufferedWriter bw) throws IOException {
        File[] archivos = directorio.listFiles();
        if (archivos != null) {
            for (File archivo : archivos) {
                bw.write(prefijo + archivo.getName());
                bw.newLine();
                System.out.println(prefijo + archivo.getName());
                if (archivo.isDirectory()) {
                    escribirDirectorio(archivo, prefijo + "  ", bw);
                }
            }
        }
    }

    private static int buscarPalabraEnFichero(String nombreFichero, String palabraBusqueda) throws IOException {
        int apariciones = 0;
        try (Scanner scanner = new Scanner(new File(nombreFichero))) {
            while (scanner.hasNext()) {
                String palabra = scanner.next();
                if (palabra.equals(palabraBusqueda)) {
                    apariciones++;
                }
            }
        }
        return apariciones;
    }
}
