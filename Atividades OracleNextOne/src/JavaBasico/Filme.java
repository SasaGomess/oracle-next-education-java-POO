package JavaBasico;

import java.time.LocalDate;
import java.util.Locale;

public class Filme {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String filme = "InterStelar";
        LocalDate dataLancamento = LocalDate.parse("2011-06-07");
        boolean incluidoOuNao = true;
        double nota = 8.3;

        String filme2 = "Top Gun";
        LocalDate dataLancamento2 = LocalDate.parse("1989-07-10");
        boolean incluidoOuNao2 = false;
        double nota2 = 10.5;

        String sinopse1 = """
                Nome e lançamento do filme %s - %s.
                Está incluido no plano? R: %s.
                A nota do filme é: %.2f %n""".formatted(filme, dataLancamento, incluidoOuNao ? "sim" : "não", nota);

        String sinopse2 = """
                Nome e lançamento do filme %s - %s.
                Está incluido no plano? R: %s.
                A nota do filme é: %.2f %n
                """.formatted(filme2, dataLancamento2, incluidoOuNao2 ? "sim" : "não", nota2);

        System.out.println(sinopse1);
        System.out.println(sinopse2);

        double mediaNotas = (nota + nota2) / 2;

        System.out.printf("A média das avaliações é: %.1f %n", mediaNotas);

        int classificacao = (int) mediaNotas / 2;

        mediaNotas = 4;

        System.out.println(classificacao);
        // Equals e == em strings
        String filmeReplica = new String("InterStelar");

       if (filmeReplica == filme){
           System.out.println("Mesmo local no pool de Strings");
       }
       if(filmeReplica.equals(filme)){
           System.out.println("O valor das Strings é igual");
       }
    }
}
