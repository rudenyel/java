package ua.hillel.rudenko.homeworks.hw17;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DrinksMachine[] drinks = DrinksMachine.values();

        System.out.println("Choose a drink (or press 0 for pay and exit):");
        int i = 1;
        for (DrinksMachine drink: drinks) {
            System.out.println(i + ") " + drink);
            i++;
        }

        int drinkChoice;
        while (true) {
            while (true) {
                if (scanner.hasNextInt()) {
                    drinkChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (drinkChoice >= 0 && drinkChoice <= drinks.length) {
                        break;
                    } else {
                        System.out.println("Please enter number from 0 to " + drinks.length);
                    }
                } else {
                    System.out.println("Please enter correct value!");
                    scanner.nextLine();
                }
            }

            if (drinkChoice != 0) {
                Order.addItem(drinks[drinkChoice - 1]);
                System.out.println("Total cost " + Order.getTotalCost()
                        + " (" + Order.getTotalItems() + " items)");
                System.out.println("Choose another drink (or press 0 for pay and exit):");
            }
            else {
                break;
            }
        }
        System.out.println("Pay processing... Exit");
    }
}

