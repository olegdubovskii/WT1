package com.poit.lab1.task4;

import java.util.Scanner;

public class Task4 {

    private static boolean isSimple(int num){
        for(int i=2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void arrayCheck(int[] arr) {
        for (int i = 2; i<arr.length; i++) {
            if (isSimple(arr[i])) {
                System.out.println(i);
            }
        }
    }

    private static void fillArray(int[] arr) {
        for (int i = 0; i<arr.length; i++) {
            arr[i] = i;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        fillArray(arr);
        arrayCheck(arr);
    }

}
