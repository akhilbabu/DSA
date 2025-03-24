package com.dsa.test;

import java.util.Arrays;

public class Selction2 {

    public static void main(String[] args) {

        int[] array=new int[]{6,5,2,8,9,4};

        for (int i = 0; i < array.length; i++) {

            int maxIndex=0;
            for (int j = 0; j < array.length-i; j++) {

                if(array[maxIndex]<array[j])
                {
                    maxIndex=j;
                }

            }
            System.out.println(Arrays.toString(array));
            int temp= array[array.length-i-1];
            array[array.length-i-1]=array[maxIndex];
            array[maxIndex]=temp;


        }
        System.out.println(Arrays.toString(array));

    }
}
