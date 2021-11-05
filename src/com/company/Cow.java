package com.company;

public class Cow implements AnimalTransport {

    int nLegs = 4;

    @Override
    public void canSwim() {
        System.out.println("Yeah!");
    }

    @Override
    public void canRun() {
        System.out.println("Hell yeaah!");
    }

    @Override
    public void canFly() {
        System.out.println("Dude seriously?");
    }
}
