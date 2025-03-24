package com.dsa.test;

public class Runner {

    public static void main(String[] args) {
        List l = new List();
        l.add(1);
        l.add(3);
        l.add(3);
        //  System.out.println(l);

        l.insertAtStart(9);
        l.insertAtStart(8);

        l.insertAt(1, 55);
        l.insertAt(2, 66);

        // l.show();


        l.deleteAt(3);
        l.deleteAt(0);

        l.show();
    }
}
