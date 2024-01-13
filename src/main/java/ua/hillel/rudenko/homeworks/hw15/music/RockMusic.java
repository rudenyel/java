package ua.hillel.rudenko.homeworks.hw15.music;

public class RockMusic extends Music {
    public RockMusic(String composition, int duration) {
        super(composition, "rock", duration);
    }

    @Override
    public void playMusic() {
        System.out.println("Playing " + getComposition() + " in genre rock");
    }
}
