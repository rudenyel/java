package ua.hillel.rudenko.homeworks.hw15.music;

public class ClassicMusic extends Music {
    public ClassicMusic(String composition, int duration) {
        super(composition, "classic", duration);
    }

    @Override
    public void playMusic() {
        System.out.println("Playing " + getComposition() + " in genre classic");
    }
}
