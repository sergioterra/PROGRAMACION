import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    static List<Alumnos> listaAlumnos = new ArrayList<>();
    static List<Notas> listaNotas = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);


        String rutaAlumnos;
        System.out.println("Introduzca la ruta del fichero alumnos: ");
        rutaAlumnos = sc.nextLine();


        FileReader fr = new FileReader(rutaAlumnos);
        BufferedReader br = new BufferedReader(fr);

        String linea;

        while ((linea = br.readLine())!= null){
            String[] array = linea.split(";");
            Alumnos a = new Alumnos(array[0],array[1],Integer.parseInt(array[2]));
            listaAlumnos.add(a);
        }



        String rutaNotas;
        System.out.println("Introduzca la ruta del fichero de notas: ");
        rutaNotas = sc.nextLine();


        FileReader fr2 = new FileReader(rutaNotas);
        BufferedReader br2 = new BufferedReader(fr2);

        String linea2;

        while ((linea2 = br2.readLine())!= null){
            String[] array = linea2.split(";");
            Notas n = new Notas(array[0],array[1], Float.parseFloat(array[2]));
            listaNotas.add(n);
        }


        Collections.sort(listaAlumnos, new ComparatorAlumnos());

        System.out.println("===================LISTA DE ALUMNOS ==============================");
        for (Alumnos a : listaAlumnos){
            for (Notas n : listaNotas){
                if (a.getDNI().equals(n.getDNI())){
                    System.out.println(a.toString());

                    System.out.println(n.toString());
                }
            }

        }

        System.out.println(" ");

        Collections.sort(listaAlumnos, new ComparatorEdad());

        System.out.println("=====================LISTA DE ALUMNOS POR EDAD==============================");
        for (Alumnos a : listaAlumnos){
            for (Notas n : listaNotas){
                if (a.getDNI().equals(n.getDNI())){
                    System.out.println(a.toString());

                    System.out.println(n.toString());

                }
            }
        }
        System.out.println("");

        Collections.sort(listaAlumnos, new ComparatorNombre());
        System.out.println("===================LISTA DE ALUMNOS POR NOMBRE ALFABETICO=======================");
        for (Alumnos a : listaAlumnos){
            for (Notas n : listaNotas){
                if (a.getDNI().equals(n.getDNI())){
                    System.out.println(a.toString());

                    System.out.println(n.toString());
                }
        }
        }


        System.out.println("");
        Collections.sort(listaAlumnos, new ComparatorDNI());
        System.out.println("====================LISTA DE ALUMNOS POR DNI======================================");
        for (Alumnos a : listaAlumnos){
            for (Notas n : listaNotas){
                if (a.getDNI().equals(n.getDNI())){
                    System.out.println(a.toString());

                    System.out.println(n.toString());
                }
        }
        }

        System.out.println("");

        System.out.println("===============================Listado de alumnos ordenados de mayor a menor por número de suspensos:=====================");
        Map<String, Integer> suspensosMap = new HashMap<>();
        for (Alumnos a : listaAlumnos) {
            int suspensos = 0;
            for (Notas n : listaNotas) {
                if (n.getDNI().equals(a.getDNI()) && n.getNota() < 5) {
                    suspensos++;
                }
            }
            suspensosMap.put(a.getNombre(), suspensos);
        }
        suspensosMap.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(entry -> System.out.println("Nombre: " + entry.getKey() + ", Suspensos: " + entry.getValue()));


        System.out.println("");

        System.out.println("============================Listado de alumnos ordenados de mayor a menor por nota media:==========================================");
        Map<String, Double> notaMediaMap = new HashMap<>();
        for (Alumnos a : listaAlumnos) {
            int totalNotas = 0;
            int cantidadNotas = 0;
            for (Notas n : listaNotas) {
                if (n.getDNI().equals(a.getDNI())) {
                    totalNotas += n.getNota();
                    cantidadNotas++;
                }
            }
            double notaMedia = cantidadNotas > 0 ? (double) totalNotas / cantidadNotas : 0;
            notaMediaMap.put(a.getNombre(), notaMedia);
        }
        notaMediaMap.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(entry -> System.out.println("Nombre: " + entry.getKey() + ", Nota Media: " + entry.getValue()));


    }


}


