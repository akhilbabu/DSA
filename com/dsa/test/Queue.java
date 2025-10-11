package com.dsa.test;

import java.util.Arrays;

public class Queue {
    int f=0;
    int r=0;

    int[] queue=new int[5];

    public void enque(int val){
       queue[r]=val;
       r++;

    }

    public int deque(){
        int val=queue[f];
        queue[f]=0;
        f++;
        return val;

    }


    public void show() {


            System.out.println(Arrays.toString(queue));


    }
}
