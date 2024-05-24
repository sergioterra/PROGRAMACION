package Modelo;

import Datos.DTOBusquedaInscripciones;
import Utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InscripcionModelo {



    public boolean existeIdEstudiante(Integer estudianteId) throws ClassNotFoundException, SQLException {
        String sql = "SELECT 1 FROM inscripciones WHERE EstudianteID = ? LIMIT 1";

        Connection con = DBUtils.conexionBBDD();

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, estudianteId);

        ResultSet rs = ps.executeQuery();

        return rs.next();
    }





    public Integer insertarIncripcion(Integer estudianteId, Integer cursoId) throws ClassNotFoundException, SQLException {
        String sql = "Insert into inscripciones (EstudianteID, CursoID)"
                + "VALUES(?,?)";
        Integer resultado = null;
        Connection conexxion = DBUtils.conexionBBDD();
        PreparedStatement ps = null;
        ps = conexxion.prepareStatement(sql);

        ps.setInt(1, estudianteId);
        ps.setInt(2, cursoId);


        resultado = ps.executeUpdate();
        conexxion.close();

        return resultado;

    }



    public List<DTOBusquedaInscripciones> busquedaInscripciones(Integer idCurso, String nombreCurso, Integer idEstudiante, String nombreEstudiante) throws ClassNotFoundException, SQLException {
        String querry = "SELECT inscripciones.CursoID, cursos.Nombre_del_Curso, inscripciones.EstudianteID, estudiantes.Nombre FROM cursos cursos inner join  inscripciones inscripciones on cursos.Nombre_del_Curso = inscripciones.EstudianteID inner join estudiantes estudiantes on inscripciones.EstudianteID = estudiantes.EstudianteID "
                + " WHERE inscripciones.CursoID LIKE ?" + " AND cursos.Nombre_del_Curso LIKE ? " + " AND inscripciones.EstudianteID LIKE ? " + " AND  estudiantes.Nombre LIKE ? ";

        Connection conexxionBD = DBUtils.conexionBBDD();
        PreparedStatement ps = conexxionBD.prepareStatement(querry);


        ps.setInt(1, idCurso);
        ps.setString(2, "%" + nombreCurso + "%");
        if (idEstudiante.equals(-1)) {
            ps.setString(3, "%");
        } else {
            ps.setInt(3, idEstudiante);
        }
        ps.setString(4,"%" +nombreEstudiante +"%" );


        ResultSet inscripciones = ps.executeQuery();
        List<DTOBusquedaInscripciones> listaInscripciones = new ArrayList<>();
        while (inscripciones.next()) {
            DTOBusquedaInscripciones bi = new DTOBusquedaInscripciones(inscripciones.getInt("CursoID"), inscripciones.getString("Nombre_del_Curso"), inscripciones.getInt("EstudianteID"), inscripciones.getString("Nombre"));
            listaInscripciones.add(bi);

        }

        return listaInscripciones;
    }




    public Integer actualizarInscripcion(Integer idInscripcion,Integer idEstudiante, Integer idCurso)
            throws ClassNotFoundException, SQLException {
        String sql = "UPDATE inscripciones SET "
                + "EstudianteID = CASE WHEN ? = '' THEN EstudianteID ELSE ? END, "
                + "CursoID = CASE WHEN ? = '' THEN CursoID ELSE ? END, "
                + "WHERE InscripcionID = ?";



        Integer resultado = null;

        try (Connection connection = DBUtils.conexionBBDD()) {
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, idInscripcion);


            if (idEstudiante.equals(-1)) {
                ps.setString(2, "");
                ps.setString(3, "");
            } else {
                ps.setInt(2, idEstudiante);
                ps.setInt(3, idEstudiante);
            }

            ps.setInt(4, idCurso);
            ps.setInt(5, idCurso);

            resultado = ps.executeUpdate();
        }
        return resultado;
    }


    public Integer borrarEstudiante(Integer idEstudiante) throws ClassNotFoundException, SQLException {
        String sql = "DELETE FROM inscripciones WHERE EstudianteID = ?";

        Integer resultado = 0;

        try (Connection connection = DBUtils.conexionBBDD()) {
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, idEstudiante);

            resultado = ps.executeUpdate();
        }
        return resultado;
    }




}
