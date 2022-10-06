package com.poit.lab1.task9;

public class BasketCalculation {

    private Basket basket;

    public BasketCalculation(Basket basket) {
        this.basket = basket;
    }

    public double calculateBallsWeight() {
        double ballsWeight = 0;
        for (Ball ball: basket.getBalls()) {
            ballsWeight+=ball.getWeight();
        }
        return ballsWeight;
    }

    public int calculateBlueBalls() {
        int blueBallsCounter = 0;
        for (Ball ball:basket.getBalls()) {
            if (ball.getColour().equals("Blue")) {
                blueBallsCounter++;
            }
        }
        return blueBallsCounter;
    }

    public static void main(String[] args) {
        Basket basket = new Basket();
        Ball ball1 = new Ball("Blue", 3.0);
        Ball ball2 = new Ball("Blue", 4.0);
        Ball ball3 = new Ball("Red", 3.5);
        basket.addBall(ball1);
        basket.addBall(ball2);
        basket.addBall(ball3);
        BasketCalculation basketCalculation = new BasketCalculation(basket);
        System.out.println("Weight of balls: " + basketCalculation.calculateBallsWeight());
        System.out.println("Count of blue balls: " + basketCalculation.calculateBlueBalls());
    }
}
