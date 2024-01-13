package ua.hillel.rudenko.homeworks.hw16.smartphones;

public interface Smartphones {
    default void call() {
        System.out.println("Calling...");
    }
    
    default void sms() {
        System.out.println("Sending sms...");
    }

    default void internet() {
        System.out.println("Surfing the Internet...");
    }
}
