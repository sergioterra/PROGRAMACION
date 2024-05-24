package Datos;

public class DTOInscripciones {

    private Integer estudianteId;
    private Integer cursoId;

    public DTOInscripciones(Integer estudianteId, Integer cursoId) {
        this.estudianteId = estudianteId;
        this.cursoId = cursoId;
    }



    public Integer getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(Integer estudianteId) {
        this.estudianteId = estudianteId;
    }

    public Integer getCursoId() {
        return cursoId;
    }

    public void setCursoId(Integer cursoId) {
        this.cursoId = cursoId;
    }
}
