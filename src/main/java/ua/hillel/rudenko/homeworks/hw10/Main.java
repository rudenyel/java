package ua.hillel.rudenko.homeworks.hw10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int countNumbers = 7;
        int minNumber = 0;
        int maxNumber = 9;

        System.out.println("Enter your lottery numbers: ");

        Scanner scanner = new Scanner(System.in);

        int[] organiserTicket = new int[countNumbers];
        int[] playerTicket = new int[countNumbers];

        for (int i = 0; i < countNumbers; i++) {
            if (scanner.hasNextInt()) {
                playerTicket[i] = scanner.nextInt();
                if  (playerTicket[i] < minNumber || playerTicket[i] > maxNumber)
                {
                    System.out.println("Incorrect input!");
                    System.exit(0);
                }
            } else {
                System.out.println("Incorrect input!");
                System.exit(0);
            }
            organiserTicket[i] = (int) (Math.random() * (maxNumber - minNumber + 1) + minNumber);
        }

        bubbleSort(organiserTicket);
        bubbleSort(playerTicket);

        System.out.println("Organiser's ticket sorted : " + Arrays.toString(organiserTicket));
        System.out.println("Player's ticket sorted: " + Arrays.toString(playerTicket));

        int matches = 0;
        for (int i = 0; i < countNumbers; i++) {
            if (organiserTicket[i] == playerTicket[i]) {
                matches++;
                if ( matches == 1) {
                    System.out.print("Matches: " + organiserTicket[i]);
                }
                else {
                    System.out.print(", " + organiserTicket[i] );
                }
            }
        }
        System.out.println();
        System.out.println("Number of matches: " + matches);
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}