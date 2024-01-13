package ua.hillel.rudenko.homeworks.hw17;

public class Order {

    private static int TOTAL_ITEMS = 0;

    private static int TOTAL_COST = 0;

    public static void addItem(DrinksMachine drink) {
        drink.prepare();
        TOTAL_ITEMS++;
        TOTAL_COST += drink.getCost();
    }

    public static int getTotalCost() {
        return TOTAL_COST;
    }

    public static int getTotalItems() {
        return TOTAL_ITEMS;
    }
}