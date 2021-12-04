package Assignment4;

import java.util.Arrays;

public class addTwoMatrix {

    public static void main(String[] args) {
        int[][] mat1 = {{1,2,3},{4,5,6}};
        int[][] mat2 = {{0,0,0},{0,0,0}};

        int[][] ans = new int[2][3];

        for (int i =0; i<mat1.length;i++){
            for(int j =0; j<mat2[0].length;j++){
                ans[i][j] = mat1[i][j] + mat2[i][j]; // adding two matrix
            }
        }


        for (int[] a:ans){
            System.out.println(Arrays.toString(a));
        }
    }
}
