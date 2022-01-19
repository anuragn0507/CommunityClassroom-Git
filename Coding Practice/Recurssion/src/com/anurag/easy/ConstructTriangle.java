package com.anurag.easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ConstructTriangle {

    public static void printTrianle(int[] A){

        //Base condition
        if (A.length <1){
            return;
        }

        // Create a new array

        int[] temp = new int[A.length-1];

        //contains sum of consecutive elements in the array passes parameters

        for (int i = 0; i < A.length-1; i++) {
            int x = A[i]+ A[i+1];
            temp[i]= x;
        }
        //Make a recursive call and pass the new created array
        printTrianle(temp);

        System.out.println(Arrays.toString(A));

    }

    public static void main(String[] args) {
        int[] A= {1,2,3,556,4};
        printTrianle(A);
    }
}

//ConstructTriangle
//ConstructTriangle
//ConstructTriangle
