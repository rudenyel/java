package ua.hillel.rudenko.homeworks.hw7;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int min = 0;
        int max = 10;
        int attempts = 3;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Min number = ");
        if (scanner.hasNextInt()) {
            min = scanner.nextInt();
        } else {
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        System.out.print("Max number = ");
        if (scanner.hasNextInt()) {
            max = scanner.nextInt();
        } else {
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        System.out.print("Attempts = ");
        if (scanner.hasNextInt()) {
            attempts = scanner.nextInt();
        } else {
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        if ((min < 0) || (max < 0) || (attempts < 3) || (max < min)) {
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        int count = 1;
        int random = (int) (Math.random() * (max - min + 1) + min);
        while (count <= attempts) {

            int number = 0;
            System.out.print("Your number = ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
            } else {
                System.out.println("Incorrect input!");
                System.exit(0);
            }

            if (number == random) {
                System.out.println("Your win!");
                System.exit(0);
            }

            System.out.print("Try again! ");
            count++;
        }

        System.out.println("Joke's on you, loser)");
    }
}
