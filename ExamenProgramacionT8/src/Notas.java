public class Notas {

    private String DNI;
    private String asignatura;
    private Float nota;


    @Override
    public String toString() {
        return "Notas{" +
                "DNI='" + DNI + '\'' +
                ", asignatura='" + asignatura + '\'' +
                ", nota=" + nota +
                '}';
    }


    public Notas(String DNI, String asignatura, Float nota) {
        this.DNI = DNI;
        this.asignatura = asignatura;
        this.nota = nota;
    }


    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }
}
