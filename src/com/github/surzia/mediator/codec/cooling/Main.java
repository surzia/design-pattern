package com.github.surzia.mediator.codec.cooling;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        Button button = new Button();
        PowerSupplier powerSupplier = new PowerSupplier();
        Mediator mediator = new Mediator();

        mediator.setButton(button);
        mediator.setFan(fan);
        mediator.setPowerSupplier(powerSupplier);

        button.setMediator(mediator);
        fan.setMediator(mediator);

        System.out.println(fan.isOn());

        button.press();
        System.out.println(fan.isOn());

        button.press();
        System.out.println(fan.isOn());
    }
}
