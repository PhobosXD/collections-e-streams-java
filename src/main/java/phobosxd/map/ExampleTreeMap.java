package phobosxd.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExampleTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> capitais = new TreeMap<>();

        capitais.put("RS", "Porto Alegre");
        capitais.put("SC", "Florianopolis");
        capitais.put("PR", "Curitiba");
        capitais.put("SP", "Sao Paulo");
        capitais.put("RJ", "Rio de Janeiro");
        capitais.put("MG", "Belo Horizonte");

        System.out.println(capitais);

        //Chave do elemento no top da árvore
        System.out.println(capitais.firstKey());

        //Chave do último elemento no final da árvore
        System.out.println(capitais.lastKey());

        //Chave do primeiro elemento abaixo
        System.out.println(capitais.lowerKey("SC"));

        //Chave do primeiro elemento acima
        System.out.println(capitais.higherKey("SC"));

        System.out.println(capitais);

        //Primeiro elemento no topo da árvore
        System.out.println(capitais.firstEntry().getKey() + " = " + capitais.firstEntry().getValue());

        //Último elemento no final da árvore
        System.out.println(capitais.lastEntry().getKey() + " = " + capitais.lastEntry().getValue());

        //Retorna e remove o primeiro elemento
        Map.Entry<String, String> firstEntry = capitais.pollFirstEntry();

        //Retorna e remove o último elemento
        Map.Entry<String, String> lastEntry = capitais.pollLastEntry();

        System.out.println(firstEntry.getKey() + " = " + firstEntry.getValue());
        System.out.println(lastEntry.getKey() + " = " + lastEntry.getValue());
        System.out.println(capitais);

        //Navegando na estrutura
        Iterator<String> it = capitais.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key + " = " + capitais.get(key));
        }

        System.out.println(capitais);

        for (String capital : capitais.keySet()) {
            System.out.println(capital + " = " + capitais.get(capital));
        }

        System.out.println(capitais);

        for (Map.Entry<String, String> capital : capitais.entrySet()) {
            System.out.println(capital.getKey() + " = " + capital.getValue());
        }
    }
}
