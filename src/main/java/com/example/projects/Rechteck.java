package com.example.projects;
public class Rechteck {

    private double height;
    private double width;


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return width * height;
    }
    public void Exit() {
        System.exit(0);
    }
}