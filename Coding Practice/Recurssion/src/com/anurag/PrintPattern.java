package com.anurag;


public class PrintPattern {
    public static void main(String[] args){
        int n=16;
        printp(n,n,true);
    }

    static void printp(int n, int m , boolean flag)
    {
        System.out.print(m + " ");
        if(flag== false && n==m)
            return;

        if (flag){
            if(m-5>0){
                 printp(n, m-5, true);
            }
            else {
                 printp(n, m-5,false);
            }
        }
        else{
             printp(n,m+5, false);
        }
    }
}


