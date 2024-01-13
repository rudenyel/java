package ua.hillel.rudenko.homeworks.hw4;

public class Main {
    public static void main(String[] args){
        double a = 7;
        double b = 5;
        double height = 8;

        double baseArea = a * b;
        double baseLength = 2 * (a + b);
        double volume = baseArea * height;
        double totalLength = 2 * baseLength + 4 * height ;

        System.out.println("Cuboid volume = " + volume);
        System.out.println("Total length = " + totalLength);
    }
}
