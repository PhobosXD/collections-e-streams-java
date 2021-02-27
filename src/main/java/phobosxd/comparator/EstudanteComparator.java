package phobosxd.comparator;

import java.util.Comparator;

public class EstudanteComparator implements Comparator<EstudanteComparable> {
    @Override
    public int compare(EstudanteComparable estudanteComparable, EstudanteComparable t1) {
        return estudanteComparable.getIdade() - t1.getIdade();
    }

    @Override
    public Comparator<EstudanteComparable> reversed() {
        return (estudanteComparable, t1) -> t1.getIdade() - estudanteComparable.getIdade();
    }
}
