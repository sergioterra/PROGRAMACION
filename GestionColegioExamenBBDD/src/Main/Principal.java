package Main;

import Vista.VistaInscripciones;

import java.sql.SQLException;

public class Principal {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        VistaInscripciones vi = new VistaInscripciones();
        vi.menuInsertarInscripcion();
        vi.menuBusqueda();
        vi.menuActualizar();
        vi.menuBorrarEstudiante();
    }
}
