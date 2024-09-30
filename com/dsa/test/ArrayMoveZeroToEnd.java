package com.dsa.test;

public class ArrayMoveZeroToEnd {

    public static void main(String[] args) {
        int[] array=new int[]{1,0,4,5,0,4,2,0,1};
        int j=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=0&&array[j]==0){
               int temp=array[j];
               array[j]=array[i];
               array[i]=temp;

            }
            if(array[j]!=0)
            {
                j++;
            }

        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}
