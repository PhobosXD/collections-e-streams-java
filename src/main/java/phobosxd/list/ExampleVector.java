package phobosxd.list;

import java.util.List;
import java.util.Vector;

public class ExampleVector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tenis de mesa");
        esportes.add("Handbol");

        esportes.set(2, "Ping Pong");
        esportes.remove(2);
        esportes.remove("Handbol");

        System.out.println(esportes.get(0));

        for (String esporte: esportes) {
            System.out.println("-> " + esporte);
        }
    }
}
