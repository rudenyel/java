package ua.hillel.rudenko.homeworks.hw14;

import java.time.LocalDate;
import java.time.Period;

public class FitnessTracker {
    private final String firstName;
    private final String lastName;
    private final LocalDate birthday;
    private final String mail;
    private final String phone;
    private int weight;
    private int pressure;
    private int steps;
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public LocalDate getBirthday() { return birthday; }
    public String getMail() { return mail; }
    public String getPhone() { return phone; }
    public int getWeight() { return weight; }
    public int getPressure() { return pressure; }
    public int getSteps() { return steps; }
    public int getAge() { return Period.between(birthday, LocalDate.now()).getYears(); }
    public void setWeight(int weight) {this.weight = weight; }
    public void setPressure(int pressure) { this.pressure = pressure; }
    public void setSteps(int steps) { this.steps = steps; }
    protected FitnessTracker(
            String firstName,
            String lastName,
            int year,
            int month,
            int day,
            String mail,
            String phone,
            int weight,
            int pressure,
            int steps)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = LocalDate.of(year, month, day);
        this.mail = mail;
        this.phone = phone;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
    }

    @Override
    public String toString() {
        return
                firstName + " " + lastName + ", " +
                birthday + ", " + mail + ", " + phone +
                " (age: " + getAge() +
                ", weight: " + weight +
                ", pressure: " + pressure +
                ", steps: " + steps + ")";
    }
}
