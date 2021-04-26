package com.dstanton;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] myArray = {10, 20, 30, 40, 50, 60};

        System.out.println("myArray before reverse. " + Arrays.toString(myArray));

        reverseArray(myArray);

        System.out.println("myArray after reverse. " + Arrays.toString(myArray));
    }

    public static void reverseArray(int[] array) {
        int swap;

        for (int x = 0; x < array.length / 2; x++){
            swap = array[x];
            array[x] = array[array.length-x-1];
            array[array.length-x-1] = swap;
        }

//        int[] swap = new int[array.length];
//
//        for (int x = 0; x < array.length; x++) {
//            swap[array.length - x - 1] = array[x];
//        }
//
//        for (int x = 0; x < array.length; x++) {
//            array[x] = swap[x];
//        }

    }
}