package phobosxd.comparator;

public class EstudanteComparable implements Comparable<EstudanteComparable> {
    private final String nome;
    private final Integer idade;

    public EstudanteComparable(final String nome, final Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return nome + " - " + idade;
    }

    @Override
    public int compareTo(EstudanteComparable estudante) {
        return this.getIdade() - estudante.getIdade();
    }
}
