package com.qa;

public class Rectangle extends Shape {
    private double height, width;

    public Rectangle (String name, String colour, double x, double y, double height, double width){
        super(name, colour, x, y);
        this.width = width;
        this.height = height;
    }

    public String toString(){
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }

    public boolean isSquare(){
        return (width == height);
    }
    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public Point getCentrePoint() {
        double centreX = getX() + width/2;
        double centreY = getY() + height/2;
        return new Point(centreX, centreY);
    }
}
