package com.anurag.easy;

public class Reverse {
    public static void main(String[] args) {

        reverse(789456);
        System.out.println(sum);
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

}
