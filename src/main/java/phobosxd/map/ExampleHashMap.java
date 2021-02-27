package phobosxd.map;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {
    public static void main(String[] args) {
        Map<String, Integer> campeoes = new HashMap<>();

        campeoes.put("Brasil", 5);
        campeoes.put("Alemanha", 4);
        campeoes.put("Italia", 4);
        campeoes.put("Uruguai", 2);
        campeoes.put("Argentina", 2);
        campeoes.put("Franca", 2);
        campeoes.put("Inglaterra", 1);
        campeoes.put("Espanha", 1);

        System.out.println(campeoes);

        //Atualiza valor
        campeoes.put("Brasil", 6);
        System.out.println(campeoes);

        //Retorna valor
        System.out.println(campeoes.get("Argentina"));

        //Retorna se existe ou não uma chave
        System.out.println(campeoes.containsKey("Franca"));

        //Remove elemento
        System.out.println(campeoes.remove("Franca"));
        System.out.println(campeoes.containsKey("Franca"));

        //Retorna se existe ou não uma chave para o valor
        System.out.println(campeoes.containsValue(6));

        //Tamanho do map
        System.out.println(campeoes.size());

        //Percorrendo elementos
        for (Map.Entry<String, Integer> entry : campeoes.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        for (String key : campeoes.keySet()) {
            System.out.println(key + " = " + campeoes.get(key));
        }

        System.out.println(campeoes);
    }
}
