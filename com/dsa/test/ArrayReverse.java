package com.dsa.test;

public class ArrayReverse {

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4,5};
        reverseArray(test,0,4);


        for (int k = 0; k < test.length; k++) {
            System.out.println(test[k]);
        }

    }

    private static void reverseArray(int[] input, int start, int end) {
        while (start < end) {

            int temp=input[start];
            input[start]=input[end];
            input[end]=temp;
            start++;
            end--;

        }
    }
}
