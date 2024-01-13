package ua.hillel.rudenko.homeworks.hw17;

public enum DrinksMachine {
    COFFEE("Coffee", 25),
    TEA("Tea", 20),
    LEMONADE("Lemonade", 35),
    MOJITOS("Mojitos", 40),
    WATER("Mineral water", 20),
    COLA ("Coca-cola", 25);

    private final String type;

    private int cost;

    DrinksMachine(String type, int cost) {
        this.type = type;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return type;
    }

    public void prepare() {
        System.out.println("Processing... The " + type + " (cost " + cost + ") is prepared");
    }

    public String getType() {
        return type;
    }
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
