package DSA;

import java.util.ArrayList;

public class Question1_pairOfSum {

    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8,10,7,12,0,5};
        int sum = 7;
        ArrayList<ArrayList> res = new ArrayList<>(); // to store pair of integer which value is equal to sum
        ArrayList<Integer> found; // to store these number

        for(int i=0; i<arr.length;i++){
            found = new ArrayList<>();
            for(int j =i+1; j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    found.add(arr[i]);
                    found.add(arr[j]);
                    res.add(found); // adding pair in res
                }
            }

        }
        System.out.print("All Pairs whose sum is "+sum+":");
        System.out.print(res);
    }
}
