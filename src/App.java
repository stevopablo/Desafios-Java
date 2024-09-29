import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class App {
//   public static void main(String[] args) {
//         List<Integer> numero = Arrays.asList(1, 2, 3, 4, 5);

//         numero.stream().forEach(n -> {
//             if (n % 2 == 0) {
//                 System.out.println(n + " é par");
//             }
//         });
//     }




    // public static void main(String[] args) {
    //     Supplier<String> saudacao = () -> "olá, seja bem-vindo";
        
    //     List<String> listaSaudacao = Stream.generate(saudacao) 
    //             .limit(2)
    //             .toList();

    //     listaSaudacao.forEach(System.out::println);
    // }


    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);


        List<Integer> numerosDobrados = numeros.stream()
        // lambda
        .map(n -> n * 2)
        .toList();

        System.out.println(numerosDobrados);
    }
}
