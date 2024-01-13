package ua.hillel.rudenko.homeworks.hw13_extra;

public class PersonMain {
    public static void main(String[] args) {
        Person john = new Person("John", 30, "engineer");
        Person mary = new Person("Mary", 25, "teacher");
        Person bob = new Person("Bob", 35, "doctor");
        Person alice = new Person("Alice", 28, "architect");

        System.out.println(john);
        System.out.println(mary);
        System.out.println(bob);
        System.out.println(alice);
        alice.changeJob("designer");
        System.out.println(alice);
    }
}