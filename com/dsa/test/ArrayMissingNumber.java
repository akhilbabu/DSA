package com.dsa.test;

import java.util.Arrays;

public class ArrayMissingNumber {

    public static void main(String[] args) {
        int[] arra=new int[]{1,2,4,3,5,6,8,9};

        for (int i = 0; i <arra.length ; i++) {
             boolean flag=false;
            for (int j = i; j <arra.length ; j++) {
                if(i+1==arra[j])
                {
                    flag=true;

                }
                if((!flag)&&arra.length-1==j){
                   System.out.println("not foind "+i);
                   break;
                }


            }


        }
    }
}
