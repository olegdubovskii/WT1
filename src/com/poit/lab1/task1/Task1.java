package com.poit.lab1.task1;

import java.util.Scanner;

public class Task1 {

    private static double calculate(double x, double y) {
        return (1+Math.pow(Math.sin(x+y), 2))/(2+Math.abs(x - (2*x/(1+Math.pow(x, 2)*Math.pow(y,2))))) + x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x:");
        double x = scanner.nextDouble();
        System.out.println("Enter y:");
        double y = scanner.nextDouble();
        System.out.println(calculate(x, y));
    }

}
