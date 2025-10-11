package com.dsa.test;

public class Runner3 {

    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.enque(2);
        queue.enque(3);
        queue.show();
        queue.deque();
        queue.show();
    }
}
