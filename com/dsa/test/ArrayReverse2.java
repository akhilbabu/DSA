package com.dsa.test;

import java.util.Arrays;

public class ArrayReverse2 {

    public static void main(String[] args) {

        
                int[] in=new int[]{2,11,5,10,7,8};
        int length = in.length;
        int[] finalV=new int[length];
        int j=0;
                for(int i = length -1; i>=0; i--){

                    finalV[j]=in[i];
                    j++;
                }

                System.out.println(Arrays.toString(finalV));
    }
}
