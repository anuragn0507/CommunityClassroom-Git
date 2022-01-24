package arrays;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,7,54,5,5};
//        System.out.println(find(arr,54,0));
//        System.out.println(findAllIndex(arr,5,0, new ArrayList<Integer>()));

        System.out.println(findAllIndex2(arr,4,0));


    }

    static boolean find(int[] arr, int target, int index){

        if(index == arr.length){
            return false;
        }

        return (arr[index] == target || find(arr,target,index+1) );
    }

    static int findIndex(int[] arr, int target, int index){

        if(index == arr.length){
            return index;
        }
        if(arr[index] == target ){
            return index;
        }else {

            return findIndex(arr, target, index + 1);
        }
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target,int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if (arr[index]== target){
            list.add(index);
        }
        return findAllIndex(arr, target,index+1   ,list);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target,int index){

        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }

        // this will contain answer for that funtion call only
        if (arr[index]== target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls =  findAllIndex2(arr, target,index+1 );

        list.addAll(ansFromBelowCalls);
        return list;
    }



}
