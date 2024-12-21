package com.dsa.test;

public class Palindrome {


    public static void main(String[] args) {

        String[] test=new String[]{"m","a","d","a","m"};
        for (int i = 0; i < test.length/2; i++) {

            for (int j = test.length-1; j >test.length-1-(test.length/2) ; j--) {

               if(test[i]!=test[j]){
                   System.out.println("its not palindrome");
               }
            }

        }
    }
}
