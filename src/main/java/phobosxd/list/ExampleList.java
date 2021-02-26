package phobosxd.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExampleList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Igor");
        nomes.add("Iasmin");
        nomes.add("Maria");
        nomes.add("Joao");

        System.out.println(nomes);

        Collections.sort(nomes);
        System.out.println(nomes);

        nomes.set(3, "Larissa");
        System.out.println(nomes);

        nomes.remove(0);
        System.out.println(nomes);

        nomes.remove("Maria");
        System.out.println(nomes);

        String nome = nomes.get(1);
        System.out.println(nome);

        Integer tamanho = nomes.size();
        System.out.println(tamanho);

        Boolean contem = nomes.contains("Anderson");
        System.out.println(contem);

        Boolean vazio = nomes.isEmpty();
        System.out.println(vazio);

        /*nomes.clear();
        vazio = nomes.isEmpty();
        System.out.println(vazio);*/

        Integer posicao = nomes.indexOf("Iasmin");
        System.out.println(posicao);
        posicao = nomes.indexOf("Maria");
        System.out.println(posicao);

        for (String item: nomes) {
            System.out.println(item);
        }

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            System.out.println("-> " + iterator.next());
        }

        List<String> teste = new ArrayList<>();
        teste.add("nome1");
        teste.add("nome2");
        System.out.println(teste);

        nomes.addAll(3, teste);
        System.out.println(nomes);
    }
}
