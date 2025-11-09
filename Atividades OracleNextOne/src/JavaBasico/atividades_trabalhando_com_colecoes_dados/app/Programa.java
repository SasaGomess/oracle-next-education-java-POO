package JavaBasico.atividades_trabalhando_com_colecoes_dados.app;

import JavaBasico.atividades_trabalhando_com_colecoes_dados.entities.Pessoa;

import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static JavaBasico.atividades_trabalhando_com_colecoes_dados.entities.Pessoa.PessoaBuilder.aPessoa;

public class Programa {
    public static void main(String[] args) {
        Pessoa p1 = aPessoa()
                .withNome("Sabrina Gomes")
                .withCpf("843.543.654.54")
                .withIdade(20)
                .build();

        Pessoa p2 = aPessoa()
                .withNome("Maria de Queiroz")
                .withCpf("843.543.654.54")
                .withIdade(15)
                .build();

        Pessoa p3 = aPessoa()
                .withNome("Julia Gomes")
                .withCpf("854.654.684.14")
                .withIdade(19)
                .build();

        Pessoa p4 = aPessoa()
                .withNome("Fernando Vasconcelos")
                .withCpf("563.763.542.65")
                .withIdade(23)
                .build();

        var listaPessoas = new ArrayList<Pessoa>(Arrays.asList(p1, p2, p3, p4));


        System.out.println("O tamanho da lista é: " + listaPessoas.size());
        System.out.println("Primeira pessoa da lista é " + listaPessoas.getFirst().getNome() + "\n");

        for (Pessoa pessoa : listaPessoas) {
            System.out.println( pessoa);
        }


    }
}
