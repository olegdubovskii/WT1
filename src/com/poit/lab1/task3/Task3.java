package com.poit.lab1.task3;

import java.util.Scanner;

public class Task3 {

    private static double calculating(double x) {
        return Math.tan(x);
    }

    private static void cycle(double a, double b, double h) {
        while(a<=b) {
            System.out.print(a + " | " + calculating(a) + "\n");
            a+=h;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = scanner.nextDouble();
        System.out.println("Enter b:");
        double b = scanner.nextDouble();
        System.out.println("Enter h:");
        double h = scanner.nextDouble();
        cycle(a, b, h);
    }

}
