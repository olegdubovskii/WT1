package com.poit.lab1.task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task6 {

    private static double[][] makeMatrix(ArrayList<Double> arr) {
        double[][] matrix = new double[arr.size()][arr.size()];
        for (int i = 0; i<arr.size(); i++) {
            for (int j = 0; j<arr.size(); j++) {
                matrix[i][j] = arr.get(j);
            }
            Collections.rotate(arr, -1);
        }
        return matrix;
    }

    private static void printMatrix(double[][] matrix) {
        for (int i = 0; i<matrix.length; i++) {
            for (int j = 0; j<matrix.length; j++) {
                System.out.print((int)matrix[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        ArrayList<Double> arr = new ArrayList<>();
        System.out.println("Enter array size:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i<n+1; i++) {
            arr.add((double)i);
        }
        double[][] matrix = makeMatrix(arr);
        printMatrix(matrix);
    }
}
