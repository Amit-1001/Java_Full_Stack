package DSA;

import java.util.Arrays;
import java.util.Collection;
import java.util.Stack;

public class Question9_reverseStack {

   static Stack<Integer> st = new Stack<>(); // making static because we have to use same reference
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};





        for(int i=0;i<arr.length;i++){
            st.push(arr[i]);
        }

        System.out.println("Before reverse:"+st);

        reverse();


    }

    private static void reverse() {
        Stack<Integer> res = new Stack<>();

        while (!st.isEmpty()){
            int top = st.peek(); // taking top of stack
            st.pop();
            res.push(top); // pushing top in res stack
        }

        System.out.println("After Reverse:"+res);

    }
}
