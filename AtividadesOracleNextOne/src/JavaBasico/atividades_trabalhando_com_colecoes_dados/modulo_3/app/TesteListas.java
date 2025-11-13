package JavaBasico.atividades_trabalhando_com_colecoes_dados.modulo_3.app;

import JavaBasico.atividades_trabalhando_com_colecoes_dados.modulo_3.entities.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteListas {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        integers.addAll(List.of(2,3,4,6,3,2,2));

        Collections.sort(integers);

        integers.forEach(System.out::println);

        System.out.println();

        List<Titulo> titulos = new ArrayList<>(List.of(new Titulo("Homem Aranha"),new Titulo("Dexter"), new Titulo("Solo Leaving")));

        Collections.sort(titulos);

        titulos.forEach(System.out::println);

        System.out.println();
    }
}
