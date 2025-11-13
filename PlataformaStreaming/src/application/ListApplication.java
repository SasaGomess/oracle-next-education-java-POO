package application;

import entities.Movie;
import entities.Serie;
import entities.Titulo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListApplication {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");


        Serie s1 = new Serie("Dexter", LocalDate.parse("2001-06-01", fmt));
        s1.rating(10);
        var m2 = new Movie("Homem Aranha", "É sobre um homem que foi picado por uma aranha e vira um super heroi", LocalDate.parse("2002-01-01", fmt), false, 126, "Marvel");
        m2.rating(6);
        var s2 = new Serie("Breaking Bad", "Um professor de química que descobriu um câncer em seu pulmão decide se aposentar e ir para o mundo do tráfico", LocalDate.parse("2008-01-01", fmt), true, 3000, 5, true, 16, 45);
        s2.rating(8);

        Movie m1 = new Movie("O poderoso chefão", LocalDate.parse("1970-01-01", fmt));
        m1.rating(9);

        Movie m3 = m1;

        if (m3 == m1) {
            System.out.println("Iguais");
        }

        m1.setName("Harry Potter - Pedra Filosofal");
        System.out.println(m3.getName());

        var titulosAssistidos = new ArrayList<Titulo>(List.of(m1, m2, s2, s1));


        for (Titulo titulo : titulosAssistidos) {
            System.out.println(titulo.getName());

            if (titulo instanceof Movie movie && movie.getClassification() > 2) {
                System.out.println("Classificacao do filme é: " + movie.getClassification());
            }
        }
        System.out.println();
        //Utilizando o sort do Collections que recebe uma interface Compare/implementações para ordenar;
        // Falamos que o compare é um comparável e suas implementações tambem são:
        Collections.sort(titulosAssistidos);

        titulosAssistidos.forEach(System.out::println);

        System.out.println();
//        ArrayList<String> buscaArtista = new ArrayList<>(List.of("Addan Sandler", "Paulo", "Jaqueline"));
//        Collections.sort(buscaArtista);

        // Quando utilizamos a interface funcional Comparetor estamos falando que ela é um Comparador
        titulosAssistidos.sort(Comparator.comparing(Titulo::getYearOfRelease));
        System.out.println(titulosAssistidos);


    }
}
