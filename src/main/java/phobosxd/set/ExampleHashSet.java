package phobosxd.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExampleHashSet {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>();

        notas.add(5.8);
        notas.add(9.3);
        notas.add(6.5);
        notas.add(10.0);
        notas.add(5.4);
        notas.add(7.3);
        notas.add(3.8);
        notas.add(4.0);

        System.out.println(notas);

        notas.remove(3.8);
        System.out.println(notas);

        System.out.println(notas.size());

        Iterator<Double> it = notas.iterator();
        while (it.hasNext()) {
            System.out.println("-> " + it.next());
        }

        for (Double nota : notas) {
            System.out.println("--> " + nota);
        }

        notas.add(null);
        System.out.println(notas);

        notas.clear();
        System.out.println(notas.isEmpty());
    }
}
