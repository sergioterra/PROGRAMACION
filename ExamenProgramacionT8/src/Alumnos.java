public class Alumnos {

    private String DNI;
    private String nombre;
    private Integer edad;

    @Override
    public String toString() {
        return "Alumnos{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public Alumnos(String DNI, String nombre, Integer edad) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
