package phobosxd.optional;

import java.util.Optional;

public class ExampleOptional {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Presente");

        System.out.println("Valor:");
        optional.ifPresentOrElse(System.out::println, () -> System.out.println("Vazio"));

        optional = Optional.ofNullable(null);
        optional.ifPresentOrElse(System.out::println, () -> System.out.println("Vazio"));
    }
}
