package com.dsa.test;

import java.util.Arrays;

public class ArrayMoveZero {

    public static void main(String[] args) {
        //move zero by maintaining  the order
        int[] array=new int[]{1,0,3,0,2,0,3,4,2,0};
        int[] array2=new int[array.length];
        for (int i = 0; i < array.length-1 ; i++) {
            for (int j = i; j <array.length-1 ; j++) {

               if(array[j]==0 && array[j+1]!=0)
               {
                   int temp=array[j];
                   array[j]=array[j+1];
                   array[j+1]=temp;
               }

            }

        }
        System.out.println("final Array : {}"+ Arrays.toString(array));
    }
}
