package com.qa;

public class Main {
    public static void main (String[] args) {
        Rectangle r1 = new Rectangle("rectangle1", "yellow", 0, 0, 10, 10);
        Rectangle r2 = new Rectangle("rectangle2", "green", 2, 2, 5, 2);
        System.out.println(r1);
        System.out.println(r2);

        System.out.println(r1 + ", CentrePoint is: " + r1.getCentrePoint() + ", Area is:" + r1.getArea() + ". Is it square? " + r1.isSquare());
        System.out.println(r2 + ", CentrePoint is: " + r2.getCentrePoint() + ", Area is:" + r2.getArea() + ". Is it square? " + r2.isSquare());

        Circle c1 = new Circle("c1", "red", 0, 0, 10);
        Circle c2 = new Circle("c2", "blue", 10, 10, 5);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1 + ", CentrePoint is: " + c1.getCentrePoint() + ", Area is:" + c2.getArea());
        System.out.println(c2 + ", CentrePoint is: " + c2.getCentrePoint() + ", Area is:" + c2.getArea());

        System.out.println("Circle before moving: "+c1.getCurrentLocation());

        c1.move(10.5,4.3);

        System.out.println("Circle after moving: "+c1.getCurrentLocation());



    }
}
