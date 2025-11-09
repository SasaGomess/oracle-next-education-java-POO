package entities;


import calculo.Classifiable;

import java.time.LocalDate;

public class Serie extends Titulo implements Classifiable {
    private int seasons;
    private boolean active;
    private int episodesOfSeasons;
    private int minutesForEpisodes;

    public Serie(){

    }

    public Serie(String name){
        super(name);
    }


    public Serie(String name, String description, LocalDate yearOfRelease, boolean includedInThePlan, int durationInMinutes, int seasons, boolean active, int episodesOfSeasons, int minutesForEpisodes) {
        super(name, description, yearOfRelease, includedInThePlan, durationInMinutes);
        this.seasons = seasons;
        this.active = active;
        this.episodesOfSeasons = episodesOfSeasons;
        this.minutesForEpisodes = minutesForEpisodes;
    }

    public int getSeasons() {
        return seasons;
    }

    @Override
    public int getDurationInMinutes() {
        return seasons * minutesForEpisodes * episodesOfSeasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpisodesOfSeasons() {
        return episodesOfSeasons;
    }

    public void setEpisodesOfSeasons(int episodesOfSeasons) {
        this.episodesOfSeasons = episodesOfSeasons;
    }

    public int getMinutesForEpisodes() {
        return minutesForEpisodes;
    }

    public void setMinutesForEpisodes(int minutesForEpisodes) {
        this.minutesForEpisodes = minutesForEpisodes;
    }

    @Override
    public int getClassification() {
        return 0;
    }
}
