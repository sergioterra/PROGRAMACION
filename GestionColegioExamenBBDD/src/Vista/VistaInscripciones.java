package Vista;

import Controlador.InscripcionControlador;
import Datos.DTOBusquedaInscripciones;
import Datos.DTOInscripciones;
import Modelo.InscripcionModelo;
import Utils.DBUtils;
import Utils.TerraScanner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VistaInscripciones {

    public void menuInsertarInscripcion() throws ClassNotFoundException, SQLException {
        Scanner sc = TerraScanner.getInstance();

        Integer estudianteId = comprobacionIdEstudiante(sc);


        /*System.out.println("Introduzca el id del estudiante");
        Integer estudianteId = sc.nextInt();
        sc.nextLine();
*/
        System.out.println("Dime el id del curso");
        Integer cursoId = sc.nextInt();
        sc.nextLine();


        DTOInscripciones insertarInscripcion = new DTOInscripciones(estudianteId, cursoId);
        Integer resultado = new InscripcionControlador().insertarInscripcion(insertarInscripcion.getEstudianteId(), insertarInscripcion.getCursoId());

        if (resultado != 0) {
            System.out.println("Inscripcion Insertada con exito");

        }

    }





    private static Integer comprobacionIdEstudiante(Scanner sc) throws ClassNotFoundException, SQLException {
        Integer estudianteId = null;
        boolean existeIdEstudiante = false;
        while (!existeIdEstudiante) {
            System.out.println("Dime el ID del Estudiante");
            try {
                String entry = sc.nextLine();
                if (entry.isEmpty() || entry.isBlank()){
                    return -1;
                }
                estudianteId = Integer.parseInt(entry);
                if (!DBUtils.existeIdEstudiante(estudianteId)) {
                    System.err.println("ERROR: EL ID DEL ESTUDIANTE NO EXISTE");
                } else {
                    existeIdEstudiante = true;
                }
            } catch (Exception e) {
                System.out.println("No se ha introducido un numero de ID del estudiante");
            }


        }
        return estudianteId;
    }


    public void menuBusqueda() throws ClassNotFoundException, SQLException {
        Scanner sc = TerraScanner.getInstance();


        System.out.println("Introduzca el id del curso");
        Integer idCurso = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce el nombre del curso");
        String nombreCurso = sc.nextLine();
        Integer idEstudiante = comprobacionIdEstudiante(sc);
        System.out.println("Dime el nombre del estudiante");
        String nombreEstudiante = sc.nextLine();



        InscripcionControlador controladorInscripcion = new InscripcionControlador();

        List<DTOBusquedaInscripciones> listaBusquedaInscripciones = controladorInscripcion.busquedaPedidos(idCurso, nombreCurso, idEstudiante, nombreEstudiante);
        for (DTOBusquedaInscripciones p : listaBusquedaInscripciones) {
            System.out.println(p.getIdCurso()+ " " + p.getNombreCurso()+ " " + p.getIdEstudiante()+ " "+ p.getNombreEstudiante()+" ");
        }

    }





    public void menuActualizar() throws ClassNotFoundException, SQLException {
        Scanner sc = TerraScanner.getInstance();

        System.out.println("Introduce el id de la inscripciones");
        Integer idInscripcion = sc.nextInt();
        sc.nextLine();

        Integer idEstudiante = comprobacionIdEstudiante(sc);
        while (idEstudiante.equals(-1)){
            idEstudiante = comprobacionIdEstudiante(sc);
        }
        System.out.println("Dime el id del curso");
        Integer idCurso = sc.nextInt();
        sc.nextLine();



        Integer resultado = new InscripcionControlador().actualizarInscripciones(idInscripcion ,idEstudiante, idCurso);

        if (resultado != 0) {
            System.out.println("actualizado con exito");

        }


    }


    public void menuBorrarEstudiante() throws ClassNotFoundException, SQLException {
        Scanner sc = TerraScanner.getInstance();

        Integer idEstudiante = comprobacionIdEstudiante(sc);

        while (idEstudiante.equals(-1)){
            idEstudiante = comprobacionIdEstudiante(sc);
        }

        Integer resultado = new InscripcionControlador().borrarEstudiantes(idEstudiante);

        if (resultado != 0) {
            System.out.println("Estudiante borrado con exito");

        }


    }




}
