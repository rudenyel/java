package ua.hillel.rudenko.homeworks.hw15.music;

public abstract class Music {
    private final String composition;
    private final String genre;
    private final int duration;

    protected Music(String composition, String genre, int duration) {
        this.composition = composition;
        this.genre = genre;
        this.duration = duration;
    }
    public abstract void playMusic();

    public String getComposition() {
        return composition;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }
}
