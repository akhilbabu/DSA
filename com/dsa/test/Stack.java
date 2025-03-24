package com.dsa.test;

import java.util.Arrays;

public class Stack {

    int top = 0;
    int[] stack = new int[5];

    public void push(int i) {
        stack[top] = i;
        top++;

    }

    public int pop() {
        int i = stack[top - 1];
        stack[top - 1]=0;
        top--;
        return i;
    }
    public int peek() {
      return stack[top - 1];

    }


    public void show() {

       System.out.println( Arrays.toString(stack));

    }
}
