package model;

import calculo.Classifiable;

public class Episode implements Classifiable {
    private int number;
    private String name;
    private Serie serie;
    private int totalViews;

    public Episode(int number, String name, Serie serie, int totalViews) {
        this.number = number;
        this.name = name;
        this.serie = serie;
        this.totalViews = totalViews;
    }
    public Episode(){

    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassification() {
        if (totalViews > 100){
            return 4;
        }else {
            return 2;
        }

    }
}
