package ua.hillel.rudenko.homeworks.hw16.smartphones;

public abstract class Smartphone {
    private final String model;

    public Smartphone(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
