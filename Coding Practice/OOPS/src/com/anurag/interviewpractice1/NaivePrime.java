package com.anurag.interviewpractice1;

import java.util.Scanner;

public class NaivePrime {

    static boolean isPrime(int n){

        // check if number is less than and equal to 1
        // is equals to 2 than its a prime number
        // if n is divisible by 2 then its not a prime number
        // for i=3 to i<=Math.sqrt(n) n%i==0
        // otherwise return it as true

        if(n<=1)
            return false;

        else if (n==2)
            return true;

        else if (n%2==0)
            return false;

        for (int i = 3; i <= Math.sqrt(n); i +=2) {
            if(n % i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number");
        int n = input.nextInt();


        if(isPrime(n)){
            System.out.println("Is a prime number ");
        }
        else {
            System.out.println("Its not a prime number ");
        }

    }

}
