package com.anurag.easy;

public class ReducetoZero {
    public static void main(String[] args) {

        System.out.println(Reduce(14,0));

    }


    static int Reduce(int n, int c){

        if(n==0){
            return c;
        }
        if(n%2==0){
            return (Reduce(n/2, c+1));
        }
        return Reduce(n-1,c+1);
    }

}


