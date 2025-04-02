package com.dsa.sample;


public class HashMap <T,M>{





    int defaultSize = 10;

    Node[] table = new Node[defaultSize];


    private int hash(Object key) {

        return key.hashCode();

    }

    private int index(int hashCode) {
        return hashCode % defaultSize;
    }


    public void put(T key, M val) {


        int hashCode = hash(key);

        int index = index(hashCode);

        System.out.println("hashCode for key "+key+"is "+hashCode+" index :"+index);
        Node value = table[index];
        Node newVal = new Node(key, val, hashCode);
        if (value == null) {

            table[index] = newVal;

        } else if (value.key == key) {

            value.val = val;

        } else {

            Node currentVal = value;
            while (currentVal.next != null) {

                currentVal = currentVal.next;
            }
            currentVal.next = newVal;

        }
    }

    public M get(T key) {
        int hashCode = hash(key);
        int index = index(hashCode);
        Node value = table[index];

        if (value.key == (key)) {

            return (M)value.val;

        } else {

            Node current = value;

            while (!(current.key == key)) {
                current = current.next;


            }

            return (M)current.val;


        }


    }


}




class Node<T,M> {

    T key;
    M val;
    int hashCode;
    Node next;

    public Node(T key, M val, int hashCode) {
        this.key = key;
        this.val = val;
        this.hashCode = hashCode;

    }


}