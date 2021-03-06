package arrays;

public class RBS {
    public static void main(String[] args) {

        int[] arr= {5,6,7,8,9,1,2,3};
        System.out.println(search(arr,5,0,arr.length-1));

    }

    static int search(int[] arr,int target,int s, int end) {

        if (s > end) {
            return -1;
        }

        int m = s + (end - 1) / 2;
        if (m == target) {
            return m;
        }

        if(arr[s]<= arr[m]) {
            if (target >= arr[s] && target <= arr[end]) {
                return search(arr, target, s, m - 1);
            } else {
                return search(arr, target, m + 1, end);
            }
        }

        if(target >= arr[m] && target<=arr[end]){
            return search(arr,target,m+1,end);
        }
        return search(arr,target,s,m-1);


    }
}
