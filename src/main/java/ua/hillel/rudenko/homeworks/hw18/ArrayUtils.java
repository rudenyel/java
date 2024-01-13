package ua.hillel.rudenko.homeworks.hw18;

public class ArrayUtils {
    public static double getAverage(int[] array) {
        if (array == null) {
            return 0;
        }

        if (array.length == 0) {
            return 0;
        }

        double sum = 0;
        for (int element : array) {
            sum += element;
        }

        return sum / array.length;
    }

    public static boolean isSquare(int[][] matrix) {
        if (matrix == null) {
            return false;
        }

        if (matrix.length == 0) {
            return false;
        }

        for (int[] line : matrix) {
            if (line.length != matrix.length) {
                return false;
            }
        }

        return true;
    }
}
