package Assignment4;

import java.util.Arrays;

public class matrixTranspose {


    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};


        System.out.println("Before Transpose");
        for (int[] a:matrix){
            System.out.println(Arrays.toString(a));
        }

        transpose(matrix);
        System.out.println("After Transpose");

       for (int[]a:matrix){
           System.out.println(Arrays.toString(a));
       }

    }

    private static void transpose(int[][] matrix) {

        // changing rows in columns and columns in row
        for(int i=0; i< matrix.length;i++){
            for (int j =i+1;j<matrix[i].length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }
}
