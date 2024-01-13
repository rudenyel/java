package ua.hillel.rudenko.homeworks.hw13_extra;

public class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }
    public void changeJob (String newJob) {
        this.job = newJob;
    }

    @Override
    public String toString() {
        return "Name: " + name + "; age: " + age + "; job: " + job;
    }
}