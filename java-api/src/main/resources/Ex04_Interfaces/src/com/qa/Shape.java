package com.qa;

public abstract class Shape {
    private String name;
    private String colour;
    private double x,y;
    public Shape(String name, String colour, double x, double y){
        this.name = name;
        this.colour = colour;
        this.x=x;
        this.y=y;
    }

    public double getX(){
        return x;
    }

    public void setX (double x){
        this.x=x;
    }

    public double getY(){
        return y;
    }

    public void setY (double y){
        this.y=y;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getColour(){
        return colour;
    }

    public void setColour(String colour){
        this.colour=colour;
    }
    public String toString(){
        return "Point [x="+x+", y="+y+"]";
    }

    public abstract double getArea();
    public abstract Point getCentrePoint();
}
