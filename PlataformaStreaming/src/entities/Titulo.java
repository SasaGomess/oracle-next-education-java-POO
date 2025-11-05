package entities;

import java.time.LocalDate;
import java.util.Objects;

public class Titulo {
    private String name;
    private String description;
    private LocalDate yearOfRelease;
    private boolean includedInThePlan;
    private double sumOfRates;
    private int totalRate;
    private int duration;

    public Titulo(String name, String description, LocalDate yearOfRelease, boolean includedInThePlan, int duration) {
        this.name = name;
        this.description = description;
        this.yearOfRelease = yearOfRelease;
        this.includedInThePlan = includedInThePlan;
        this.duration = duration;
    }

    public Titulo(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(LocalDate yearOfRelease) {
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


    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void showTechnicalInformation(){
        System.out.println("Nome do titulo: " + name);
        System.out.println("Descrição do titulo: " + description);
        System.out.println("Ano de lançamento: " + yearOfRelease);
        System.out.println("Duração em horas do titulo: " + duration);
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
        return duration == movie.duration && Objects.equals(name, movie.name) && Objects.equals(yearOfRelease, movie.yearOfRelease);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfRelease, duration);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", includedInThePlan=" + includedInThePlan +
                ", rate=" + sumOfRates +
                ", totalRate=" + totalRate +
                ", duration=" + duration +
                '}';
    }
}
