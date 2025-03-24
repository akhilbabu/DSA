package com.dsa.test;

import java.util.Arrays;

public class Insertion2 {

    public static void main(String[] args) {

        int[] array=new int[]{6,5,2,8,9,4};


        for (int i = 1; i < array.length; i++) {

            int key=array[i];
            int j=i-1;
            while (j>=0&& array[j]>key)
            {
                array[j+1]=array[j];
                j--;

            }
            array[j+1]=key;


        }
        System.out.println(Arrays.toString(array));



    }
}
