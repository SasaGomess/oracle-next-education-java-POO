package entities;


public class Serie extends Titulo {
    private int seasons;
    private boolean active;
    private int episodesOfSeasons;
    private int minutesForEpisodes;

    public int getSeasons() {
        return seasons;
    }

    @Override
    public int getDuration() {
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
}
