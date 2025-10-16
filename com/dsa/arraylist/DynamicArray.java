//package com.dsa.arraylist;

public class DynamicArray {

    int capacity;
    Object[] array;
    int size;

    public DynamicArray() {
        capacity = 10;
        array = new Object[capacity];

    }

    public void add(int index, Object val) {
        if (index > capacity - 1) {


            resizeArray();
        }

        for (int i = 0; i < array.length; i++) {

//System.out.println(i==index);

            if (i == index) {

                Object temp = array[i];
                array[i] = val;
                // System.out.println(array[i]);

                for (int j = i; j < array.length - 1; j++) {

                    Object temp2 = array[j + 1];

                    array[j + 1] = temp;
                    temp = temp2;

                }


            }

        }


    }

    private void resizeArray() {
        this.capacity = 2 * capacity;

        Object[] newArray = new Object[capacity];
        System.arraycopy(array, 0, newArray, 0, array.length);
        this.array = newArray;

    }

    public void add(Object val) {
        //  System.out.println("size "+size);

        if (size == 0) {

            this.array[0] = val;
            size++;
            // System.out.println(array[0]);
        } else {

            for (int i = 0; i <= size; i++) {
                if (this.array[i] == null) {

                    //  System.out.println("i "+i+"val"+val);;
                    this.array[i] = val;
                    //    System.out.println(array[i]);
                }


            }

            size++;
        }

    }


    public void remove(int index) {


        for (int i = 0; i < array.length; i++) {
            if (i == index) {

                for (int j = i; j < array.length - 1; j++) {
                    array[i++] = array[j + 1];
                }

                break;


            }


        }


    }

    public void remove(Object value) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                remove(i);
            }

        }


    }

    public Object get(int index) {

        return array[index];

    }

    public int size() {

        return array.length;

    }


    @Override
    public String toString() {

        String val = "[";

        for (int i = 0; i < array.length - 1; i++) {
            //  if (array[i] != null) {
            val = val + array[i] + ",";
            //   }

        }


        return val.substring(0, val.lastIndexOf(",")) + "]";
    }


}


