package application;

import calculo.TimeCalculator;
import entities.Movie;
import entities.Serie;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Application {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Movie m1 = new Movie();
        m1.setName("O poderoso chefão");
        m1.setDescription("O poderoso chefão é um filme sobre uma família que participa da máfia italiana em 1901");
        m1.setDurationInMinutes(150);
        m1.setYearOfRelease(LocalDate.parse("1970-01-01", fmt));
        System.out.println("A duração do filme é " + m1.getDurationInMinutes());

        m1.showTechnicalInformation();

        m1.rating(5);
        m1.rating(8);
        m1.rating(10);

        System.out.println(m1.getTotalRate());
        System.out.println(m1.getSumOfRates());


        System.out.printf("\nMedia das avaliações é: %.2f %n", m1.rateAverage());


        Serie serie = new Serie();
        serie.setName("Dexter");
        serie.setYearOfRelease(LocalDate.parse("2001-06-01"));

        serie.setActive(false);
        serie.setDescription("Uma serie sobre um serial killer que trabalha pra a polícia militar");
        serie.showTechnicalInformation();

        serie.setMinutesForEpisodes(20);
        serie.setSeasons(7);
        serie.setEpisodesOfSeasons(12);
        System.out.println("A duração para maratonar a serie " + serie.getDurationInMinutes());
        serie.setSeasons(7);

        TimeCalculator timeCalculator1 = new TimeCalculator();
        timeCalculator1.includes(m1);
        timeCalculator1.includes(serie);

        System.out.println(timeCalculator1.getTempototal());

    }
}
