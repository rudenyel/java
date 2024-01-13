package ua.hillel.rudenko.homeworks.hw16.smartphones;

import ua.hillel.rudenko.homeworks.hw16.os.IOS;

public class IPhone extends Smartphone implements Smartphones, IOS  {
    public IPhone(String model) {
        super(model);
    }

    @Override
    public void wowEffect() {
        System.out.print("Wow, " + getModel() + "! It's cool! ");
    }

    @Override
    public void call() {
        wowEffect();
        Smartphones.super.call();
    }

    @Override
    public void sms() {
        wowEffect();
        Smartphones.super.sms();
    }

    @Override
    public void internet() {
        wowEffect();
        Smartphones.super.internet();
    }

    @Override
    public String getSourceCode() {
        return "Source code: The page you’re looking for can’t be found";
    }
}
