package com.dsa.test;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 34, 2, 4, 6, 5};


        int index = -1;

        for (int i = 0; i < array.length - 1; i++) {
            int big = array[0];
            for (int j = 1; j < array.length - i; j++) {

                if (array[j] > big) {
                    big = array[j];
                    index = j;
                //    System.out.println("big:" + big + "i" + i);
                }
            }
            if (index >= 0) {
                int temp = array[array.length - 1 - i];
                array[array.length - 1 - i] = big;
                array[index] = temp;
                index = -1;
                System.out.println(Arrays.toString(array));
            }

        }
        System.out.println("final: " + Arrays.toString(array));
    }
}
