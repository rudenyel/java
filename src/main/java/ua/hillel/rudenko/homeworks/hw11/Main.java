package ua.hillel.rudenko.homeworks.hw11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int m = 0;

        System.out.print("Set the matrix size: ");
        if (scanner.hasNextInt() ) {
            n = scanner.nextInt();
        } else {
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        if (scanner.hasNextInt()) {
            m = scanner.nextInt();
        } else {
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        if ((n <= 0) || (m <= 0)) {
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        int [][] firstArray = new int [n][m];
        int [][] secondArray = new int [m][n];

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray[i].length; j++) {
                firstArray[i][j] = (int)(Math.random() * 101);
            }
        }

        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < secondArray[i].length; j++) {
                secondArray[i][j] = firstArray[j][i];
            }
        }

        System.out.println("First array");
        for (int[] row : firstArray) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Second array");
        for (int[] row : secondArray) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}