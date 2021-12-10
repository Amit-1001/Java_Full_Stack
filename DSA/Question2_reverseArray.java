package DSA;

import java.util.Arrays;

public class Question2_reverseArray {

    static    int[] arr = {1,2,3,4,5}; // static array

    public static void main(String[] args) {

        System.out.println("Array before reverse:");
        System.out.println(Arrays.toString(arr));
        int start =0;
        int end = arr.length-1;

        // two pointer approach
        while (start<end){
            swap(start,end);

            start++;
            end--;
        }

        System.out.println("Array After reverse:");
        System.out.println(Arrays.toString(arr));


    }

    private static void swap(int start, int end) {
        int temp = arr[start];
        arr[start]  = arr[end];
        arr[end] =temp;
    }
}
