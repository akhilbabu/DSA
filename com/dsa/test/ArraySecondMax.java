package com.dsa.test;

public class ArraySecondMax {
    public static void main(String[] args) {
        int[] array=new int[]{1,33,34,35,22,55};
        int max=array[0];
        int secondMax = 0;
        for (int i = 1; i < array.length; i++) {

         if(array[i]>max){
             secondMax=max;
             max=array[i];

         }



        }
        System.out.println("max "+max+" second max "+secondMax);
    }
}
