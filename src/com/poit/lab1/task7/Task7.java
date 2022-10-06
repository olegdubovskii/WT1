package com.poit.lab1.task7;


import java.util.Scanner;

public class Task7 {

    private static double[] shellSort(double[] arr) {
        int j;
        double tmp;
        for (int k = arr.length / 2; k > 0; k /= 2) {
            for (int i = k; i < arr.length; i++) {
                tmp = arr[i];
                for (j = i; j >= k; j -= k) {
                    if (tmp < arr[j - k]) {
                        arr[j] = arr[j - k];
                    } else {
                        break;
                    }
                }
                arr[j] = tmp;
            }
        }
        return arr;
    }

    private static void printArray(double[] arr) {
        for (double elem : arr) {
            System.out.print((int)elem + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Enter array size:");
        Scanner scanner = new Scanner(System.in);
        double[] arr = new double[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + Math.random() * 100;
        }
        printArray(arr);
        printArray(shellSort(arr));
    }
}
