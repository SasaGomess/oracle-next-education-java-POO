package JavaBasico.atividades_trabalhando_com_colecoes_dados.modulo_2.app;

import JavaBasico.atividades_trabalhando_com_colecoes_dados.modulo_2.entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        var strings = new ArrayList<>();

        strings.addAll(List.of("Sabrina", "Maria", "Julia", "Mayara", "Gabriel", "Maycon"));

        strings.forEach(System.out::println);

//        Cachorro cachorro = new Cachorro();

        Animal animal = new Cachorro();
        System.out.println();
        if (animal instanceof Cachorro cachorro1){
            cachorro1.andar();
            cachorro1.latir();
        }

//        cachorro.latir();

        System.out.println();

        var produtos = new ArrayList<Produto>();

        produtos.addAll(List.of(new Produto("Feijão", 9.80, 1), new Produto("Arroz", 10.80, 2), new Produto("Feijão", 5.80, 1)));

        Double media = produtos.stream().collect(Collectors.averagingDouble(p -> p.getPreco()));

        System.out.println(media);

        System.out.println();

        var formas = new ArrayList<Forma>();

        formas.addAll(List.of(new Quadrado(6), new Circulo(7.9), new Quadrado(4), new Circulo(4.5)));

        for(Forma formaGeometrica : formas){
            System.out.printf("%.2f %n", formaGeometrica.calcularArea());
        }
    }
}
