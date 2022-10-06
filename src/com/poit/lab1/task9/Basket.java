package com.poit.lab1.task9;

import java.util.ArrayList;

public class Basket {

    private ArrayList<Ball> balls = new ArrayList<>();

    public ArrayList<Ball> getBalls() {
        return balls;
    }

    public void setBalls(ArrayList<Ball> balls) {
        this.balls = balls;
    }
    
    public void addBall(Ball ball) {
        balls.add(ball);
    }


}
