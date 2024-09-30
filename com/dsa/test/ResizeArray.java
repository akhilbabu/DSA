package com.dsa.test;

public class ResizeArray {

    public static void main(String[] args) {
        int[] array=new int[]{1,2};
        int[] reSize = reSize(array, 4);
        System.out.println(reSize.length);
    }

    public static int[] reSize(int[] array, int targetLength){
        int[] newArray=new int[targetLength];
        for (int i = 0; i < array.length; i++) {
         newArray[i]=array[i];
        }
   return newArray;
    }
}
