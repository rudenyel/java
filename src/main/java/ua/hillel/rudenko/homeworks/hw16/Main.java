package ua.hillel.rudenko.homeworks.hw16;

import ua.hillel.rudenko.homeworks.hw16.os.Android;
import ua.hillel.rudenko.homeworks.hw16.os.IOS;
import ua.hillel.rudenko.homeworks.hw16.smartphones.Smartphones;
import ua.hillel.rudenko.homeworks.hw16.smartphones.Xiaomi;
import ua.hillel.rudenko.homeworks.hw16.smartphones.IPhone;

public class Main {
    public static void main(String[] args) {
        Smartphones[] smartphones = {
            new Xiaomi("Readme 12"),
            new Xiaomi("Readme Note 12"),
            new IPhone("iPhone 14"),
            new IPhone("iPhone 14 Pro")
        };
        
        for (Smartphones smartphone:  smartphones) {
            smartphone.call();
            smartphone.sms();
            smartphone.internet();
            if (smartphone instanceof IOS) {
                System.out.println(((IOS) smartphone).getSourceCode());
            }
            if (smartphone instanceof Android) {
                System.out.println(((Android) smartphone).getSourceCode());
            }
        }
    }
}
