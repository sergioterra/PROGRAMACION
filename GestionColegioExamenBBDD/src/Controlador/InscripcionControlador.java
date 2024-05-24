package Controlador;

import Datos.DTOBusquedaInscripciones;
import Modelo.InscripcionModelo;

import java.sql.SQLException;
import java.util.List;

public class InscripcionControlador {

    public int insertarInscripcion(Integer estudianteId, Integer cursoId) throws ClassNotFoundException, SQLException {
        InscripcionModelo im = new InscripcionModelo();
        return im.insertarIncripcion(estudianteId, cursoId);
    }

    public List<DTOBusquedaInscripciones> busquedaPedidos(Integer idCurso, String nombreCurso, Integer idEstudiante, String nombreEstudiante) throws ClassNotFoundException, SQLException {
        InscripcionModelo pm = new InscripcionModelo();
        return pm.busquedaInscripciones(idCurso, nombreCurso, idEstudiante, nombreEstudiante);
    }

    public Integer actualizarInscripciones( Integer idInscripcion,Integer idEstudiante, Integer idCurso) throws ClassNotFoundException, SQLException {
        InscripcionModelo pm = new InscripcionModelo();
        return pm.actualizarInscripcion(idInscripcion ,idEstudiante, idCurso);

    }

    public Integer borrarEstudiantes(Integer idEstudiante) throws ClassNotFoundException, SQLException {
        InscripcionModelo im = new InscripcionModelo();
        return im.borrarEstudiante(idEstudiante);

    }

}
