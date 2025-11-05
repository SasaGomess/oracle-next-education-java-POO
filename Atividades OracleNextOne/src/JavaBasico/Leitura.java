package JavaBasico;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Leitura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu filme favorito");

        String filme = sc.nextLine();
        System.out.println(filme);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String dataLancamento = sc.nextLine();
        LocalDate dataLancamentoDate = LocalDate.parse(dataLancamento, formatter);

        double avaliacao = sc.nextDouble();

        System.out.println(filme);
        System.out.println(dataLancamentoDate);
        System.out.println(avaliacao);

        List<String> filmes = new ArrayList<>(Arrays.asList(filme, "Sonic", "Matrix"));

    }
}
