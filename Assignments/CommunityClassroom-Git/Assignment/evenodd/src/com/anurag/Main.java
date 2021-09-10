package com.anurag;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	/*
	Take all the 3 input
	  if n1<n2<n3 = max= n3
	  elif n2<n1<n3 = max = n3
	  elif n2<n3<n1 = max = n1
	  elif n3<n2<n1 = max = n1
	  elif n1<n3<n2 = max = n2
	  elif n3<n1<n2 = max = n2

	 */


        Scanner input = new Scanner(System.in);
        System.out.println("n1 ki value type kar do ");
        int first = input.nextInt();
        System.out.println("n2 ki value type kar do ");
        int second = input.nextInt();
        System.out.println("n3 ki value tpe kar do ");
        int third = input.nextInt();

        int largest  = largest ( first ,  second ,  third);
        int smallest = smallest( first ,  second ,  third);

        System.out.printf("largest of three numers %d, %d, and %d is : %d %n", first, second , third , largest);
        System.out.printf("smallest of three numers %d, %d, and %d is : %d %n", first, second , third , smallest);


    }


        public static int largest(int first, int second , int third){
            int max = first;
            if(second > max){
                max = second;
            }
            if (third > max){
                max = third;
            }
            return max;
        }


        public  static int smallest(int first ,int second , int third){
        int min = first;
        if (second <min){
            min = second;
        }
        if (third<min){
            min= third;
        }
        return  min;
        }










}

