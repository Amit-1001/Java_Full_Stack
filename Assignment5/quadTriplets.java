package Assignment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class quadTriplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Enter size of Array:");
        int size = in.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements for array");
        for(int i=0; i<size;i++){
            arr[i] = in.nextInt();
        }

        System.out.println("Find sum:");
        int sum = in.nextInt();

        Object[] res;

        res = findSum(arr,sum);

        System.out.println(Arrays.toString(res));




    }

    private static Object[] findSum(int[] arr, int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>(new ArrayList<>());

        for(int i=0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                for(int k = j+1;k<arr.length;k++){
                    for(int l = k+1; l<arr.length;l++){

                        ArrayList<Integer> found = new ArrayList<>();
                        if(arr[i]+arr[j]+arr[k]+arr[l]==sum){
                            found.add(arr[i]);
                            found.add(arr[j]);
                            found.add(arr[k]);
                            found.add(arr[l]);
                            res.add(found);
                        }
                    }
                }
            }
        }
        return res.toArray();
    }
}
