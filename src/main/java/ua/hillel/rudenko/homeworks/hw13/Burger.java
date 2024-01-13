package ua.hillel.rudenko.homeworks.hw13;

public class Burger {
    private final String name;
    private final int bun;
    private final int meat;
    private final int sauce;
    private final int salad;

    protected Burger(String name, int bun, int meat, int sauce, int salad) {
        this.name = name;
        this.bun = bun;
        this.meat = meat;
        this.sauce = sauce;
        this.salad = salad;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return name + " ingredients: " + bun + " bun, " + meat + " meat, " + sauce + " sauce, "  + salad + " salad";
    }
}

