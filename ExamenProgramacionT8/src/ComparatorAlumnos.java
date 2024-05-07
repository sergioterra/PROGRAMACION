import java.util.Comparator;

public class ComparatorAlumnos implements Comparator<Alumnos> {

    @Override
    public int compare(Alumnos o1, Alumnos o2) {
        return o1.getDNI().compareTo(o2.getDNI());
    }
}
