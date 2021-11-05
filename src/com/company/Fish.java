package com.company;

    public class Fish implements AnimalTransport {

        int nLegs = 0;

        @Override
        public void canSwim() {
            System.out.println("YEAH!");
        }

        @Override
        public void canRun() {
            System.out.println("No...");
        }

        @Override
        public void canFly() {
            System.out.println("Really?");
        }
    }
