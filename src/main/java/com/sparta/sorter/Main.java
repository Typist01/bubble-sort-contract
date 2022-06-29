package com.sparta.sorter;

import java.util.Arrays;

public class Main implements Sorter {

    public static int[] intArray = {1, 3, 2, 65, 56, 3, 1, 3, 6};

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public int[] sortArray(int[] inputArray){
        int temp;
        boolean arraySorted = true;
        while (arraySorted) {
            arraySorted = false;
            for (int i = 0; i < inputArray.length - 1; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    temp = inputArray[i + 1];
                    inputArray[i + 1] = inputArray[i];
                    inputArray[i] = temp;
                    arraySorted = true;
                }
            }
        }
        return inputArray;
    }

}