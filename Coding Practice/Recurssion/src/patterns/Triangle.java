package patterns;

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
//        Triangle(4, 0);

//        Triangle(4,0);
        int[] arr = {4,3,2,3,1};
        bubble(arr, arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }
 
    static void Triangle2(int r, int c) {

        if (r == 0) {
            return;
        }
        if (r > c) {

            Triangle2(r, c + 1);
            System.out.print("*");

        } else {

            Triangle2(r - 1, 0);
            System.out.println();
        }
    }


        static void Triangle ( int r, int c){

            if (r == 0) {
                return;
            }
            if (r > c) {
                System.out.print("*");
                Triangle(r, c + 1);

            } else {
                System.out.println();
                Triangle(r - 1, 0);
            }
        }

    static void bubble(int[] arr, int r, int c){

        if (r == 0) {
            return  ;
        }
        if (r > c) {

            if(arr[c] > arr[c+1]){
                //swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1]= temp;
            }
            bubble(arr,r, c + 1);

        } else {
            bubble(arr,r - 1, 0);
        }
        return ;
    }



}

