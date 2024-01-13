package ua.hillel.rudenko.homeworks.hw6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int teamsPlayers = 5;

        String teamCT;
        int fragsCT = 0;

        String teamT;
        int fragsT = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Name CT-team = ");
        teamCT = scanner.nextLine();

        System.out.print("Team " + teamCT + " player 1 frags = ");
        if (scanner.hasNextInt()) {
            fragsCT += scanner.nextInt();
        } else {
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        System.out.print("Team " + teamCT + " player 2 frags = ");
        if (scanner.hasNextInt()) {
            fragsCT += scanner.nextInt();
        } else {
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        System.out.print("Team " + teamCT + " player 3 frags = ");
        if (scanner.hasNextInt()) {
            fragsCT += scanner.nextInt();
        } else {
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        System.out.print("Team " + teamCT + " player 4 frags = ");
        if (scanner.hasNextInt()) {
            fragsCT += scanner.nextInt();
        } else {
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        System.out.print("Team " + teamCT + " player 5 frags = ");
        if (scanner.hasNextInt()) {
            fragsCT += scanner.nextInt();
        } else {
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        scanner.nextLine();

        System.out.print("Name T-team = ");
        teamT = scanner.nextLine();

        System.out.print("Team " + teamCT + " player 1 frags = ");
        if (scanner.hasNextInt()) {
            fragsT += scanner.nextInt();
        } else {
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        System.out.print("Team " + teamCT + " player 2 frags = ");
        if (scanner.hasNextInt()) {
            fragsT += scanner.nextInt();
        } else {
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        System.out.print("Team " + teamCT + " player 3 frags = ");
        if (scanner.hasNextInt()) {
            fragsT += scanner.nextInt();
        } else {
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        System.out.print("Team " + teamCT + " player 4 frags = ");
        if (scanner.hasNextInt()) {
            fragsT += scanner.nextInt();
        } else {
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        System.out.print("Team " + teamCT + " player 5 frags = ");
        if (scanner.hasNextInt()) {
            fragsT += scanner.nextInt();
        } else {
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        if (fragsCT > fragsT) {
            System.out.println("Team " + teamCT + " wins with average" + (double) fragsCT / teamsPlayers + " points!");
        } else if (fragsCT < fragsT) {
            System.out.println("Team " + teamT + " wins with average" + (double) fragsT / teamsPlayers + " points!");
        } else {
            System.out.println("Fight, there is no draw in this game!");
        }
    }
}
