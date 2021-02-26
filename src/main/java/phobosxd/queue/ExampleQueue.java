package phobosxd.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExampleQueue {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pamela");
        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String proximoCliente = filaBanco.poll();
        System.out.println(proximoCliente);
        System.out.println(filaBanco);

        proximoCliente = filaBanco.peek();
        System.out.println(proximoCliente);
        System.out.println(filaBanco);

        //filaBanco.clear();

        proximoCliente = filaBanco.element();
        System.out.println(proximoCliente);
        System.out.println(filaBanco);

        for (String client : filaBanco) {
            System.out.println(client);
        }

        Iterator<String> it = filaBanco.iterator();
        while (it.hasNext()) {
            System.out.println("-> " + it.next());
        }

        System.out.println(filaBanco.size());

        System.out.println(filaBanco.isEmpty());
    }
}
