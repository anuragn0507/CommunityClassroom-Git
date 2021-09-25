package com.anurag;

public class Floor {
    public static void main(String[] args) {
        int arr[] = {3,5,8,9,45,56,89,99,100};
        int target = 78;
        int resultss = floor(arr , target);
        System.out.println(resultss);



    }

    static  int floor(int[] arr , int target) {
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
        return end;
    }
}

