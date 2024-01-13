package ua.hillel.rudenko.homeworks.hw8;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int amountShuttles = 100;
        int currentID = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Total amount of shuttles = ");
        if (scanner.hasNextInt()) {
            amountShuttles = scanner.nextInt();
        } else {
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        System.out.print("Start ID number = ");
        if (scanner.hasNextInt()) {
            currentID = scanner.nextInt();
        } else {
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        if ((amountShuttles < 0) || (currentID < 0)) {
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        int countApprovedID = 0;
        while (countApprovedID <= amountShuttles) {
            int number = currentID;
            boolean isMisticDigit = false;
            do {
                int digit = number % 10;
                if ((digit == 4) || (digit == 9)) {
                    isMisticDigit = true;
                    break;
                }
                number = number / 10;
            } while (number != 0);

            if (!isMisticDigit) {
                System.out.println(currentID);
                countApprovedID++;
            }

            currentID++;
        }
    }
}
