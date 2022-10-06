package com.poit.lab1.task8;

public class Task8 {

    private static double[] mergeArrays(double[] arr1, double[] arr2) {
        double[] resultArr = new double[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        while (i<arr1.length && j<arr2.length) {
            if (arr1[i]>arr2[j]) {
                System.out.println(i+j);
                resultArr[i+j] = arr2[j];
                j++;
            } else {
                resultArr[i+j] = arr1[i];
                i++;
            }
        }
        while (i<arr1.length) {
            resultArr[i+j] = arr1[i];
            i++;
        }
        while (j<arr2.length) {
            System.out.println(i+j);
            resultArr[i+j] = arr2[j];
            j++;
        }
        return resultArr;
    }

    private static void printArray(double[] arr) {
        for (double elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        double[] arr1 = {4.0, 6.0, 9.0, 14.0, 21.0};
        double[] arr2 = {2.0, 3.0, 5.0, 8.0, 8.5, 10.0, 13.0, 16.0, 18.0};
        printArray(mergeArrays(arr1, arr2));
    }
}
