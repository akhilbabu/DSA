package com.dsa.test;

public class MissingNumberArray {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 4, 5, 6};
        int valueOfN = array.length + 1;
        int sumOfN = (valueOfN * (valueOfN + 1)) / 2;
        for (int i = 0; i < array.length; i++) {

            sumOfN=sumOfN-array[i];
        }
        System.out.println(sumOfN);
    }







}
