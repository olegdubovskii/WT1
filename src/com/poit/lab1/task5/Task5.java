package com.poit.lab1.task5;

public class Task5 {

    public static int countElemsToThrowOut(int[] arr){
        int counter = 0;
        int maxElem = arr[0];
        for(int elem : arr) {
            if (elem >= maxElem) {
                maxElem = elem;
            } else {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 5, 3, 4, 7, 8};
        System.out.println(countElemsToThrowOut(arr) + " elements to throw out");
    }
}
