package com.dsa.test;

import java.util.Arrays;

public class Bubble2 {
    public static void main(String[] args) {
        int[] array=new int[]{2,5,7,4,1};

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j <array.length-i-1 ; j++) {

                if(array[j]>array[j+1])
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;

                    System.out.println(Arrays.toString(array));
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
