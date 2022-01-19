package com.anurag.easy;

public class Nto1_2 {


    public static void main(String[] args) {
        Allnum(5);

    }

    static void Allnum(int n){

        if(n>=1) {
//            System.out.println(n);
            Allnum(n - 1);
            System.out.println(n);
        }

    }
}
