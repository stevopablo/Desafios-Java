import java.util.Arrays;
import java.util.List;

public class Consumer {
  public static void main(String[] args) {
        List<Integer> numero = Arrays.asList(1, 2, 3, 4, 5);

        numero.stream().forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n + " é par");
            }
        });
    }
}

