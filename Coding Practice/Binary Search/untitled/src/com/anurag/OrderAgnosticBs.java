package com.anurag;

public class OrderAgnosticBs{
    public static void main(String[] args) {
        int arr[] = {100,96,78,52,44,33,22};
        int target = 78;
        int resultss =orderAgnosticBs(arr , target);
        System.out.println(resultss);


    }

    static  int orderAgnosticBs(int[] arr , int target) {
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
        return -1;
    }
}

