package com.dsa.test;

public class Runner2 {

    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(2);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        stack.show();
    }
}


