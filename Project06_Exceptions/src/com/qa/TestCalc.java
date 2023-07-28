package com.qa;

public class TestCalc {
    public static void main(String[] args) {
        BadCalc bc = new BadCalc();
        /*System.out.println("Mult result: " + bc.mult(2, 3));
        System.out.println("Div result: " + bc.div(6, 0));*/
        try {
            // Something that may throw an exception
            System.out.println("Div result: " + bc.div(6, 0));
        } catch (ArithmeticException ae) {
            // Do something about the exception if one is raised
            System.out.println("Calculation error caught");

        }
    }
}
