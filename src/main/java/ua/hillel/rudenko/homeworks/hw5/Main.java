package ua.hillel.rudenko.homeworks.hw5;

public class Main {
    public static void main(String[] args){
        int lyWarriors = 860;
        double lySoldierDamage = 13;
        double lyArcherDamage = 24;
        double lyRiderDamage = 46;

        double mingFactor = 1.5;
        int mingWarriors = (int) (mingFactor * lyWarriors);
        double mingSoldierDamage = 9;
        double mingArcherDamage = 35;
        double mingRiderDamage = 12;

        double lyDamage =  lyWarriors * (lySoldierDamage + lyArcherDamage + lyRiderDamage);
        double mingDamage =  mingWarriors * (mingSoldierDamage + mingArcherDamage + mingRiderDamage);

        System.out.println("Ly damage = " + lyDamage);
        System.out.println("Ming damage = " + mingDamage);
    }
}