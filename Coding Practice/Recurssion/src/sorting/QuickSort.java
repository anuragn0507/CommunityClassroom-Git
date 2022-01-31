package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,7,8,3,1,5,7,9};
        Quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void Quick(int[] arr, int low, int high) {

        if(low >= high){
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start)/2;
        int p = arr[mid];

        while (start <= end){
            while (arr[start] < p){
                start++;
            }
            while (arr[end] > p){
                end--;
            }
            if(start <= end){
                int temp = arr[start];
                arr[start]= arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        Quick(arr, low, end);
        Quick(arr,start,high);
    }
}
