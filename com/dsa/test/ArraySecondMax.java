package com.dsa.test;

public class ArraySecondMax {
    public static void main(String[] args) {
        int[] array=new int[]{1,33,34,35,22,55};
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max)
            {
                secondMax=max;
                max=array[i];

            }else if(array[i]>secondMax) {

                secondMax=array[i];
            }

        }
        System.out.println("max"+max+" second max "+secondMax);
    }
}
