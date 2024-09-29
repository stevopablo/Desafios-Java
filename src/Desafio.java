import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Comparator;

public class Desafio {
    List<Integer> numeros = Arrays.asList(1, 2, 2, 3, 4, 5, 6, 7, 7, 9, 8, 9, 10, 11, -1, -2);

    // Desafio 1: Somar números pares
    public void somarPares() {
        int somarPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);
        System.out.println("Soma dos pares: " + somarPares);
    }

    // Desafio 2: Imprimir números ímpares
    public void imprimirImpares() {
        numeros.stream()
                .filter(i -> i % 2 != 0)
                .forEach(i -> System.out.println(i + " é ímpar"));
    }

    // Desafio 3: Verificar se os números são positivos
    public void numerosPositivos() {
        numeros.stream()
                .filter(n -> n >= 0)
                .forEach(n -> System.out.println(n + " é positivo"));
    }

    // Desafio 4: Remover números ímpares
    public void removerImpar() {
        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Lista com números pares: " + numerosPares);
    }

    // Desafio 5: Calcular a média dos números maiores ou iguais a 5
    public String calcularMediaMaiorCinco() {
        List<Integer> numerosFiltrados = numeros.stream()
                .filter(n -> n >= 5)
                .collect(Collectors.toList());

        if (numerosFiltrados.isEmpty()) {
            return "Nenhum número maior ou igual a 5 foi encontrado.";
        } else {
            double media = numerosFiltrados.stream()
                    .mapToInt(Integer::intValue)
                    .average()
                    .orElse(0.0);
            return "A média dos números maiores ou iguais a 5 é: " + media;
        }
    }

    // Desafio 6: Retornar números maiores ou iguais a 10
    public List<Integer> maiorQueDez() {
        List<Integer> maioresDez = numeros.stream()
                .filter(n -> n >= 10)
                .collect(Collectors.toList());
        return maioresDez;
    }

    // Desafio 7: Encontrar o segundo maior número
    public Integer segundoMaiorNumero() {
        Optional<Integer> maiorNumero = numeros.stream()
                .max(Comparator.naturalOrder());
        if (maiorNumero.isPresent()) {
            List<Integer> numerosRestantes = numeros.stream()
                    .filter(n -> !n.equals(maiorNumero.get()))
                    .collect(Collectors.toList());
            return numerosRestantes.stream()
                    .max(Comparator.naturalOrder())
                    .orElse(null);
        }
        return null;
    }

    // Desafio 8: Somar itens da lista
    public void somarItems() {
        long total = numeros.stream().count();
        System.out.println("Total da lista somada é igual: " + total);
    }

    // Desafio 9: Identificar números repetidos
    public void itemsRepetidos() {
        List<Integer> numerosUnicos = new ArrayList<>();
        List<Integer> numerosRepetidos = new ArrayList<>();

        for (Integer numero : numeros) {
            if (numerosUnicos.contains(numero) && !numerosRepetidos.contains(numero)) {
                numerosRepetidos.add(numero);
            } else {
                numerosUnicos.add(numero);
            }
        }
        if (!numerosRepetidos.isEmpty()) {
            System.out.println("Números repetidos: " + numerosRepetidos);
        } else {
            System.out.println("Não tem número repetido");
        }
    }

    // Desafio 10: Encontrar múltiplos de 3 e 5
    public List<Integer> multiplosTresECinco() {
        return numeros.stream()
                .filter(n -> n % 2 != 0)
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .collect(Collectors.toList());
    }

    // Desafio 11: Calcular o produto dos números
    public long calcularProduto() {
        return numeros.stream()
                .mapToLong(n -> n)
                .reduce(1, (a, b) -> a * b);
    }

    // Desafio 12: Calcular a soma dos quadrados de todos os números
    public long somaQuadrados() {
        return numeros.stream()
                .mapToLong(n -> n * n) 
                .sum(); 
    }

    // Desafio 13: Filtrar por intervalo
    public List<Integer> filtrarPorIntervalo(int num1, int num2) {
        return numeros.stream()
                .filter(n -> n >= num1 && n <= num2)
                .collect(Collectors.toList());
    }

    // Desafio 14: Encontrar o segundo maior número primo
    public Integer segundoMaiorNumeroPrimo() {
        return numeros.stream()
                .filter(n -> n > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(i -> n % i == 0))
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
    }

    // Desafio 15: Procurar números negativos
    public List<Object> procurarNegativo() {
        List<Integer> negativosLista = numeros.stream()
                .filter(n -> n < 0)
                .collect(Collectors.toList());

        if (negativosLista.isEmpty()) {
            return List.of("Não tem negativo"); 
        } else {
            return new ArrayList<>(negativosLista); 
        }
    }

    // Desafio 16: Agrupar números ímpares e pares
    public void agruparImparEPar() {
        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        List<Integer> impares = numeros.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);
    }

    // Desafio 17: Somar números divisíveis por 3 e 5
    public long divisiveisTresECinco() {
        return numeros.stream()
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .mapToLong(n -> n)
                .sum();
    }

    public static void main(String[] args) {
        Desafio desafio = new Desafio();
        desafio.imprimirImpares();
        desafio.somarPares();
        desafio.numerosPositivos();
        desafio.removerImpar();
        System.out.println(desafio.calcularMediaMaiorCinco());
        System.out.println("Maiores que 10: " + desafio.maiorQueDez());
        System.out.println("Segundo maior: " + desafio.segundoMaiorNumero());
        desafio.itemsRepetidos();
        System.out.println("Múltiplos de 3 e de 5: " + desafio.multiplosTresECinco());
        System.out.println("Soma dos quadrados de todos os números da lista: " + desafio.somaQuadrados());
        System.out.println("Produto de todos os números da lista: " + desafio.calcularProduto());
        System.out.println("Filtrar os números que estão dentro de um intervalo: " + desafio.filtrarPorIntervalo(4, 9));
        System.out.println("Segundo maior número primo: " + desafio.segundoMaiorNumeroPrimo());
        System.out.println(desafio.procurarNegativo());
        desafio.agruparImparEPar();
        System.out.println("Encontre a soma dos números divisíveis por 3 e 5: " + desafio.divisiveisTresECinco());
    }
}
