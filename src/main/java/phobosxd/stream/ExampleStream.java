package phobosxd.stream;

import phobosxd.comparator.EstudanteComparable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleStream {
    public static void main(String[] args) {
        List<EstudanteComparable> estudantes = new ArrayList<>();

        estudantes.add(new EstudanteComparable("Joao", 15));
        estudantes.add(new EstudanteComparable("Maria", 16));
        estudantes.add(new EstudanteComparable("Eduardo", 20));
        estudantes.add(new EstudanteComparable("Joaquina", 40));
        estudantes.add(new EstudanteComparable("Edna", 10));
        estudantes.add(new EstudanteComparable("Cristovao", 18));
        estudantes.add(new EstudanteComparable("Souza", 19));

        System.out.println(estudantes.stream().map(estudante -> estudante.getNome().concat(" - ").concat(String.valueOf(estudante.getIdade()))).collect(Collectors.joining(", ")));

        System.out.println(estudantes.stream().count());

        System.out.println(estudantes.stream().filter(estudante -> estudante.getIdade() >= 18).collect(Collectors.toList()));

        estudantes.stream().forEach(System.out::println);

        System.out.println(estudantes.stream().filter(estudante -> estudante.getNome().contains("B")));

        System.out.println(estudantes.stream().anyMatch(estudante -> estudante.getNome().contains("D")));
    }
}
