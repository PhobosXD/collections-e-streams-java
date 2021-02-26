package phobosxd.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExampleLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> sequencia = new LinkedHashSet<>();

        sequencia.add(1);
        sequencia.add(2);
        sequencia.add(4);
        sequencia.add(8);
        sequencia.add(16);

        System.out.println(sequencia);

        sequencia.remove(4);
        System.out.println(sequencia);

        Iterator<Integer> it = sequencia.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (Integer num : sequencia) {
            System.out.println("-> " + num);
        }

        System.out.println(sequencia.size());

        sequencia.clear();
        System.out.println(sequencia.isEmpty());
    }
}
