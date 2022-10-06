package com.poit.lab1.task2;

import java.util.Scanner;

public class Task2 {

    private static boolean isTrue(double x, double y) {
        if (x<=4 && x>=-4 && y<=5 && y>=-3) {
            return true;
        } else {
            if (x<=6 && x>=-6 && y<=0 && y>=-3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter x:");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println("Enter y:");
        double y = scanner.nextDouble();
        System.out.println(isTrue(x, y));
    }

}
