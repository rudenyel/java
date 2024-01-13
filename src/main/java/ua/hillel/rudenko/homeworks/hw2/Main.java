package ua.hillel.rudenko.homeworks.hw2;

public class Main {
    public static void main(String[] args){
        String location = "Statue of Liberty";
        double latitude = 40.689167;
        double longitude = -74.044444;
        char degrees = '\u00B0';

        System.out.println(location + ":");
        System.out.println("latitude " + latitude + ", longitude " + longitude);
        System.out.println("DMS: "
                + "40" + degrees + " 41' 21.0012\" N" + ", "
                + "74" + degrees + " 2' 39.9984\" W");
    }
}