package com.qa.model;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "Oh it's you. Hello!. " + getName();
    }

    @Override
    public String Move() {
        return "if you insist..";
    }

    @Override
    public String toString() {
        return "Cat: " + super.toString();
    }

    @Override
    public int compareTo(Animal o) {
        return 0;
    }
}
