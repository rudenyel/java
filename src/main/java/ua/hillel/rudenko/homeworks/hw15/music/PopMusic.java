package ua.hillel.rudenko.homeworks.hw15.music;

public class PopMusic extends Music {
    public PopMusic(String composition, int duration) {
        super(composition, "pop", duration);
    }

    @Override
    public void playMusic() {
        System.out.println("Playing " + getComposition() + " in genre pop");
    }
}
