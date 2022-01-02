package com.anurag;

public class RandomNumber {



    static int arr[]= {1,2,3,4,3,4,5};

    public static void main(String[] args) {
        int i;
        int count=0;
        for(i=0; i<arr.length; i++){
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count= count +1;
                }
            }
        }
        System.out.println(count);
    }
    //Time complexity n2
}
