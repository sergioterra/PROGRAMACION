import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("------------");
        System.out.println("Ejercicio 1.");
        System.out.println("------------");


        String nombreDirectorioEj1;
        System.out.print("Introduce el nombre del directorio: ");
        nombreDirectorioEj1 = scanner.nextLine();

        String patronBusqueda;
        System.out.print("Introduce el patrón de búsqueda, letra o palabra: ");
        patronBusqueda = scanner.nextLine();

        List<String> archivosEncontrados = buscarArchivos(new File(nombreDirectorioEj1), patronBusqueda);
        if (archivosEncontrados.isEmpty()) {
            System.out.println("No se encontraron archivos que coincidan con el patrón de búsqueda.");
        } else {

            for (String archivo : archivosEncontrados) {
                System.out.print("Archivos encontrados que coinciden con el patrón de búsqueda:   ");
                System.out.println(archivo);
            }
        }






        System.out.println("-------------------------------");
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


        System.out.println("--------------------");
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


    private static boolean validarEdad(int edad) {
        return edad > 0;
    }

    private static boolean validarCorreo(String correo) {
        return correo.contains("@");
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





















