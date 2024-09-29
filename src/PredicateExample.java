import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> par = n -> n % 2 == 0;

        List<Integer> numerosPar = numeros.stream().filter(par).toList();
        System.out.println(numerosPar);


        // Palavras com mais de 5 caracteres
        List<String> palavras = Arrays.asList("java", "javascript", "python", "kotlin", "csharp", "c", "c++");

        Predicate<String> maisDeCincoLetras = palavra -> palavra.length() > 5;

        palavras.stream().filter(maisDeCincoLetras).forEach(System.out::println);
    }
}
