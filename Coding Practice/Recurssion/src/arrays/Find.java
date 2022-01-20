package arrays;

public class Find {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,7,54};
        System.out.println(find(arr,54,0));


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



}
