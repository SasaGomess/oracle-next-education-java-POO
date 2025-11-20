package model;


import calculo.Classifiable;

public class Movie extends Titulo implements Classifiable {
   private String director;

    public Movie(String name, String description, int yearOfRelease, boolean includedInThePlan, int duration, String director) {
        super(name, description, yearOfRelease, includedInThePlan, duration);
        this.director = director;

    }

    public Movie(String name, int yearOfRelease) {
        super(name, yearOfRelease);
    }

    public Movie() {

    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) this.rateAverage() / 2;
    }
}
