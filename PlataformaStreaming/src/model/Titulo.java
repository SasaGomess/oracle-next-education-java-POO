package model;

import client.dto.TituloOmdbDto;
import exception.ConversaoDeAnoInvalidoException;

import java.util.Objects;

public class Titulo implements Comparable<Titulo> {
    private String name;
    private int yearOfRelease;
    private String description;
    private boolean includedInThePlan;
    private double sumOfRates;
    private int totalRate;
    private int durationInMinutes;

    public Titulo(String name, String description, int yearOfRelease, boolean includedInThePlan, int durationInMinutes) {
        this.name = name;
        this.description = description;
        this.yearOfRelease = yearOfRelease;
        this.includedInThePlan = includedInThePlan;
        this.durationInMinutes = durationInMinutes;
    }

    public Titulo(){

    }

    public Titulo(String name, int yearOfRelease) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
    }

    public Titulo(TituloOmdbDto tituloOmdbDto) {
        this.name = tituloOmdbDto.title();
        if (tituloOmdbDto.year().length() > 4){
            throw new ConversaoDeAnoInvalidoException("Não foi possível converter o ano pois tem mais de 4 caracteres");
        }
        this.yearOfRelease = Integer.parseInt(tituloOmdbDto.year());

        if (!tituloOmdbDto.runtime().equalsIgnoreCase("N/A")){
            this.durationInMinutes = Integer.parseInt(tituloOmdbDto.runtime().substring(0, 2));
        }
    }

    public Titulo(TituloOmdbDto tituloOmdbDto, Integer qtdDeAnosLancamento) {
        this.name = tituloOmdbDto.title();
        this.yearOfRelease = qtdDeAnosLancamento;

        if (!tituloOmdbDto.runtime().equalsIgnoreCase("N/A")){
            this.durationInMinutes = Integer.parseInt(tituloOmdbDto.runtime().substring(0, 2));
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public boolean isIncludedInThePlan() {
        return includedInThePlan;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public double getSumOfRates() {
        return sumOfRates;
    }

    public int getTotalRate() {
        return totalRate;
    }


    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }
    public void showTechnicalInformation(){
        System.out.println("Nome do titulo: " + name);
        System.out.println("Descrição do titulo: " + description);
        System.out.println("Ano de lançamento: " + yearOfRelease);
        System.out.println("Duração em horas do titulo: " + durationInMinutes);
    }
    public void rating(double rate){
        sumOfRates += rate;
        totalRate++;
    }
    public double rateAverage(){
        return  sumOfRates / totalRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Titulo movie = (Titulo) o;
        return durationInMinutes == movie.durationInMinutes && Objects.equals(name, movie.name) && Objects.equals(yearOfRelease, movie.yearOfRelease);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfRelease, durationInMinutes);
    }

    @Override
    public String toString() {
        return "Nome: " + name + ", ano lançamento ou quatidade de anos : " + yearOfRelease + ", duração em minutos: " + durationInMinutes + "min";
    }

    @Override
    public int compareTo(Titulo o) {
        return this.getTotalRate();
    }
}
