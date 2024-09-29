package com.dsa.test;

public class MinimumArray {

    public static void main(String[] args) {
        int[] array=new int[]{10,3,2,5};
        int min=array[0];
        for (int i = 1; i < array.length; i++) {
           if(array[i]<min)
           {
               min=array[i];
           }
        }
        System.out.println(min);
    }
}
