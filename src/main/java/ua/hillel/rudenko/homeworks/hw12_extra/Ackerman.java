package ua.hillel.rudenko.homeworks.hw12_extra;

public class Ackerman {

    public static void main(String[] args) {

        System.out.print(ack2(3,12));
    }

    static int ack1 (int n, int m) {
        if (n == 0) {
            return m + 1;
        }
        if (m == 0) {
            return ack1 (n  - 1, 1);
        }
        return ack1 (n  - 1,  ack1(n, m - 1));
    }

    static int ack2 (int n, int m) {
        while (n > 0) {
            if (m == 0) {
                m = 1;
            } else {
                m = ack2 (n, m - 1);
            }
            n--;
        }
        return m + 1;
    }
}
