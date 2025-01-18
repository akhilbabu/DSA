package com.dsa.test;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array=new int[]{1,3,34,2,4,6,5};
       // System.out.println(array.length);
        for (int i = 0; i < array.length-1; i++) {
          //  System.out.println(i);

            for (int j = 0; j < array.length-1; j++) {
            //    System.out.println("j"+j);
                if(array[j]<array[j+1]){

                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;

                }

            }

        }
        System.out.println(Arrays.toString(array));
    }
}
