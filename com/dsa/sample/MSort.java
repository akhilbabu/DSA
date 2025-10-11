package com.dsa.sample;

class MSort {


    public static void main(String[] args) {


        int[] array = new int[]{3, 2, 4, 5, 2, 1,11,22,33,44,6,4,68,9};

        sort(array, 0, array.length - 1);

        for (int a : array) {

            System.out.print(a+" ");

        }


    }


    private static void sort(int[] array, int left, int right) {


        if (left >= right) {
            return;
        }

        int mid = (left + right) / 2;

        sort(array, left, mid);
        sort(array, mid + 1, right);
        merge(array, left, mid, right);


    }

    private static void merge(int[] array, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftA = new int[n1];
        int[] rightA = new int[n2];

        int k = left;
        int j = 0;
        int i = 0;

        for (int x = 0; x < n1; x++) {
            leftA[x] = array[left + x];

        }
        for (int y = 0; y < n2; y++) {
            rightA[y] = array[mid + 1 + y];

        }

//3 1   //1 2

        while (i < n1 && j < n2) {

            if (leftA[i] > rightA[j]) {

                array[k] = rightA[j];
                j++;
            } else {


                array[k] = leftA[i];
                i++;

            }

            k++;


        }

        while (i < n1) {

            array[k] = leftA[i];
            i++;
            k++;


        }

        while (j < n2) {

            array[k] = rightA[j];
            j++;
            k++;


        }


    }


}
