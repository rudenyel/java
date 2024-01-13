package ua.hillel.rudenko.homeworks.hw9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int playersAmount = 25;
        int minAge = 18;
        int maxAge = 40;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Total amount of players = ");
        if (scanner.hasNextInt()) {
            playersAmount = scanner.nextInt();
        } else {
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        System.out.print("Minimal age of players = ");
        if (scanner.hasNextInt()) {
            minAge = scanner.nextInt();
        } else {
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        System.out.print("Maximum age of players = ");
        if (scanner.hasNextInt()) {
            maxAge = scanner.nextInt();
        } else {
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        if ((minAge < 0) || (maxAge < 0) || (playersAmount < 0) || (maxAge < minAge)) {
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        int sumAgesHosts = 0;
        int sumAgesGuests = 0;
        int [] hostsAges = new int[playersAmount];
        int [] guestsAges = new int[playersAmount];

        for (int i = 0; i < playersAmount; i++) {
            hostsAges[i] = (int) (Math.random() * (maxAge - minAge + 1) + minAge);
            guestsAges[i] = (int) (Math.random() * (maxAge - minAge + 1) + minAge);
            sumAgesHosts += hostsAges[i];
            sumAgesGuests += guestsAges[i];
        }

        System.out.println("Age of the home team players:");
        System.out.println(Arrays.toString(hostsAges));
        System.out.println("Average age: " + sumAgesHosts / playersAmount);
        System.out.println("Age of players of the guest's team :");
        System.out.println(Arrays.toString(guestsAges));
        System.out.println("Average age: " + sumAgesGuests / playersAmount);

    }
}

