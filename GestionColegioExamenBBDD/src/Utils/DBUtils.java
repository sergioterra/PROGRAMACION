package Utils;

import Modelo.InscripcionModelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {

    private DBUtils() {

    }

    public static Connection conexionBBDD() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String servidor = "jdbc:mysql://localhost:3306/estudiantes_cursos_inscripciones";
        String username = "root";
        String password = "PracticaRoot";
        Connection conexionBD = DriverManager.getConnection(servidor, username, password);
        System.out.println(conexionBD);
        return conexionBD;
    }



    public static boolean existeIdEstudiante(Integer estudianteID) throws ClassNotFoundException, SQLException {
        return new InscripcionModelo().existeIdEstudiante(estudianteID);
    }
}
