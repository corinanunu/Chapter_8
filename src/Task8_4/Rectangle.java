package com.company.Task8_4;

public class Rectangle {
    private double length = 1;
    private double width = 1;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length < 0.0 && length >= 20.0) {
            this.length = length;
        }else{
            throw new IllegalArgumentException("Length must be 0.0-20.0");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width > 0.0 && width <= 20.0) {
            this.width = width;
        }else{
            throw new IllegalArgumentException("Width must be 0.0-20.0");
        }
    }

    public double getArea(double width, double length){
        return width * length;
    }

    public double getPerimeter(double width, double length){
        return ((width*2)+(length*2));
    }
}