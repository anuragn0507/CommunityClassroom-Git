package com.anurag;

public class Ceiling{
    public static void main(String[] args) {
        int arr[] = {3,5,8,9,45,56,89,99,100};
        int target = 74;
        int resultss = ceiling(arr , target);
        System.out.println(resultss);



    }
    //return the index of smallest  no >= target
    static  int ceiling(int[] arr , int target) {

        //What if the target is greater than the greatest number inn the array
        if (target > arr[arr.length -1]){
            return  -1;
        }
        int start = 0;
        int end = arr.length - 1;

        //find wheather the array is ascending or not

        boolean isAsc;
        if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }

        // find the middle element
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // if mid == target
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return start;
    }
}

