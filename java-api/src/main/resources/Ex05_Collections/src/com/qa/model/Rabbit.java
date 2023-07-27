package com.qa.model;

public class Rabbit extends Animal {


    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "Snuffle Snufffle";
    }

    @Override
    public String Move() {
        return "hop hop";
    }

    @Override
    public String toString() {
        return "Rabbit: " + super.toString();
    }

    @Override
    public int compareTo(Animal o) {
        return 0;
    }
}
