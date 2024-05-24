package Datos;

public class DTOBusquedaInscripciones {

    private Integer idCurso;
    private String nombreCurso;
    private Integer idEstudiante;
    private String nombreEstudiante;

    public DTOBusquedaInscripciones(Integer idCurso, String nombreCurso, Integer idEstudiante, String nombreEstudiante) {
        this.idCurso = idCurso;
        this.nombreCurso = nombreCurso;
        this.idEstudiante = idEstudiante;
        this.nombreEstudiante = nombreEstudiante;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Integer getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }
}
