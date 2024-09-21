package com.dsa.test;

public class ArrayUtils {

    public static void main(String[] args) {
        int[] test={1,2,3,4};
        for (int i = 0; i < test.length; i++) {
           if(test[i]%2==0){
               test[i]=0;
           }
        }
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }

    }
}
