package com.dsa.test;

public class List {

    Node firstNode;


    public void add(int i) {

        Node node = new Node();
        node.setVal(i);


        if (firstNode == null) {

            firstNode = node;
        } else {
            Node head = firstNode;
            while (head.next != null) {
                head = head.next;
            }
            head.next = node;

        }

    }

    @Override
    public String toString() {
        return "List{" +
                "firstNode=" + firstNode +
                '}';
    }


    public void show() {
        Node node = firstNode;
        System.out.println(node.val);
        while (node.next != null) {
            node = node.next;
            System.out.println(node.val);
        }
    }


    public synchronized void insertAtStart(int i) {

        Node node = new Node();
        node.setVal(i);
        node.next=firstNode;
        firstNode = node;


    }

    public void insertAt(int index, int value) {
        if (index == 0) {
            insertAtStart(value);
        } else {

            //0,1,2

            Node indexNode = firstNode;
            Node p = firstNode;
            for (int i = 0; i < index; i++) {
                p = indexNode;
                indexNode = indexNode.next;

            }
            Node node = new Node();
            node.setVal(value);
            node.setNext(indexNode);

            p.setNext(node);


        }
    }

    public void deleteAt(int i) {

        if (i == 0) {
            firstNode = firstNode.next;

        } else {
            Node node = firstNode;
            Node previous = firstNode;
            for (int j = 0; j < i; j++) {
               previous=node;
               node=node.next;
            }
            previous.setNext(node.next);

        }


    }
}
