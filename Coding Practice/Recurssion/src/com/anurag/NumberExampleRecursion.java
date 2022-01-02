package com.anurag;

public class NumberExampleRecursion {

    public static void main (String [] args){
        print(1);
    }

    static void print(int n){
         // don't forget to put the base condition

        if( n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);

    }
}
