package arrays;

public class Sorted {

    public static void main(String[] args) {

        int[] arr = {1,2,4,5,7};
        int index=0;
        System.out.println(sorted(arr, index));


    }

    static boolean sorted(int[] arr, int index){


        if(index == arr.length-1 ){
            return true;
        }

        return (arr[index]< arr[index+1] && sorted(arr, index+1));
    }



}
