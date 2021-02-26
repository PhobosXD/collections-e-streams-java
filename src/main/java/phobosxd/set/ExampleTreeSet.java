package phobosxd.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExampleTreeSet {
    public static void main(String[] args) {
        TreeSet<String> capitais = new TreeSet<>();

        capitais.add("Porto Alegre");
        capitais.add("Florianopolis");
        capitais.add("Curitiba");
        capitais.add("Sao Paulo");
        capitais.add("Rio de Janeiro");
        capitais.add("Belo Horizonte");

        System.out.println(capitais);

        System.out.println(capitais.first());

        System.out.println(capitais.last());

        System.out.println(capitais.lower("Florianopolis"));

        System.out.println(capitais.higher("Florianopolis"));

        System.out.println(capitais);

        System.out.println(capitais.pollFirst());

        System.out.println(capitais.pollLast());

        System.out.println(capitais);

        Iterator<String> it = capitais.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (String capital : capitais) {
            System.out.println(capital);
        }

        System.out.println(capitais.size());

        capitais.clear();
        System.out.println(capitais.isEmpty());
    }
}
