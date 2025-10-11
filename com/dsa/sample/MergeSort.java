package com.dsa.sample;



class MergeSort {


    public static void main(String[] args) {


        int[] array = new int[]{3, 2, 4, 5, 2, 1};
        //3 2 4    // 5 2 1

        //3 //2 4     //5 //2 1

        //2 //4       //2 //1


        splitAndMerge(array, 0, array.length - 1);


    }

    public static void splitAndMerge(int[] array, int l, int r) {

     //   System.out.println(l + "L   R" + r);
        int mid = (l + r) / 2;

        if (l < r) {



            splitAndMerge(array, l, mid );
            splitAndMerge(array, mid+1, r);

            merge(array, l, mid, r);
        }
    }

    public static void merge(int[] array, int l, int mid, int r) {


      //  System.out.println(l + "L   R" + r + "MID"+mid);
        int[] la = new int[mid +1];
        int[] ra = new int[r-mid];

        for (int x = 0; x < mid+1; x++) {
            la[x] = array[x];

        }

        for (int y = mid+1 ;y <=r; y++) {
            ra[y] = array[y];

        }

        for (int a : la) {
            System.out.println("LA STARTS");
            System.out.println(a);
            System.out.println("LA ENDS");
        }
        for (int a : ra) {
            System.out.println("RA STARTS");
            System.out.println(a);
            System.out.println("RA ENDS");
        }


    }


}

