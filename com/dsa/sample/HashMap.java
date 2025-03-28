package com.dsa.sample;


class HashMap {


    Node firstNode;

    public void put(int key, int val) {

        if (firstNode == null) {

            firstNode = new Node(key, val);

        } else {

            Node nextNode = firstNode;

            while (nextNode.next != null) {

                nextNode = nextNode.next;


            }
            nextNode.next = new Node(key, val);

        }


    }

    public int get(int key) {


        Node next = firstNode;

        while (Integer.valueOf(next.key).hashCode() != Integer.valueOf(key).hashCode()) {

            next = next.next;

        }

        return next.value;


    }


}


class Node {


    int hasCode;
    int key;
    int value;

    Node next;

    public Node(Integer key, int val) {
        this.key = key;
        this.value = val;
        this.hasCode = key.hashCode();


    }


}


