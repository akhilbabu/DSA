package com.dsa.sample;

public class RunnerHashMap {

    public static void main(String[] args) {
        HashMap map=new HashMap();
        map.put(1,2);
        map.put(2,3);
        map.put(3,4);

       System.out.println( map.get(3));
        System.out.println( map.get(2));
        System.out.println( map.get(1));
        map.put(1,3);
        map.put(2,2);
        map.put(3,1);
        map.put(4,3);
        map.put(5,2);
        map.put(6,1);
        map.put(7,3);
        map.put(8,2);
        map.put(9,1);
        map.put(10,3);
        map.put(11,2);
        map.put(12,12);
        System.out.println( map.get(3));
        System.out.println( map.get(2));
        System.out.println( map.get(12));
    }
}
