import java.util.Comparator;

public class ComparatorEdad implements Comparator<Alumnos> {
    @Override
    public int compare(Alumnos o1, Alumnos o2) {
        return o1.getEdad().compareTo(o2.getEdad());
    }
}
