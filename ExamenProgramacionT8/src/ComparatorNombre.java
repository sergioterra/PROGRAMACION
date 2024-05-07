import java.util.Comparator;

public class ComparatorNombre implements Comparator<Alumnos> {
    @Override
    public int compare(Alumnos o1, Alumnos o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
