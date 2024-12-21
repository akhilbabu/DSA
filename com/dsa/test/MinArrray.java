package com.dsa.test;

public class MinArrray {

    public static void main(String[] args) {
        int[] in=new int[]{1,11,5,2,7,8};
        int max=in[0];
        int secondMax=in[0];
        for (int i = 1; i < in.length; i++) {
           if(max<in[i])
           {
               secondMax=max;
               max=in[i];
           }else{


           }
        }
        System.out.println("max : "+max+"  second max : "+secondMax);
    }
}
