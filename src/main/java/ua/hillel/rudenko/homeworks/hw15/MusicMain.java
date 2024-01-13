package ua.hillel.rudenko.homeworks.hw15;

import ua.hillel.rudenko.homeworks.hw15.music.Music;
import ua.hillel.rudenko.homeworks.hw15.music.ClassicMusic;
import ua.hillel.rudenko.homeworks.hw15.music.PopMusic;
import ua.hillel.rudenko.homeworks.hw15.music.RockMusic;
public class MusicMain {
    public static void main(String[] args)  {
        Music[] playlist = {
                new PopMusic("Hits Different", 10),
                new RockMusic("Bohemian Rhapsody", 10),
                new ClassicMusic("Ride of the Valkyries", 10),
        };
        for (Music composition: playlist) {
            composition.playMusic();
        }
    }
}