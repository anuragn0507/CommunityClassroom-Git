package com.anurag.inheritance;

public class Fibo2 {
    public static void main(String[] args){

        System.out.println(Fibo2(25));

    }

    static int Fibo2(int n){

        if(n==0 || n==1){
            return n;
        }
        return (Fibo2(n-1)+ Fibo2(n-2));
    }
}
