package ua.hillel.rudenko.homeworks.hw14;

public class FitnessTrackerMain {
    public static void main(String[] args) {
        FitnessTracker liza = new FitnessTracker("Liza","Rudenko",2005,2,
                8,"murkaliza@gmail.com","+380996696784",64,120,0);
        FitnessTracker john = new FitnessTracker("John","Doe",1977,5,
                21,"nomail@gmail.com","+380507777777",90,120,0);
        System.out.println(liza);
        System.out.println(john);
        liza.setSteps(10000);
        liza.setPressure(125);
        liza.setWeight(54);
        System.out.println(liza);
    }
}
