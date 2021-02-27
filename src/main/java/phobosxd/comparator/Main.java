package phobosxd.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<EstudanteComparable> estudantes = new ArrayList<>();

        estudantes.add(new EstudanteComparable("Pedro", 19));
        estudantes.add(new EstudanteComparable("Carlos", 23));
        estudantes.add(new EstudanteComparable("Mariana", 21));
        estudantes.add(new EstudanteComparable("Joao", 18));
        estudantes.add(new EstudanteComparable("Thiago", 20));
        estudantes.add(new EstudanteComparable("George", 22));
        estudantes.add(new EstudanteComparable("Larissa", 21));

        System.out.println("ORDEM DE INSERCAO");
        System.out.println(estudantes);

        //Ordenando usando função lambda
        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());

        //Ordenando utilizando uma classe extends Comparable
        Collections.sort(estudantes);

        //Ordenando utilizando uma classe extends Comparator
        Collections.sort(estudantes, new EstudanteComparator());
    }
}
