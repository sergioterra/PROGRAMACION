import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusquedaDirectorios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ejercicio 1.");

        String nombreDirectorio;
        System.out.print("Introduce el nombre del directorio: ");
        nombreDirectorio = scanner.nextLine();

        String patronBusqueda;
        System.out.print("Introduce el patrón de búsqueda, letra o palabra: ");
        patronBusqueda = scanner.nextLine();

        List<String> archivosEncontrados = buscarArchivos(new File(nombreDirectorio), patronBusqueda);
        if (archivosEncontrados.isEmpty()) {
            System.out.println("No se encontraron archivos que coincidan con el patrón de búsqueda.");
        } else {

            for (String archivo : archivosEncontrados) {
                System.out.print("Archivos encontrados que coinciden con el patrón de búsqueda:   ");
                System.out.println(archivo);
            }
        }


    }


    private static List<String> buscarArchivos(File directorio, String patronBusqueda) {
        List<String> archivosEncontrados = new ArrayList<>();
        File[] archivos = directorio.listFiles();
        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isDirectory()) {
                    archivosEncontrados.addAll(buscarArchivos(archivo, patronBusqueda));
                } else if (archivo.getName().contains(patronBusqueda)) {
                    archivosEncontrados.add(archivo.getAbsolutePath());
                }
            }
        }
        return archivosEncontrados;
    }
}



















