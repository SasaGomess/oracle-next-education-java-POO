package application;

import calculo.RecomendationFilter;
import calculo.TimeCalculator;
import entities.Episode;
import entities.Movie;
import entities.Serie;
import entities.Titulo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        Movie m1 = new Movie("O poderoso chefão", LocalDate.parse("1970-01-01", fmt));
        m1.setDescription("O poderoso chefão é um filme sobre uma família que participa da máfia italiana em 1901");
        m1.setDurationInMinutes(150);
        m1.setYearOfRelease(LocalDate.parse("1970-01-01", fmt));
        System.out.println("A duração do filme é " + m1.getDurationInMinutes());

        RecomendationFilter.filter(m1);

        m1.showTechnicalInformation();

        m1.rating(5);
        m1.rating(8);
        m1.rating(10);

        System.out.println(m1.getTotalRate());
        System.out.println(m1.getSumOfRates());


        System.out.printf("\nMedia das avaliações é: %.2f %n", m1.rateAverage());


        Serie s1 = new Serie("Dexter", LocalDate.parse("2001-06-01", fmt));
        s1.setYearOfRelease(LocalDate.parse("2001-06-01", fmt));

        s1.setActive(false);
        s1.setDescription("Uma s1 sobre um serial killer que trabalha pra a polícia militar");
        s1.showTechnicalInformation();

        s1.setMinutesForEpisodes(20);
        s1.setSeasons(7);
        s1.setEpisodesOfSeasons(12);
        System.out.println("A duração para maratonar a s1 " + s1.getDurationInMinutes());
        s1.setSeasons(7);

        TimeCalculator timeCalculator1 = new TimeCalculator();
        timeCalculator1.includes(m1);
        timeCalculator1.includes(s1);

        System.out.println(timeCalculator1.getTempototal());
        Episode ep1 = new Episode();
        ep1.setNumber(2);
        ep1.setSerie(s1);
        ep1.setTotalViews(3000);
        
        RecomendationFilter.filter(ep1);

        var m2 = new Movie("Homem Aranha", "É sobre um homem que foi picado por uma aranha e vira um super heroi", LocalDate.parse("2002-01-01", fmt), false, 126,"Marvel");
        m2.rating(8.5);
        m2.showTechnicalInformation();

        var s2 = new Serie("Breaking Bad", "Um professor de química que descobriu um câncer em seu pulmão decide se aposentar e ir para o mundo do tráfico", LocalDate.parse("2008-01-01", fmt), true, 3000, 5, true, 16, 45);
        System.out.println();
        s2.rating(6.7);
        s2.showTechnicalInformation();

        var titulos = new ArrayList<Titulo>(List.of(m1, m2, s2, s1));

        System.out.println("\nTamanho da lista " + titulos.size());
        System.out.println("O primeiro titulo é: " + titulos.get(0).getName() + "\n");

        for (Titulo titulo : titulos){
            System.out.println(titulo);
        }
    }
}
