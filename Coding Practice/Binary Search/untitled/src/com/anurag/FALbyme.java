package com.anurag;

public class FALbyme {
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,3,5,9,100};
        int n = arr.length;
//        int low = 0;
//        int high = arr.length-1;
        int x =2;
        System.out.println("First occurrence = " + first(arr,0 , n-1, x, n));
        System.out.println("Last occurrence = " + last(arr, 0,n-1,x, n));


    }

    // first occurence of the target value

    public static  int first (int arr[] ,int low , int high , int x, int n ){
        if( high >= low){
            int mid = low + (high - low)/2;
            if (mid ==0 || x> arr[mid-1] && arr[mid]==x  )
                return mid;
            else if(x > arr[mid])
                return first(arr , (mid + 1), high, x ,n);

            else
                return first(arr ,low, (mid-1), x ,n);

        }
        return -1;
    }




    public static int last (int arr[], int low , int high , int x, int n){
        if(high >= low) {
            int mid = low + (high - low) / 2;
            if ((mid== n-1 || x< arr[mid +1] && arr[mid] == x)) {
                return mid;
            }else if(x < arr[mid]){
                return last(arr, low, (mid-1), x, n );
            }else{
                return last (arr, (mid+1), high , x ,n);
            }
        }
        return -1;

    }
}
