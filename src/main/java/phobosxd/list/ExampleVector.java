package phobosxd.list;

import java.util.List;
import java.util.Vector;

/**
 * @author PhobosXD
 * @since 2021-02-26
 * @version 1.0
 */
public class ExampleVector {
    /**
     * @author PhobosXD
     * @since 2021-02-26
     * @param args Argumentos da main.
     */
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

        for (String esporte : esportes) {
            System.out.println("-> " + esporte);
        }
    }
}
