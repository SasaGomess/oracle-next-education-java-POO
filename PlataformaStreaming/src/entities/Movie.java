package entities;


import java.time.LocalDate;

public class Movie extends Titulo{
   private String director;

    public Movie(String name, String description, LocalDate yearOfRelease, boolean includedInThePlan, int duration, String director) {
        super(name, description, yearOfRelease, includedInThePlan, duration);
        this.director = director;
    }


    public Movie() {

    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
