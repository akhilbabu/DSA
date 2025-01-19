package com.dsa.test;

import java.util.Arrays;

public class insertionSort {

    public static void main(String[] args) {

        int[] array = new int[]{3,31, 34, 1, 2, 4, 6, 5};

        for (int i = 1; i < array.length; i++) {

         int key=  array[i];
         int j=i-1;
         while(j>=0&&array[j]>key){
           array[j+1]=array[j];
           array[j--]=key;

         }



        }
        System.out.println("final: " + Arrays.toString(array));
    }


}
