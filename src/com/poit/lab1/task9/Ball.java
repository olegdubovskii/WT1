package com.poit.lab1.task9;

public class Ball {

    private String colour;
    private double weight;

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public double getWeight() {
        return weight;
    }


    public Ball(String colour, double weight) {
        this.colour = colour;
        this.weight = weight;
    }
}
