package com.qa.model;

public class Dog extends Animal{


    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "Oh hello you are back. Hello! Hello!" + "I missed you hello";
    }

    @Override
    public String Move() {
        return "Ruuuuuunnnn!";
    }

    @Override
    public String toString() {
        return "Dog: " + super.toString();
    }

    @Override
    public int compareTo(Animal o) {
        return 0;
    }
}
