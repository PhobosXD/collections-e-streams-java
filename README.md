# Collections e Streams em Java

## List

Podem ser envontrados exemplos de List utilizando ArrayList e Vector no package phobosxd.list.

## Queue

1. Garante a ordem de inserção (primeiro elemento que entra é o primeiro elemento que sai).
2. Não permite a alteração de elementos.
3. Não permite a reordenação de elementos.

Podem ser encontrados exemplos de queue utiliznado LinkedList no package phobosxd.queue.

## Set

1. Não garante a ordem de inserção.
2. Não permite itens repetidos.
3. Criada pensando na melhoria da performace.
4. Não permite a busca por um elemento específico, apenas percorrer a estrutura.
5. Não permite a reordenação dos elementos no momento em que ele é criado.

## Map

1. Guarda um valor e uma chava associada a esse valor.
2. Permite valores repetidos mas não chaves repetidas.
3. Permite adição, busca por chave ou valor, atualização, remoção e navegação.
4. Pode ser ordenado.

## Comparator

Interfaces usadas para criar regras de ordenação de objetos.

1. Comparable: Utilizado dentro do próprio domínio para comparar o objeto atual com um outro objeto recebido como parâmetro.
2. Comparator: Classe externa que é usada para comparar dois objetos recebidos como parâmetros.

## Optional

1. Tratamento de objetos que podem ser nulos.
2. Possui dois estados:
 - Presente.
 - Vazio.
3. Permite execução de operações em valores que podem ser nulos sem preocupação com NullPointerExceptions.

## Stream

1. Manipulação de coleções de dados de forma paralela.
2. Imutável: sempre cria uma nova coleção, de forma a não alterar os dados originais.
3. Diversas funcionalidades:
 - Mapping: coleção de mesmo tamanho da origem com os dados alterados.
 - Filtering: coleção igual ou menor que a origem com os dados intactos.
 - ForEach: executa uma determinada lógica para cada elemento e não retorna nada.
 - Peek: semelhante ao ForEach mas retorna a própria coleção.
 - Couting: retorna um int com o número de elementos da lista.
 - Grouping: retorna uma coleção agrupada de acordo com uma determinada regra.
