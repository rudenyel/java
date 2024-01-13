package ua.hillel.rudenko.homeworks.hw12;

public class Person {
        public static void main(String[] args) {
            System.out.println(personInfo("Will", "Smith", "New York", "2936729462846"));
            System.out.println(personInfo("Jackie", "Chan", "Shanghai", "12312412412"));
            System.out.println(personInfo("Sherlock", "Holmes", "London", "37742123513"));
        }
        static String personInfo(
                String firstName,
                String lastName,
                String location,
                String phone) {
            return firstName + " " + lastName + " from " + location + " can be reached at " + phone;
        }

    @Override
    public String toString() {
        return super.toString();
    }
}
