package com.dsa.test;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 7, 11, 13, 14};
        int target = 13;
        binarySearch(array,target);


    }

    private static void binarySearch(int[] array,int target) {
        int start = 0;
        int end = array.length - 1;



        while (start <= end) {
            int mid = (start + end) / 2;
          //  System.out.println(mid);
            if (array[mid] == target) {
                System.out.println(mid + " : " + target);
                break;
            } else if (array[mid] > target) {

                end = mid - 1;
            } else {

                start = mid + 1;
            }


        }
    }
}
