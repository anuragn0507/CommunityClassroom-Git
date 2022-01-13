package com.anurag.easy;

public class Reverse {
    public static void main(String[] args) {

        System.out.println(rev2(2345));
    }

    //1 what mistake i am doing here is i am not taking the sum variable as static
    //2 I am printing the sum in the function itself you have to print the sum in main function

    static int sum=0;

    static void reverse(int n){

        if( n==0){
            return;
        }
        int rem = n%10;
        sum = sum * 10 + rem;
        reverse(n/10);

        // System.out.println(sum);
        // Do not print the function here in the function if you print here it will print the sum n times, means as many times
        //the the function is recusively called in the function

    }

    static int rev2(int n){
        // somtimes you might need some additional variables in the argument
        // in that case, make another function
        int digits = (int) (Math.log10(n)) + 1;

        return helper(n, digits);

    }

    private static int helper(int n, int digits) {
        if (n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10,digits-1) +helper(n/10,digits-1));

    }

}
