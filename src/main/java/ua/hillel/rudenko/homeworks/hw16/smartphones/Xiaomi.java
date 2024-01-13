package ua.hillel.rudenko.homeworks.hw16.smartphones;

import ua.hillel.rudenko.homeworks.hw16.os.Android;

public class Xiaomi extends Smartphone implements Smartphones, Android {
    public Xiaomi(String model) {
        super(model);
    }

    @Override
    public void justWork() {
        System.out.print(getModel() + " working. ");
    }

    @Override
    public void call() {
        justWork();
        Smartphones.super.call();
    }

    @Override
    public void sms() {
        justWork();
        Smartphones.super.sms();
    }

    @Override
    public void internet() {
        justWork();
        Smartphones.super.internet();
    }

    @Override
    public String getSourceCode() {
        return "Source code: https://android.googlesource.com";
    }
}
